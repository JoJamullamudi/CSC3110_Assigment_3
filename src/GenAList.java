public class GenAList<T> {
    Object[] alist;
    int size;
    int maxSize;

    public GenAList() { //empty constructor
        maxSize = 10;
        alist = new Object[maxSize];
        size = 0;
    }

    public void addy(T p) {
        if (size == maxSize) { // if list is full then doubles the size and  creates a new list
            maxSize = maxSize * 2;
            Object[] newData = new Object[maxSize];
            for (int a = 0; a < size; a++) // copies the elements from first list into new bigger list
            {
                newData[a] = alist[a];
            }
            alist = newData; // places the new list with the new size into the old list
        }
        alist[size] = p; // adds object to the end
        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) { // checks if pos is valid if not then returns
            return;
        }
        for (int a = pos; a < size - 1; a++) { //loop starts at pos
            alist[a] = alist[a + 1]; // replaces will the one after
        }
        alist[size - 1] = null; // making the last one null
        size--;
    }

    public String toString() { // makes everything in the list a string

        String elements = "";
        for (int a = 0; a < size; a++)
        {
            elements = elements + alist[a] + "\n";
        }
        return elements;
    }

}
