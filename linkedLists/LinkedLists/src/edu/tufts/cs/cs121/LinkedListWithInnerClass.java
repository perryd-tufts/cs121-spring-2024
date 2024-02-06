package edu.tufts.cs.cs121;

public class LinkedListWithInnerClass {

        Cell HEAD;      //pointer to the top of the list

    private static class Cell {
        int value;
        Cell next;

        public Cell (int value, Cell next) {
            this.value = value;
            this.next = next;
        }
    }


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



