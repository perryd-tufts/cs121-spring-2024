import edu.tufts.cs.cs121.*;


//JAVADOC

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting run");
        //    LinkedList list = new LinkedList();
        //     LinkedListWithInnerClass list = new LinkedListWithInnerClass();
        //       GenericLinkedList<Integer> list = new GenericLinkedList<>();
        //     GenericLinkedList<String> list2 = new GenericLinkedList<>();
        List<Integer> list = new GenericLinkedListWithInterface<>();
        List<String> list2 = new GenericLinkedListWithInterface<>();
        GenericLinkedListWithInterface foo = new GenericLinkedListWithInterface(); //does <> default to Object??
        foo.insert("forty two");
        foo.insert(77);
        foo.insert(64.2433);
        foo.insert(foo);

        foo.printList();


//This is "Dynamic Dispatch", also known as polymorphism
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(8);
        list.printList();

        list2.insert("one");
        list2.insert("two");
        list2.insert("three");
        list2.insert("four");
        list2.insert("five");
        list2.printList();

    }
}