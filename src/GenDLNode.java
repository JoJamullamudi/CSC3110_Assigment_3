public class GenDLNode<T> {

    GenDLNode<T> prev;
    GenDLNode<T> next;
    T ob;

    public GenDLNode(T ob) { //makes the object an DLNode
        this.prev = null;
        this.next = null;
        this.ob = ob;
    }

}
