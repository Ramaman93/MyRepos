
/*
final class finalExample
{
int a=10;
}

class finalInit extends finalExample
{
int b=10;

public static void main(String [] args)
{


}


}
*/

class finalExample
{
public  void show()
{
System.out.println("grandparent show"); 

}
}

class finalInit extends finalExample
{
public void show()
{
System.out.println("parent show"); 

}

}

class finalInitchild extends finalInit 
{
	 public final void show()
	{
		System.out.println("grand child show"); 

	}

public static void main(String [] args)
{
finalExample f=new finalInit();
f.show(); 
finalInit f1=new  finalInitchild();
f1.show();
}

}