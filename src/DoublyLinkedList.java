
public class DoublyLinkedList<E> {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Adds value to the beginning of the list
     * @param value
     */
    public void addFirst(int value) {
        Node tmp = new Node(value, null, null);
        if(head == null) {
            head = tmp;
            tail = head;
        } else {
            head.setPrevious(tmp);
            tmp.setNext(head);
            head = tmp;
        }
        size++;
        System.out.println("value = " +  value + " added at the beginning of the list");
    }

    /**
     * Adds value to the end of the list
     * @param value
     */
    public void addLast(int value) {
        Node tmp = new Node(value, null, null);
        if(head == null) {
            head = tmp;
            tail = head;
        } else {
            tmp.setPrevious(tail);
            tail.setNext(tmp);
            tail = tmp;
        }
        size++;
        System.out.println("value = " +  value + " added at the end of the list");
    }

    /**
     * Prints the values in the list
     */
    public void display(){
        System.out.print("[");
        Node tmp = head;
        while(tmp != null){
            if(tmp.getNext() != null)
                System.out.print(tmp.getData() + ", ");
            else
                System.out.print(tmp.getData());
            tmp = tmp.getNext();
        }
        System.out.println("]");
    }

    /**
     * Deletes value at the given index
     * @param index
     */
    public void removeAt(int index) {
        if(index < 0 || index > size-1) {
            System.out.println("Index out of bounds");
            return;
        }

        Node tmp = head;
        int counter = 0;
        while(tmp != null && counter != index){
            tmp = tmp.getNext();
            counter++;
        }
        removing(tmp);
        System.out.println("value = " + tmp.getData() + " removed at index " + index);
    }

    /**
     * Deletes first match value from the beginning
     * @param value
     */
    public void removeFirst(int value) {
        if (size == 0) {
            System.out.println("No such element");
            return;
        }
        Node tmp = head;
        while(tmp != null){
            if(tmp.getData() == value) {
                removing(tmp);
                break;
            }
            tmp = tmp.getNext();
        }
        if(tmp != null)
            System.out.println("value = " + tmp.getData() + " removed");
        else
            System.out.println(" No such element");
    }

    /**
     * Deletes matched value from the end of the list
     * @param value
     */
    public void removeLast(int value) {
        if (size == 0) {
            System.out.println("No such element");
            return;
        }
        Node tmp = tail;
        while(tmp != null){
            if(tmp.getData() == value) {
                removing(tmp);
                break;
            }
            tmp = tmp.getPrevious();
        }
        if(tmp != null)
            System.out.println("value = " + tmp.getData() + " removed");
        else
            System.out.println(" No such element");
    }

    /**
     * Does the removing
     * @param tmp
     */
    private void removing(Node tmp){
        if(tmp.getPrevious() != null)
            tmp.getPrevious().setNext(tmp.getNext());
        else
            head = tmp.getNext();
        if(tmp.getNext() != null)
            tmp.getNext().setPrevious(tmp.getPrevious());
        else
            tail = tmp.getPrevious();
        tmp.setPrevious(null);
        tmp.setNext(null);
    }
}