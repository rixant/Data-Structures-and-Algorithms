/**Rishant Rokaha
 * Professor Vohra
 * Data Structures and ALgorithms
 * 22 November 2020
 * Assignment 9
 */
package rrokaha;

import java.util.Arrays;

public class AList<T> implements ListInterface<T> {

    private T[] list;
    private int numberOfEntries;
    private boolean integrityOk;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 1000;

    public AList() throws Exception{
        this(DEFAULT_CAPACITY);

    }

    public AList(int initialCapacity) throws Exception  {
        integrityOk = false;

        if (initialCapacity < DEFAULT_CAPACITY)
            initialCapacity = DEFAULT_CAPACITY;
        else
            checkCapacity(initialCapacity);


        T[] tempList = (T[])new Object[initialCapacity + 1];
        list = tempList;
        numberOfEntries = 0;
        integrityOk = true;
    }

    private void checkCapacity(int capacity) throws Exception{
        if(capacity>MAX_CAPACITY)
            throw new Exception("Attemp to create a list whose capacity exceeds the max");

    }


    @Override
    public void add(T newEntry) {
        add(numberOfEntries+1, newEntry);
    }

    @Override
    public void add(int newPosition, T newEntry) {
        try {
            checkIntegrity();
            if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
                if (newPosition <= numberOfEntries)
                    makeRoom(newPosition);
                list[newPosition] = newEntry;
                numberOfEntries++;
                ensureCapacity();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private void ensureCapacity() throws Exception {
        int capacity = list.length - 1;
        if (numberOfEntries >= capacity)
        {
            int newCapacity = 2 * capacity;
            checkCapacity(newCapacity);
            list = Arrays.copyOf(list, newCapacity + 1);
        }
    }

    private void makeRoom(int newPosition)
    {
        int newIndex = newPosition;
        int lastIndex = numberOfEntries;
        for (int index = lastIndex; index >= newIndex; index--){
            list[index + 1] = list[index];}
    }

    private void checkIntegrity() throws Exception{
        if(!integrityOk)
            throw new Exception("AList object is correct");
    }


    @Override
    public void clear() {
        for (int i = 0; i < numberOfEntries; i++)
            list[i] = null;

        numberOfEntries = 0;

    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries==0;
    }


    public T getEntry(int givenPosition) {
        T result = null;
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            result = list[givenPosition];
        }
        return result; }


    @Override
    public T[] toArray() {

        try{
        checkIntegrity();

        T[] result = (T[])new Object[numberOfEntries];
        for (int index = 0; index < numberOfEntries; index++){
            result[index] = list[index + 1];
        }
        return result;
         }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public int getLength() {
        return numberOfEntries;
    }

    @Override
    public boolean contains(T anEntry) throws Exception {
        checkIntegrity();
        boolean found = false;
        int index = 1;
        while (!found && (index <= numberOfEntries))
        {
            if (anEntry.equals(list[index]))
                found = true;
            index++;
        }
        return found;
    }


    @Override
    public T remove(int givenPosition)  {

        try{
        checkIntegrity();
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
            T result = list[givenPosition];

            if (givenPosition < numberOfEntries)
                removeGap(givenPosition);
            list[numberOfEntries] = null;
            numberOfEntries--;
            return result;
        }}
        catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    private void removeGap(int givenPosition)
    {
        int removedIndex = givenPosition;
        for (int index = removedIndex; index < numberOfEntries; index++)
            list[index] = list[index + 1];
    }

    @Override
    public int getPosition(T anEntry) {
        int position =1;
        int length = getLength();
        for (int i =1 ; i<=length; i++){
            if(list[i]==anEntry){
                position=i;
            }
        }
        return position;
    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessful = true;
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            list[givenPosition ] = newEntry;
        }

        else
            isSuccessful = false;
        return isSuccessful; }


}
