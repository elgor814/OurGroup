import java.util.Collection;

public class SortContext <T>{

    private ISortStrategy<T> ISortStrategy;

    public SortContext(ISortStrategy<T> ISortStrategy){
        this.ISortStrategy = ISortStrategy;
    }

    public void setSortStrategy(ISortStrategy<T> ISortStrategy){
        this.ISortStrategy = ISortStrategy;
    }

    public void sortCollection(Collection<T> collection){
        ISortStrategy.sort(collection);
    }

}
