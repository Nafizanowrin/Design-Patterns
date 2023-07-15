//method with parameters
// import java.io.*;

class Method 
{
	public static void main(String[] args) 
	{									
		String str = example("Method");    // call method pass value to the parameter
		System.out.println(str);		        // return value store in a str
	}

	public static String example(String para)	// para is a parameter of type String inside
	{ 
		return "Hello " + para;					// method name method return String
	}
}


//Output:Hello Method