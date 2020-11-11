/* This code will recreates the Arraylist built in class .
    CompSci 2
    @author michael Soskin
    @version 8 November 10th 2020

 */
public class MyArrayList<E> {
    E [] list ;
    public int arrayElements=0;


    // no parameter constructor
    public MyArrayList() {
        list = (E[]) new Object[10];
         }

    // parameterized constructor
    public MyArrayList(int arrayCapacity) {
        list = (E[]) new Object [arrayCapacity];

    }
    @SuppressWarnings("unchecked")
     public boolean contains(Object o){
         for (E e : list) {
             if (o.equals(e)) {
                 return true;
             }
         }
        return false;
    }

   // Add elements to an array list
    public boolean add(E e) {
        if (list.length <= arrayElements) {
            addCapacity();
        }
        list[arrayElements] = e;
        arrayElements++;
        return true;
    }
    private boolean addCapacity(){
        E [] list1 = (E[]) new Object[arrayElements *2];
        for (int i = 0; i < arrayElements ; i++)
            list1[i] = list[i];
        list = list1;
        return true;
    }
    // return capacity of array
    public int capacity(){
        return list.length;
    }

    // clear array
    public void clear(){
        for (int i = 0; i < arrayElements; i++) {
            list[arrayElements] = null;
        }
        arrayElements = 0;
    }

   // get elements of an array
    public E get(int index) {
        if (index < arrayElements) {
            return list[index];
        } else {
            return null;
        }
    }
    @SuppressWarnings("unchecked")
    // get index of an object in array
    public int indexOf(Object o) {
        for (int i = 0; i < arrayElements; i++)
            if (list[i] == o) {
                return i;
            }
        return -1;
    }

    // return empty array
    public Boolean isEmpty(){
        return arrayElements == 0;
    }

    //remove an index of an array
    public E remove (int index){
        E e = list[index];
        for (int i = index; i < arrayElements; i++) {
            list[i] = list[i + 1];
        }
        list[arrayElements] = null;
        return e;
    }
    public boolean remove (Object o){
        if (o != null) {
            for (int i = 0; i < arrayElements -1 ; i++) {
                if (o == list[i]) {
                    list[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    public int size(){
        return arrayElements;
    }
}
/*
Points      Item
----------  --------------------------------------------------------------
__10___ / 10  Style
            + Code is indented correctly
            + Methods should be no longer than 1 page
            + Documentation: (written for another software developer)
              * All source code files include Javadoc header block with description, @author, @version, etc.
              * Javadoc (with block tags, for example @param, @return) before each method
              * All non-trivial variables are commented
              * Comments included before major portions of code
___100%__ /     Compiles (max of 50% if it doesn't compile)
__10__ / 10  Constructors Unit Test
__25___ / 25  add() Unit Test
___13__ / 13  indexOf() Unit Test
___6__ / 11  remove(index) Unit Test
___6__ / 11  remove(object) Unit Test
__8__ /  8  contains() Unit Test
__5__ /  5  clear() Unit Test
__5__ /  5  isEmpty() Unit Test

__2__ /  2  Completed rubric (estimates for each line including hours spent, and signing your name to affirm it's your own work)

__88___ /100  Total


___26__  Approximate number of hours spent

I, (MICHAEL SOSKIN), affirm that the code that I submitted is my own work and that I did not receive help that was no authorized by the instructor.*/
