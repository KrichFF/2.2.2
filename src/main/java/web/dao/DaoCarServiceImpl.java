package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DaoCarServiceImpl implements DaoCarService {
    List<Car> cars = Arrays.asList(
            new Car("1", "11", 1),
            new Car("2", "22", 2),
            new Car("3", "33", 3),
            new Car("4", "44", 4),
            new Car("5", "55", 5)
    );

    @Override
    public List<Car> getTable(String count) {
        int countNumber = 0;
        if (count != null) {
            countNumber = Integer.parseInt(count.replaceAll("[^0-9]", ""));
        }
        if (countNumber >= 5) {
            countNumber = 5;
        }
        return cars.stream().limit(countNumber).collect(Collectors.toList());
    }
}
