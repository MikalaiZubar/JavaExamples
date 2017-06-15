
public class Child extends Parent{
	
	public int x=3;
	public String str = "Hello"; 
	
	public Child(){
		super();
		System.out.println(str +" "+ x);
	}
	

	public void print(){
		System.out.println(str+" "+x);
	}
}
