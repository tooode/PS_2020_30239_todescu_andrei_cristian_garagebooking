package service;

import architecture.Facade;
import bll.*;
import model.Car;
import model.Mechanic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        /*AdminBLL adminBLL = new AdminBLL();
		ClientBLL clientBLL = new ClientBLL();

		Facade facade = new Facade(adminBLL, clientBLL);
		List<Car> cars = new ArrayList(facade.getAllCars());
		for(int i = 0; i < cars.size(); i++){
		    System.out.print(cars.get(i).toString());
        }*/
    }
}
