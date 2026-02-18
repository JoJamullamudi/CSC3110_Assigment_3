public class DLNode {

    DLNode prev;
    DLNode next;
    Song song;

    public DLNode(Song song) {
        this.prev = null;
        this.next = null;
        this.song = song;
    }

}
