public class GenDLList <T> {

    GenDLNode<T> head; // making the head and tail of the list
    GenDLNode<T> tail;

    public GenDLList() { // empty constructor
        head = null;
    }

    public void addy(T s) {
        GenDLNode<T> node = new GenDLNode<>(s);

        if(head == null) { // checks if list empty
            head = node;
            tail = node;
        } else {
            tail.next = node; // the new node is after the tail
            node.prev = tail; // the previous node is pointing to the tail
            tail = node; // now the tail is the new node
        }

    }

    public void removy(int pos) {
        if (pos < 0 || head == null) { // checks for empty list
            return;
        }

        if (pos == 0) { //removes the head
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else { // after removed chekcs to see if its empty
                tail = null;
            }
            return;
        }


        GenDLNode<T> current = head; // starts at the head
        for (int a = 0; a < pos && current.next != null; a++) { // moving until right before the pos
            current = current.next;
        }

        if (current == null) { // checks if current has a node
            return;
        }

        GenDLNode<T> pred = current.prev;
        GenDLNode<T> succ = current.next;

        if (pred != null) { // if theres a previous node
            pred.next = succ; //pred points to succ
        }
        if (succ != null) { // if theres successive node
            succ.prev = pred; //
        }
        if (current.next == null) { // if tail is remove
            tail = pred;
        }
    }

    public String toString(){ // // makes the list a string
        String allNodes = "";
        GenDLNode<T> current = head;

        while(current != null){
            allNodes = allNodes + current.ob.toString() + "\n"; //make the nodes appear on different lines
            current = current.next;
        }

        return allNodes;
    }




}
