package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDao carDao;

    private CarServiceImp() {}

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Transactional
    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }
}
