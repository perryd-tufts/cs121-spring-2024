package edu.tufts.cs.cs121;

public class GenericLinkedList<LISTTYPE> {  //if it's a string, then substitute String for LISTTYPE

    Cell<LISTTYPE> HEAD;      //pointer to the top of the list

    private static class Cell<CELLTYPE> {
        CELLTYPE value;
        Cell<CELLTYPE> next;

        public Cell (CELLTYPE value, Cell next) {  //why isn't this being complained about??
            this.value = value;
            this.next = next;
        }
    }


    public void insert(LISTTYPE value) {
        HEAD = new Cell<LISTTYPE>(value, HEAD);
    }

    public void printList() {
        Cell<LISTTYPE> walker = HEAD; //start at top of the list
        String output = "";
        while (walker != null) {
            output = output.concat(" | " + walker.value + " | --> ");
            walker = walker.next;
        }
        output = output.concat( " null");
        System.out.println(output);
    }

}



