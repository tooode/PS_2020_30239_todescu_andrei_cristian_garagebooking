package architecture;

import model.*;

import java.util.List;

public interface AdminOP {

    public List<User> getAllClients();
    public User findClientByID(int id);
    public void insertClient(User user);
    public void updateClient(User updatedUser);
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
