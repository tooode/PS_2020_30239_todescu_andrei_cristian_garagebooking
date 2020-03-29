package bll;

import architecture.AdminOP;
import dao.*;
import model.Car;
import model.Client;
import model.Mechanic;

import java.util.List;

public class AdminBLL implements AdminOP {
    private CarDAO carDAO;
    private ClientDAO clientDAO;
    private MechanicDAO mechanicDAO;

    public AdminBLL() {
        this.carDAO = new CarDAO();
        this.clientDAO = new ClientDAO();
        this.mechanicDAO =new MechanicDAO();
    }

    @Override
    public List<Client> getAllClients() {
        return clientDAO.findAll();
    }

    @Override
    public Client findClientByID(int id) {
        return clientDAO.findById(id);
    }

    @Override
    public void insertClient(Client client) {
        clientDAO.insert(client);
    }

    @Override
    public void updateClient(Client updatedClient) {
        clientDAO.update(updatedClient);
    }

    @Override
    public void deleteClient(int id) {
        clientDAO.delete(id);
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
