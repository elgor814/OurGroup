import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public interface ISortStrategy<T> {
    List<T> sort(Collection<T> collection, Comparator<T> comparator);
}
