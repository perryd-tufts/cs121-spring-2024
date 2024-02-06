package edu.tufts.cs.cs121;

public class LinkedList {

    Cell HEAD;      //pointer to the top of the list

    public void insert(int value) {
        int foo;
        HEAD = new Cell(value, HEAD);
    }

    public void printList() {
        Cell walker = HEAD; //start at top of the list
        String output = "";
        while (walker != null) {
            output = output.concat(" | " + walker.value + " | --> ");
            walker = walker.next;
        }
        output = output.concat( " null");
        System.out.println(output);
    }

}
