package semesterII_java; //package 

public class practice{    // public is keyword of visibility, class is to announce class in java, practice is name
	public int add(int a, int b)  // int is return type(int), add is the name of method(integer a and integer b)
	{
		int result = a + b; //body method
		return result;	//return type result 
	}
	public static void main(String[] args)	// static is keyword no need to create object to invoke, void means no need to return, 
	{										//and main is main function execution start from here,(String[] args) to display string
		practice pra = new practice();		// create object to invoked by keyword new
		int result = pra.add(2, 4);			// add a and b 
		System.out.print(result);			// method to display to standard output(screen)
	}
}