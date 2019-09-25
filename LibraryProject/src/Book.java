public class Book implements Comparable<Object>{
    private String headline;
    private String author;
    private int year;

    public Book(String headline, String author, int year){
        this.headline = headline;
        this.author = author;
        this.year = year;
    }

    public void SetHeadline(String headline) {
        this.headline = headline;
    }

    public String GetHeadline() {
        return this.headline;
    }

    public void SetAuthor(String author) {
        this.author = author;
    }

    public String GetAuthor(){
        return this.author;
    }

    public void SetYear(int year) {
        this.year = year;
    }

    public int GetYear() {
        return this.year;
    }

    public String toString() {
        return "Headline: " + this.headline + " Author: " + this.author + " Year: " + this.year + "\n";
    }

    public int compareTo(Object o) {
        if(this.year < ((Book)o).year)
            return -1;
        if(this.year > ((Book)o).year)
            return 1;

        return 0;
    }

    public boolean equals(Object o) {
        return this.year == ((Book)o).year;
    }
}
