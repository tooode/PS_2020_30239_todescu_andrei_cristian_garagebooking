package bll;

import architecture.ClientOp;
import dao.CarDAO;
import dao.ClientDAO;
import model.Car;
import model.Client;

public class ClientBLL implements ClientOp {
    private CarDAO carDAO;
    private ClientDAO clientDAO;

    public ClientBLL() {
        this.carDAO = new CarDAO();
        this.clientDAO = new ClientDAO();
    }

    @Override
    public void insertClient(Client client) {
        clientDAO.insert(client);
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
