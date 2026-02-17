public class SLList {

    private SLNode head;
    private SLNode tail;

    public SLList() {
        head = null;
        tail = null;
    }

    public void addy(Song s) {
        SLNode node = new SLNode(s);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void removy(int pos) {

        if (pos < 0 || head == null)
        {
            return;
        }

        if (pos == 0)
        {
            head = head.next;

            if (head == null)
            {
                tail = null;
            }
            return;

        }

        SLNode current = head;

        for ( int a = 0; a < pos -1 && current.next != null; a++) {
            current = current.next;
        }

        if (current.next == null) {
            return;
        }

        if (current.next.next == null) {
            tail = current;
        }
        current.next = current.next.next;
    }

    public String toString()
    {
        String allNodes = "";
        SLNode current = head;
        while (current != null) {
            allNodes = allNodes + current.song + "\n";
            current = current.next;
        }
        return allNodes;
    }

}
