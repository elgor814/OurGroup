import java.util.*;

public class ShellSort {

    // Метод сортировки с использованием ShellSort для коллекций
    public static <T> void sort(Collection<T> collection, Comparator<T> comparator) {
        // Преобразуем коллекцию в массив
        T[] array = (T[]) new Object[collection.size()];
        collection.toArray(array);

        // Применяем сортировку Шелла на массиве
        int n = array.length;
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

        // Преобразуем отсортированный массив обратно в коллекцию
        collection.clear();
        collection.addAll(Arrays.asList(array));
    }
}
