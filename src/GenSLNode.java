public class GenSLNode<T> {

    T ob;
    GenSLNode<T> next;

    public GenSLNode(T ob) { //makes the object an SLNode
        this.ob = ob;
        this.next = null;
    }

}
