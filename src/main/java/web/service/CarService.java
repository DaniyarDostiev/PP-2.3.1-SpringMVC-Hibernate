package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getRequiredQuantity(int quantity);

    List<Car> getCars();
}
