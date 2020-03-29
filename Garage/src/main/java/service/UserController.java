package service;

import model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController extends BaseController {

    @GetMapping("/allUsers")
    public List<User> ListAllUsers(){
        return info.getAllClients();
    }
    @GetMapping("/findClientById")
    public User findUserById(@RequestBody int id){
        return info.findClientByID(id);
    }

    @PostMapping("/insertUser")
    public void insertUser(@RequestBody User user){
        info.insertClient(user);
    }

    @PostMapping("/updateUserId={id}")
    public void updateUser(@RequestBody User user){
        info.updateClient(user);
    }

    @PostMapping("/deleteUser")
    public void deleteUser(@RequestBody int id){
        info.deleteClient(id);
    }
    @GetMapping("/allCars")
    public List<Car> ListAllCars(){
        return info.getAllCars();
    }

    @GetMapping("/findCarById")
    public Car findCarById(@RequestBody int id){
        return info.findCarByID(id);
    }

    @PostMapping("/insertCar")
    public void insertCar(@RequestBody Car car){
        info.insertCar(car);
    }

    @PostMapping("/updateCarId={id}")
    public void updateCar(@RequestBody Car car){
        info.updateCar(car);
    }

    @PostMapping("/deleteCar")
    public void deleteCar(@RequestBody int id){
        info.deleteCar(id);
    }

    @GetMapping("/findMechanicById")
    public Mechanic findMechanicById(@RequestBody int id){
        return info.findMechanicById(id);
    }

    @PostMapping("/insertMechanic")
    public void insertMechanic(@RequestBody Mechanic mechanic){
        info.insertMechanic(mechanic);
    }

    @PostMapping("/updateMechanicId={id}")
    public void updateMechanic(@RequestBody Mechanic mechanic){
        info.updateMechanic(mechanic);
    }

    @PostMapping("/deleteMechanic")
    public void deleteMechanic(@RequestBody int id){
        info.deleteMechanic(id);
    }
}
