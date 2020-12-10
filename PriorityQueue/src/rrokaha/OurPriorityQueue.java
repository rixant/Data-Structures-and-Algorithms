/** Rishant Rokaha
 Professor Vohra
 Data Structures and Algorithms
 29 October 2020
 Assignment 7 : Part 2
 */

package rrokaha;

import java.util.PriorityQueue;

public class OurPriorityQueue<T> implements PriorityQueueInterface<T> {

    PriorityQueue<T> queue;

    public OurPriorityQueue() {
        this.queue = new PriorityQueue<>();
    }


    @Override
    public void add(T newEntry) {
        if(!queue.contains(newEntry)){
        queue.add(newEntry);}
    }

    @Override
    public T remove() {
        return queue.remove();
    }

    @Override
    public T peek() {
            return queue.peek();

    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int getSize() {
        return queue.size();
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean contains(T entry) {
        boolean found = false;
        if (queue.contains(entry)) {
            found = true;
        }

        return found;
    }

    @Override
    public T getEntry(int index){
        T[] result = (T[]) new Object[queue.size()];
        Object[] arr = queue.toArray();

        for(int i = 0; i < arr.length; i++){
        result[i] = (T)arr[i];
        }

        return result[index];

    }


    }



