public class Student extends Person implements Comparable <Student>{
	private String f_nom;
	public Student(String fN,String lN,int age,String fNum) {
		super(fN,lN,age);
		this.f_nom=fNum;}
	public String getF_nom() {return f_nom;}
	public void setF_nom() {this.f_nom=f_nom;}
	public boolean equals(Student o) {return this.f_nom.contentEquals(o.f_nom);}
	public String toString() {return super.toString()+" fNumber:"+f_nom+"\n";}
	public int compareTo(Student o){return this.f_nom.compareTo(o.f_nom);}}

