package com.isaacrs.carservice.service;

import com.isaacrs.carservice.entity.Car;
import com.isaacrs.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public Car getUserById(int id){
        return carRepository.findById(id).orElse(null);
    }

    public Car save(Car car){
        Car carNew = carRepository.save(car);
        return carNew;
    }

    public  List<Car> byUserId(int userId){
        return carRepository.findByUserId(userId);
    }
}
