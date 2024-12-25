import java.util.Comparator;


public class CarComparators {

    // сортировка по модели
    public static final Comparator<Car> byModel = Comparator.comparing(Car::getModel);

    // сортировка по мощности
    public static final Comparator<Car> byPower = Comparator.comparingInt(Car::getPower);

    // сортировка по году выпуска
    public static final Comparator<Car> byYear = Comparator.comparingInt(Car::getYear);

}


