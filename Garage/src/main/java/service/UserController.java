package service;

import model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController extends BaseController {

    @GetMapping("/allUsers")
    @CrossOrigin(origins = "*")
    public List<User> ListAllUsers(){
        return info.getAllClients();
    }
    @GetMapping("/findClientById")
    @CrossOrigin(origins = "*")
    public User findUserById(@RequestBody int id){
        return info.findClientByID(id);
    }

    @PostMapping("/insertUser")
    @CrossOrigin(origins = "*")
    public void insertUser(@RequestBody User user){
        info.insertClient(user);
    }

    @PostMapping("/updateUserId={id}")
    @CrossOrigin(origins = "*")
    public void updateUser(@RequestBody User user){
        info.updateClient(user);
    }

    @PostMapping("/deleteUser")
    @CrossOrigin(origins = "*")
    public void deleteUser(@RequestBody int id){
        info.deleteClient(id);
    }
    @GetMapping("/allCars")
    @CrossOrigin(origins = "*")
    public List<Car> ListAllCars(){
        return info.getAllCars();
    }

    @GetMapping("/findCarById")
    @CrossOrigin(origins = "*")
    public Car findCarById(@RequestBody int id){
        return info.findCarByID(id);
    }

    @PostMapping("/insertCar")
    @CrossOrigin(origins = "*")
    public void insertCar(@RequestBody Car car){
        info.insertCar(car);
    }

    @PostMapping("/updateCarId={id}")
    @CrossOrigin(origins = "*")
    public void updateCar(@RequestBody Car car){
        info.updateCar(car);
    }

    @PostMapping("/deleteCar")
    @CrossOrigin(origins = "*")
    public void deleteCar(@RequestBody int id){
        info.deleteCar(id);
    }

    @GetMapping("/findMechanicById")
    @CrossOrigin(origins = "*")
    public Mechanic findMechanicById(@RequestBody int id){
        return info.findMechanicById(id);
    }

    @PostMapping("/insertMechanic")
    @CrossOrigin(origins = "*")
    public void insertMechanic(@RequestBody Mechanic mechanic){
        info.insertMechanic(mechanic);
    }

    @PostMapping("/updateMechanicId={id}")
    @CrossOrigin(origins = "*")
    public void updateMechanic(@RequestBody Mechanic mechanic){
        info.updateMechanic(mechanic);
    }

    @PostMapping("/deleteMechanic")
    @CrossOrigin(origins = "*")
    public void deleteMechanic(@RequestBody int id){
        info.deleteMechanic(id);
    }
}
