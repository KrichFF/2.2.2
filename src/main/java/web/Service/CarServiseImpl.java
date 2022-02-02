package web.Service;

import web.dao.DaoCarService;
import web.dao.DaoCarServiceImpl;
import web.model.Car;

import java.util.List;

public class CarServiseImpl implements CarService {
    DaoCarService daoCarService = new DaoCarServiceImpl();

    @Override
    public List<Car> getTable(String count) {
        return daoCarService.getTable(count);
    }
}
