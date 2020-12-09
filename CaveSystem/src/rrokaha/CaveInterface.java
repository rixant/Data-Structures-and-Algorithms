/** Rishant Rokaha
 * Professor Vohra
 * Data Structures and Algorithms
 * 21 October 2020
 * Assignment 6
 */
package rrokaha;

public interface CaveInterface<T> {

    //adds the data
    public void push (T newEntry, double latitude, double longitude);

    //removes the data from top
    public T pop();

    //returns the data at top
    public T peek();

    //checks if stack is empty
    public boolean isEmpty();

    //clears the stack
    public void clear();

}
