import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void addToCollection(Book book){
        if (this.collection.size() < this.capacity) {
            this.collection.add(book);
        }
    }
}
