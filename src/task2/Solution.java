package task2;

import java.util.Arrays;
import java.util.Collection;

/*
Write a generic method that takes an array of objects and a collection,
and puts all objects in the array into the collection
*/

public class Solution {
    public static <T> void createCollectionFromArray(Collection<T> collection, T[] array) {
        collection.addAll(Arrays.asList(array));
/*
        for (T element : array) {
            collection.add(element);
        }
*/
    }
}
