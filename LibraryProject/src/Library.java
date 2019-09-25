import java.io.File;
import java.io.IOException;
import java.util.*;

public class Library implements IReadFromFile{
    private String fname;
    private Set<Book> books = new TreeSet<Book>();

    public Library(String fname)
    {
        ReadFromFIle(fname);
    }

    public Book OldestBook(){
        return Collections.min(books);
    }

    public Set<Book> SortByAuthor() {
        Set<Book> sorted = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.GetAuthor().compareTo(b2.GetAuthor());
            }
        });

        sorted.addAll(books);
        return sorted;
    }

    public void Print() {
        System.out.println(books);
    }

    public void ReadFromFIle(String fname) {
        books.clear();
        try {
            Scanner sc = new Scanner(new File(fname));
            while (sc.hasNextLine()) {
                books.add(new Book(sc.next(), sc.next(), sc.nextInt()));
            }
        } catch (IOException e) {
            System.out.println("exception");
        }
    }
}
