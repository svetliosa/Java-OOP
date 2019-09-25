import java.io.*;
import java.util.*;
public class StudentList {
private List<Student> students=new ArrayList<Student>();
public StudentList(String fileName) {
	try {
		Scanner sc=new Scanner(new File(fileName));
		while(sc.hasNextLine()) {
			students.add(new Student(sc.next(),sc.next(),sc.nextInt(),sc.next()));
		}
		sc.close();
		}catch(IOException e) {e.printStackTrace();}
	}
public void showList() {System.out.println(students.toString());}
public void sortByFirstName() {
	Collections.sort(students,new Comparator<Student>() 
			{public int compare(Student s1,Student s2) {return s1.getFirstName().compareTo(s2.getFirstName());}
			});
}
public void sortByLastName() {
	Collections.sort(students,new Comparator<Student>() 
			{public int compare(Student s1,Student s2) {return s1.getLastName().compareTo(s2.getLastName());}
			});
}
public void sortByFN() {
	Collections.sort(students);
}
public static void main(String[] args) {
	StudentList s=new StudentList("Text");
	s.showList();
	s.sortByLastName();
	s.showList();
	s.sortByFirstName();
	s.showList();
	s.sortByFN();
	s.showList();
	
}          
}
 