class saksham {
	private int id;
	private String name;
public saksham() {
	id=0;
	name="your-name-here";
}

public saksham (String myname, int myid) {
	name=myname;
	id=myid;
}

public saksham (String myname) {
	name=myname;
	id=0;
}
public String getname() {
	return name;
}
public void setname(String n) {
	this.name=n;
}
public int getid() {
	return id;
}
public void setid(int i) {
	this.id=i;
}
}
public class constructor {
	public static void main(String[] args)
{
	saksham harry = new saksham("lalit");
	saksham lakshya = new saksham("sumit", 12);
	saksham rohit = new saksham();
	System.out.println(harry.getid());
	System.out.println(harry.getname());
}}