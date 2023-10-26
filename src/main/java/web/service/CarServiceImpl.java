package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getRequiredQuantity(int quantity) {
        if (quantity > 5) {
            return carDao.getCars();
        } else {
            List<Car> requiredNumber = new ArrayList<>();
            for (int i = 0; i < quantity; i++) {
                requiredNumber.add(carDao.getCars().get(i));
            }
            return requiredNumber;
        }
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }
}
