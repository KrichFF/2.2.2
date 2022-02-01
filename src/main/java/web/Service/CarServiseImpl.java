package web.Service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarServiseImpl implements CarService {
    @Override
    public List<Car> getTable(List<Car> cars, String count) {
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
