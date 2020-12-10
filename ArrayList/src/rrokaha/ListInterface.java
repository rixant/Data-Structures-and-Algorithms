/**Rishant Rokaha
 * Professor Vohra
 * Data Structures and ALgorithms
 * 22 November 2020
 * Assignment 9
 */
package rrokaha;

public interface ListInterface<T> {

    public void add(T newEntry) throws Exception;

    public void add(int newPosition, T newEntry) throws Exception;

    public T remove(int givenPosition) throws Exception;

    public void clear();

    public boolean replace(int givenPosition, T newEntry);

    public T getEntry(int givenPosition);

    public T[] toArray() throws Exception;

    public boolean contains(T anEntry) throws Exception;

    public int getLength();

    public boolean isEmpty();

    public int getPosition(T anObject);



}
