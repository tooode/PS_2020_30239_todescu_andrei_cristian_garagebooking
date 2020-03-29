package architecture;

import model.*;

public interface ClientOp {

    public void insertClient(Client client);
    public void insertCar(Car car);
    public void updateCar(Car updatedCar);
}
