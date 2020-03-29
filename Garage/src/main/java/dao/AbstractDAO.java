package dao;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.ConnectionFactory;

import javax.swing.*;


public class AbstractDAO<T> {
    protected static final Logger LOGGER = Logger.getLogger(AbstractDAO.class.getName());

    private final Class<T> type;

    @SuppressWarnings("unchecked")
    public AbstractDAO() {
        this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    }

    private String createSelectQuery(String field) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append("garage." + type.getSimpleName());
        sb.append(" WHERE " + field + " =?");
        return sb.toString();
    }

    private String createDeleteQuery(String field) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append("garage." + type.getSimpleName());
        sb.append(" WHERE " + field + "= ?");
        return sb.toString();
    }
    private String createFindAllQuery() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append("garage."+type.getSimpleName());
        return sb.toString();
    }
    private String createInsertQuery() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT ");
        sb.append("INTO ");
        sb.append("garage." +type.getSimpleName());
        int i = 0;
        for(Field fields: type.getDeclaredFields()){

            if(i == 0){
                sb.append(" VALUES("+"?"+",");
            }
            else{
                if(i!=type.getDeclaredFields().length-1)
                    sb.append("?"+",");
                else
                    sb.append("?"+")");
            }
            i++;
        }
        return sb.toString();
    }
    private String createUpdateQuery(){
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append("garage." +type.getSimpleName());
        sb.append(" SET ");
        for(Field fields: type.getDeclaredFields()){
            sb.append(fields.getName()+"="+"?"+",");
        }
        sb.delete(sb.length()-1,sb.length());
        sb.append(" WHERE id=?");

        return sb.toString();
    }
    public String[] col(List<T> objects){
        Object o = objects.get(0);
        int j = 0;
        //se preiau headerele
        for(Field fields: o.getClass().getDeclaredFields()) {
            fields.setAccessible(true);
            j++;
        }

        String[] col = new String[j];
        int lungime = 0;

        for(Field fields: o.getClass().getDeclaredFields()) {
            fields.setAccessible(true);
            col[lungime] = fields.getName();
            lungime++;
        }
        return col;
    }

    public Object[][] createTable(List<T> obj)
    {
        List<String> col = new ArrayList<>();
        List<String[]> rowElem = new ArrayList<>();
        Object o = obj.get(0);
        int lungime = 0;

        for(Field fields: o.getClass().getDeclaredFields()) {
            fields.setAccessible(true);
            col.add(fields.getName());
            lungime++;
        }

        for(Object ob: obj) {
            String []val = new String[lungime];
            int j = 0;
            for(Field fields: o.getClass().getDeclaredFields()) {
                fields.setAccessible(true);
                try {
                    val[j++] = "" + fields.get(ob);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            rowElem.add(val);
        }
        return rowElem.toArray(new Object[][] {});
    }
    public List<T> findAll() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createFindAllQuery();
        //System.out.println(query);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            return createObjects(resultSet);
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:findAll " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    public T findById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createSelectQuery("id");

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            return createObjects(resultSet).get(0);
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:findById " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    private List<T> createObjects(ResultSet resultSet) {
        List<T> list = new ArrayList<T>();

        try {
            while (resultSet.next()) {
                T instance = type.newInstance();
                for (Field field : type.getDeclaredFields()) {
                    Object value = resultSet.getObject(field.getName());
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), type);
                    Method method = propertyDescriptor.getWriteMethod();
                    method.invoke(instance, value);
                }
                list.add(instance);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(T t) {
        int i = 1;
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createInsertQuery();

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            ArrayList<Object> objects = new ArrayList<>();
            Object value;
            for(Field fields: t.getClass().getDeclaredFields()){
                fields.setAccessible(true);

                value = fields.get(t);
                objects.add(value);

            }
            ArrayList<String> strings = new ArrayList<>();
            for(Field fields: t.getClass().getDeclaredFields()) {
                if (!fields.getName().equals("id"))
                    strings.add(fields.getName());
            }
            for(Object obj: objects)
            {
                if(obj.getClass().getSimpleName().equals("String")){
                    statement.setString(i, (String) obj);
                }
                if(obj.getClass().getSimpleName().equals("Integer")){
                    statement.setInt(i, (Integer) obj);
                }
                if(obj.getClass().getSimpleName().equals("Double")){
                    statement.setDouble(i, (Double) obj);
                }
                i++;
            }
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.log(Level.WARNING, type.getName() + "DAO:insert " + e.getMessage());
        } finally{
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }

    public void update(T t) {
        int i = 1;
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createUpdateQuery();

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            ArrayList<Object> objects = new ArrayList<>();
            Object value;
            for(Field fields: t.getClass().getDeclaredFields()){
                fields.setAccessible(true);

                value = fields.get(t);
                objects.add(value);
            }
            ArrayList<String> strings = new ArrayList<>();
            for(Field fields: t.getClass().getDeclaredFields()) {
                if (!fields.getName().equals("id"))
                    strings.add(fields.getName());
            }
            for(Object obj: objects)
            {
                if(obj.getClass().getSimpleName().equals("String")){
                    statement.setString(i, (String) obj);
                }
                if(obj.getClass().getSimpleName().equals("Integer")){
                    statement.setInt(i, (Integer) obj);
                }
                if(obj.getClass().getSimpleName().equals("Double")){
                    statement.setDouble(i, (Double) obj);
                }
                i++;
            }
            statement.setInt(i, (Integer) objects.get(0));
            statement.execute();
        } catch (Exception e) {
            //NOEXCEPTION
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }

    public void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createDeleteQuery("id");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:delete " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }
}

