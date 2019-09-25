public class Main {
    public static void main(String[] args){
        String fname = "data";
        Group group = new Group(fname);

        group.Print();

        group.SortByFN();
        group.Print();

        group.SortByPoints();
        group.Print();
    }
}
