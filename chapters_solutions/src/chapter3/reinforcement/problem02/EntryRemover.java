package chapter3.reinforcement.problem02;

import java.util.ArrayList;


public class EntryRemover {
    private ArrayList<String> myArray;

    public EntryRemover(ArrayList array) {
        myArray = array;

    }

    /** Removes a random value until the array is empty.*/
    public ArrayList<String> randomRemove() {
        int count = 5;
        while (myArray.size() > 0) {
            int max = myArray.size();
            int min = 0;
            int randomPos = (int) (Math.random() * (max - min));
            System.out.println("item to be removed: " + myArray.get(randomPos));
            myArray.remove(randomPos);


            count--;
        }
        return myArray;
    }

}
