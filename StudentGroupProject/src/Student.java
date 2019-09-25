public class Student implements Comparable<Object>{
    private String fn;
    private double points;

    public Student(String fn, double points){
        this.fn = fn;
        this.points = points;
    }

    public void SetFn(String fn){
        this.fn = fn;
    }

    public String GetFn() {
        return this.fn;
    }

    public void SetPoints(double points){
        this.points = points;
    }

    public double GetPoints() {
        return this.points;
    }

    public String toString(){
        return "FN: " + this.fn + " Points: " + this.points + "\n";
    }

    @Override
    public int compareTo(Object o) {
        if(this.points < ((Student)o).points)
            return -1;
        if(this.points > ((Student)o).points)
            return 1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return this.points == ((Student)obj).points;
    }
}
