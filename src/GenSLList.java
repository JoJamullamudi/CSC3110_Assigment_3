public class GenSLList <T> {

    GenSLNode head; // making the head and tail of the list
    GenSLNode tail;

    public GenSLList() { // empty constructor
        head = null;
        tail = null;
    }

    public void addy(T s) {
        GenSLNode<T> node = new GenSLNode<>(s);

        if (head == null) { // checks if list empty
            head = node;
            tail = node;
        } else {
            tail.next = node;  // if not it'll add to the end of the list
            tail = node;
        }
    }

    public void removy(int pos) {

        if (pos < 0 || head == null) // checks if pos is valid
        {
            return;
        }

        if (pos == 0) {
            head = head.next; // removes head of list

            if (head == null) // if list is empty then return
            {
                tail = null;
            }
            return;

        }

        GenSLNode<T> current = head; // starts at the head

        for (int a = 0; a < pos - 1 && current.next != null; a++) { // moving until right before the pos
            current = current.next;
        }

        if (current.next == null) { // if nothing to be removed after
            return;
        }

        if (current.next.next == null) {  // if tail the tail gets removed
            tail = current;
        }
        current.next = current.next.next; // links node before to node after

    }

    @Override
    public String toString() // makes the list a string
    {
        String allNodes = "";
        GenSLNode<T> current = head;
        while (current != null) {
            allNodes = allNodes + current.ob + "\n";//make the nodes appear on different lines
            current = current.next;
        }
        return allNodes;
    }

}
