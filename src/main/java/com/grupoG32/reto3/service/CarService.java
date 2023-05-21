package com.grupoG32.reto3.service;

import com.grupoG32.reto3.dbo.CarDbo;
import com.grupoG32.reto3.model.CarModel;
import com.grupoG32.reto3.repoditory.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public List<CarModel> obtener(){return carRepository.findAll();}

    public void crear(CarModel car){carRepository.save(car);}

    public void eliminar(int id){
        carRepository.deleteById(id);
    }

    public void actualizar(CarDbo carInput) {

           Optional<CarModel> carDB = carRepository.findById(carInput.getIdCar());

           if (carDB.isPresent()) {
               CarModel car = carDB.get();
               if (carInput.getBrand() != null ) {
                   car.setBrand(carInput.getBrand());
               }
               if (carInput.getName() != null ) {
                   car.setName(carInput.getName());
               }
               if (carInput.getDescription() != null ) {
                   car.setDescription(carInput.getDescription());
               }
               if (carInput.getYear() != null ) {
                   car.setYear(carInput.getYear());
               }
               if (carInput.getMessages() != null ) {
                   car.setMessages(carInput.getMessages());
               }
               if (carInput.getGama() != null){
                   car.setGama(carInput.getGama());
               }
               if (carInput.getReservations() != null){
                   car.setReservations(carInput.getReservations());
               }
               carRepository.save(car);
           }

    }
}
