public class DLList {

    DLNode head;
    DLNode tail;

    public DLList() {
        head = null;
    }

    public void addy(Song s) {
        DLNode node = new DLNode(s);

        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

    }

    public void removy(int pos) {
        if (pos < 0 || head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }


        DLNode current = head;
        for (int a = 0; a < pos && current.next != null; a++) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        DLNode pred = current.prev;
        DLNode succ = current.next;

        if (pred != null) {
            pred.next = succ;
        }
        if (succ != null) {
            succ.prev = pred;
        }
        if (current.next == null) {
            tail = pred;
        }
    }
        public String toString(){
            String allNodes = "";
            DLNode current = head; // start at head

            while(current != null){
                allNodes = allNodes + current.song.toString() + "\n"; //print
                current = current.next; // next node
            }

            return allNodes;
        }

    }

