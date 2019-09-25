import java.io.File;
import java.io.IOException;
import java.util.*;

public class Group implements IReader{
    private List<Student> students= new ArrayList<Student>();
    private String fname;

    public Group(String fname)
    {
        this.fname = fname;
        Load();
    }

    public void Print(){
        System.out.println(students);
    }

    public void SortByFN(){
        students.sort(Comparator.comparing(Student::GetFn));
    }

    public void SortByPoints(){
        Collections.sort(students);
    }

    @Override
    public void Load() {
        students.clear();

        try {
            Scanner sc = new Scanner(new File(fname));
            while(sc.hasNextLine()) {
                students.add(new Student(sc.next(), sc.nextDouble()));
            }
            sc.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
