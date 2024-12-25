package main.java;

import java.util.Collection;

public interface ISortStrategy<T> {
    void sort(Collection<T> collection) ;
}
