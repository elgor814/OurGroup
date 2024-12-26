import java.util.ArrayList;

public interface BinarySearch {

    static <T extends Comparable<T>> void binarySearch(ArrayList<Object> array, T key) {

        int low = 0;
        int high = array.size() - 1;
        boolean flag = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array.get(mid).equals(key)){
                System.out.println(array.get(mid));
                flag = true;
                break;
            }

            else if (((T) array.get(mid)).compareTo(key) > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!flag)
            System.out.println("Объект не найден");
    }

    static <T extends Comparable<T>> void binarySearch(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = array[mid].compareTo(key);
            if (comparison == 0)
                System.out.println(array[mid]);
            if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Объекст не найден");
    }

}
