/** Rishant Rokaha
 Professor Vohra
 Data Structures and Algorithms
 29 October 2020
 Assignment 7 : Part 2
 */

package rrokaha;

public interface PriorityQueueInterface<T> {

    public void add(T newEntry);

    public T remove();

    public T peek();

    public boolean isEmpty();

    public int getSize();

    public void clear();

    public boolean contains(T entry);

    public T getEntry(int index);


}
