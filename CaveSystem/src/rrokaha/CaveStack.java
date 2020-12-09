/** Rishant Rokaha
 * Professor Vohra
 * Data Structures and Algorithms
 * 21 October 2020
 * Assignment 6
 */
package rrokaha;

import java.util.EmptyStackException;

import java.util.Vector;

public class CaveStack<T> implements CaveInterface<T> {
    private Cave<T> firstCave;
    private int numberOfCaves=0;


    //add new caves to the system
    @Override
    public void push(T newEntry, double latitude, double longitude) {
        if(!hasCave(latitude, longitude)){
        Cave newCave= new Cave(newEntry, firstCave, latitude, longitude);
        firstCave=newCave;
        numberOfCaves++;}

    }


    //removes most recent discovered cave from the system
    @Override
    public T pop() {
        T top = peek();
        firstCave=firstCave.getNextCave();
        numberOfCaves--;
        return top;
    }

    //returns most recent discovered cave
    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return firstCave.getCaveName();}
    }

    //checks if stack is empty
    @Override
    public boolean isEmpty() {
        return firstCave == null;
    }

    //removes all caves from the system
    @Override
    public void clear() {
        firstCave = null;

    }

    //converts into array
    public T[] toArray(){
        T[] result = (T[])new Object[numberOfCaves];
        int index = 0;
        Cave<T> headCave =firstCave;
        while ((index < numberOfCaves) && ( headCave != null))
        {
            result[index] = headCave.getCaveName();
            index++;
            headCave = headCave.getNextCave();
        }
        return result;
    }


    //check duplicates with latitude and longitude
    public boolean hasCave(double latitude, double longitude){
        boolean found = false;
        Cave currentCave = firstCave;
        while (!found && (currentCave != null))
        {
            if ((latitude==currentCave.getLatitude())&&(longitude==currentCave.getLongitude())){
                found = true;
            System.out.println("Couldn't add "+ currentCave.getCaveName()+" to the system. Duplicates not allowed !!!");}
            else
                currentCave = currentCave.getNextCave();
        } // end while
        return found;

    }
}

