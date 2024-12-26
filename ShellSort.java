import java.util.*;

public class ShellSort<T> implements ISortStrategy<T> {

    @Override
    public List<T> sort(Collection<T> collection, Comparator<T> comparator) {

        // Преобразуем коллекцию в массив
        T[] array = (T[]) collection.toArray();

        int n = array.length;

        // Применяем сортировку Шелла
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                T temp = array[i];
                int j = i;
                while (j >= gap && comparator.compare(array[j - gap], temp) > 0) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
        }

        // Обновляем коллекцию из отсортированного массива
        return new ArrayList<>(Arrays.asList(array));
    }
}


