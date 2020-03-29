package architecture;

import model.*;

import java.util.List;

public interface AdminOP {

    public List<Client> getAllClients();
    public Client findClientByID(int id);
    public void insertClient(Client client);
    public void updateClient(Client updatedClient);
    public void deleteClient(int id);

    public List<Car> getAllCars();
    public Car findCarByID(int id);
    public void insertCar(Car car);
    public void updateCar(Car updatedCar);
    public void deleteCar(int id);

    public Mechanic findMechanicById(int id);
    public void insertMechanic(Mechanic mechanic);
    public void updateMechanic(Mechanic updatedMechanic);
    public void deleteMechanic(int id);
}
