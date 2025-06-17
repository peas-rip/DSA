import java.util.ArrayList;
import java.util.*;
class Tryouts{
    Scanner ab = new Scanner(System.in);
    List <Integer> list = new ArrayList<>();
    public void addElement() {
        System.out.println("Enter the number of items to add to an arrayList");
        int num = ab.nextInt();
        for(int i = 0;i<num;i++) {
            System.out.println("Enter the item");
            int item = ab.nextInt();
            list.add(item);
        }
        System.out.println("The list after adding item");
        System.out.println(list);
    }

    public void removeElement(int pos) {
        list.remove(pos);
        System.out.println("List after the removal of element:" + list);
    }

    public void getElement(int pos) {
        System.out.println("Element present at the index" +pos + " is " +list.get(pos));
        
    }
    // trying out set method
    public void setElement(int index,int element) {
        System.out.println("ArrayList before replacing the element" + list);
        list.set(index, element);
        System.out.println("ArrayList after replacing the element" + list);
    }   
    //getting the size of the arrayList
    public void getSize() {
        System.out.println("The size of the list is " + list.size());
    }
    //using contains method to check whether the arrayList contains that element
    public void containsElement(int element) {
        if(list.contains(element)) {
            System.out.println("Yes the element is present");
        }
        else{
            System.out.println("The element is not present");
        }
    }
    //using indexOf and lastIndexOf methods to find the position of an element in an array
    public void search(int element) {
        int index = list.indexOf(element);
        if (index>0) {
            System.out.println("The element present at index" + index);
        }
        else{
            System.out.println("Element not present");
        }
    }

    //Collections class in java
    //Sorting using sort function
    public void sort() {
        System.out.println("List before sorting:" + list);
        Collections.sort(list);
        System.out.println("List after sorting: " + list);
    }
}
public class ArraysLists {
    public static void main(String[] args) {
        Tryouts obj1 = new Tryouts();
        int pos;
        obj1.addElement();
        // System.out.println("Enter the position of an element to remove");
        // pos = obj1.ab.nextInt();
        // obj1.removeElement(pos);
        // System.out.println("Enter an index to get the element");
        // pos = obj1.ab.nextInt();
        // obj1.getElement(pos);
        // //trying out set method
        // System.out.println("Enter an index to replace the element");
        // pos = obj1.ab.nextInt();
        // System.out.println("Enter the element to replace");
        // int element = obj1.ab.nextInt();
        // obj1.setElement(pos, element);
        // obj1.getSize();
        // System.out.println("Enter the element to check its presence");
        // pos = obj1.ab.nextInt();
        // obj1.containsElement(pos);
        // System.out.println("The index of the same element");
        // obj1.search(pos);
        // Trying out collections class in java
        obj1.sort();

     }
}
