package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private static int counter;
    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(++counter, "bmw", "model1"));
        cars.add(new Car(++counter, "toyota", "model2"));
        cars.add(new Car(++counter, "nissan", "model3"));
        cars.add(new Car(++counter, "honda", "model4"));
        cars.add(new Car(++counter, "kia", "model5"));
    }


    @Override
    public List<Car> getCars() {
        return cars;
    }
}
