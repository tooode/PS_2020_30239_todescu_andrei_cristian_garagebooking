package bll;

import architecture.AdminOP;
import dao.*;
import model.Car;
import model.User;
import model.Mechanic;

import java.util.List;

public class AdminBLL implements AdminOP {
    private CarDAO carDAO;
    private UserDAO userDAO;
    private MechanicDAO mechanicDAO;

    public AdminBLL() {
        this.carDAO = new CarDAO();
        this.userDAO = new UserDAO();
        this.mechanicDAO =new MechanicDAO();
    }

    @Override
    public List<User> getAllClients() {
        return userDAO.findAll();
    }

    @Override
    public User findClientByID(int id) {
        return userDAO.findById(id);
    }

    @Override
    public void insertClient(User user) {
        userDAO.insert(user);
    }

    @Override
    public void updateClient(User updatedUser) {
        userDAO.update(updatedUser);
    }

    @Override
    public void deleteClient(int id) {
        userDAO.delete(id);
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.findAll();
    }

    @Override
    public Car findCarByID(int id) {
        return carDAO.findById(id);
    }

    @Override
    public void insertCar(Car car) {
        carDAO.insert(car);
    }

    @Override
    public void updateCar(Car updatedCar) {
        carDAO.update(updatedCar);
    }

    @Override
    public void deleteCar(int id) {
        carDAO.delete(id);
    }

    @Override
    public Mechanic findMechanicById(int id) {
        return mechanicDAO.findById(id);
    }

    @Override
    public void insertMechanic(Mechanic mechanic) {
        mechanicDAO.insert(mechanic);

    }

    @Override
    public void updateMechanic(Mechanic updatedMechanic) {
        mechanicDAO.update(updatedMechanic);
    }

    @Override
    public void deleteMechanic(int id) {
        mechanicDAO.delete(id);
    }
}
