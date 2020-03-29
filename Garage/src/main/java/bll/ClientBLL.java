package bll;

import architecture.ClientOp;
import dao.CarDAO;
import dao.UserDAO;
import model.Car;
import model.User;

public class ClientBLL implements ClientOp {
    private CarDAO carDAO;
    private UserDAO userDAO;

    public ClientBLL() {
        this.carDAO = new CarDAO();
        this.userDAO = new UserDAO();
    }

    @Override
    public void insertClient(User user) {
        userDAO.insert(user);
    }

    @Override
    public void insertCar(Car car) {
        carDAO.insert(car);
    }

    @Override
    public void updateCar(Car updatedCar) {

        carDAO.update(updatedCar);
    }
}
