
public class Test {

	public static void main(String... str){
	//Parent p = new SubChild();
	
	double v = 0.3f;
	double z = 0.1f;
	System.out.println(v-z);
	
	Child c = new Child();
	
	System.out.println( Parent.class.isInstance(c));
	
	System.out.println(c instanceof Parent);
	
	}
	
	
}
