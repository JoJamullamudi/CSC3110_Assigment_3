public class AList {
    private Song[] alist;
    private int size;
    private int maxSize;


    public AList() {
        maxSize = 10;
        alist = new Song[maxSize];
        size = 0;
    }


    public void addy(Song p) {
        if (size == maxSize) {
            maxSize = maxSize * 2;
            Song[] newData = new Song[maxSize];
            for (int a = 0; a < size; a++)
            {
                newData[a] = alist[a];
            }
            alist = newData;
        }
        alist[size] = p;
        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            alist[i] = alist[i + 1];
        }
        alist[size - 1] = null;
        size--;
    }

    public String toString() {

        String elements = "";
        for (int a = 0; a < size; a++)
        {
         elements = elements + alist[a] + "\n";
        }
        return elements
    }


}
