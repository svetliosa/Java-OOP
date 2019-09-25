
public class Person {
private String firstName;
private String lastName;
private int age;

public Person(String fName,String lName,int age)
{
	this.firstName=fName;
	this.lastName=lName;
	this.age=age;}
public String getFirstName() {return firstName;}
public String getLastName() {return lastName;}
public int getAge() {return age;}
public int compareTo(Person anotherPerson) 
{
	if(this.age<anotherPerson.age) {
		return -1;
	}
	if(this.age>anotherPerson.age) {
		return 1;
	}
	return 0;	
}
public String toString() {return "Name:"+firstName+ " "+lastName+", age:"+age;}
}
