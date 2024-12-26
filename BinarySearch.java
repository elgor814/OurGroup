package third_task;

import java.util.List;

public class BinarySearch {
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midValue = list.get(mid);

            int cmp = midValue.compareTo(key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // Найдено
            }
        }

        return -1; // Не найдено
    }
}


