package chapter3.reinforcement.problem02;

import java.util.ArrayList;

/** R-3.2 Write a Java method that repeatedly selects and removes a random entry from an
 array until the array holds no more entries. */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> outside = new ArrayList<>();
        outside.add("Tree");
        outside.add("Bench");
        outside.add("Park");
        outside.add("Trash Can");
        outside.add("Side walk");

        EntryRemover remover = new EntryRemover(outside);
        //ArrayList<String> emptied = remover.randomRemove();
        outside = remover.randomRemove();
        System.out.println("array is empty: " + outside.size());

    }
}
