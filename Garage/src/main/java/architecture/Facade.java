package architecture;

import model.Car;
import model.Client;
import model.Mechanic;

import java.util.List;

public class Facade {

    private AdminOP adminOP;
    private ClientOp clientOp;

    public Facade(AdminOP adminOP, ClientOp clientOp) {
        this.adminOP = adminOP;
        this.clientOp = clientOp;
    }
    /**
     * Inserare client in BD
     * @param client
     */
    public void insertClient(Client client){
        clientOp.insertClient(client);
    }
    /**
     * Inserare masina in BD
     * @param masina
     */
    public void insertCar(Car masina){
        clientOp.insertCar(masina);
    }
    /**
     * Update car  in BD
     * @param uptmasina
     */
    public void updateCar(Car uptmasina){
        clientOp.updateCar(uptmasina);
    }
    /**
     * Returneaza o lista cu clientii
     * @return o lista de clienti
     */
    public List<Client> getAllClients(){
        return adminOP.getAllClients();
    }
    /**
     * Find client by ID in BD
     * @param id
     */
    public Client findClientByID(int id){
        return adminOP.findClientByID(id);
    }
    /**
     * Update client  in BD
     * @param updatedClient
     */
    public void updateClient(Client updatedClient){
        adminOP.updateClient(updatedClient);
    }
    /**
     * Delete client  din BD
     * @param id
     */
    public void deleteClient(int id){
        adminOP.deleteClient(id);
    }
    /**
     * Returneaza o lista cu masini
     * @return o lista de masini
     */
    public List<Car> getAllCars(){
        return adminOP.getAllCars();
    }
    /**
     * Find car by ID in BD
     * @param id
     */
    public Car findCarByID(int id){
        return adminOP.findCarByID(id);
    }
    /**
     * Delete car  din BD
     * @param id
     */
    public void deleteCar(int id){
        adminOP.deleteCar(id);
    }
    /**
     * Find mechanic by ID in BD
     * @param id
     */
    public Mechanic findMechanicById(int id){
        return adminOP.findMechanicById(id);
    }
    /**
     * Inserare mecanic in BD
     * @param mechanic
     */
    public void insertMechanic(Mechanic mechanic){
        adminOP.insertMechanic(mechanic);
    }
    /**
     * Update mechanic  in BD
     * @param updatedMechanic
     */
    public void updateMechanic(Mechanic updatedMechanic){
        adminOP.updateMechanic(updatedMechanic);
    }
    /**
     * Delete mechanic  din BD
     * @param id
     */
    public void deleteMechanic(int id){
        adminOP.deleteMechanic(id);
    }

}
