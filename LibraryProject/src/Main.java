public class Main {
    public static void main(String[] args) {
        String fname = "data";
        Library library = new Library(fname);

        library.Print();
        System.out.println(library.SortByAuthor());

        System.out.println("Oldest book: " + library.OldestBook());
    }
}
