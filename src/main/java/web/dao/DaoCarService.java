package web.dao;

import web.model.Car;

import java.util.List;

public interface DaoCarService {
    List<Car> getTable(String count);
}
