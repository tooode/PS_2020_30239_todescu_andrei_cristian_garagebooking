package architecture;

import model.*;

public interface ClientOp {

    public void insertClient(User user);
    public void insertCar(Car car);
    public void updateCar(Car updatedCar);
}
