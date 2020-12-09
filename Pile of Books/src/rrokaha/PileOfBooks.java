/** Rishant Rokaha */
/** Professor Vohra */
/** Data Structure and Algorithms */
/** 26 September 2020 */
/** Assignment 3 */

package rrokaha;

public class PileOfBooks<T> implements PileInterface<T> {
    private int numberOfBooks;
    private Book<T> firstBook;

    @Override
    public void add(T newBook) {
        Book<T> Book1=new Book(newBook);
        Book1.setNextBook(firstBook);
        firstBook=Book1;
        numberOfBooks++;

    }


    public int currentSize(){
        return numberOfBooks;
    }

    @Override
    public T remove() {
        T result=null;
        if(firstBook != null){
            result = firstBook.getBookTitle();
            firstBook = firstBook.getNextBook();
            numberOfBooks--;}


        return result;
    }

   @Override
    public T getTopBook() {
            return firstBook.getBookTitle();
    }

    @Override
    public boolean isEmpty() {
        return numberOfBooks<=0;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }


        public T[] toArray(){
            T[] result = (T[])new Object[numberOfBooks];
            int index = 0;
            Book<T> headBook =firstBook;
            while ((index < numberOfBooks) && ( headBook != null))
            {
                result[index] = headBook.getBookTitle();
                index++;
                headBook = headBook.getNextBook();
            }
            return result;
        }

        }



