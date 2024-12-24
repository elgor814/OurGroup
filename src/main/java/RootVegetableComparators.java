import java.util.Comparator;

public class RootVegetableComparators {

    // сортировка по названию
    public static final Comparator<RootVegetable> byType = Comparator.comparing(RootVegetable::getType);

    // сортировка по весу
    public static final Comparator<RootVegetable> byWeight = Comparator.comparingDouble(RootVegetable::getWeight);

    // сортировка по цвету
    public static final Comparator<RootVegetable> byColor = Comparator.comparing(RootVegetable::getColour);

}