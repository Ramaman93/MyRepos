class MethodHiding
{

static void showS()
{
System.out.println("static show method of parent class");
}
 
void showI()
{
System.out.println("Instance show method of parent class");
}
}

class Child extends MethodHiding
{

static void showS()
{
System.out.println("static show method of child class");
}

void showI()
{
System.out.println("Instance show method of child class");
}
public static void main(String [] args)
{
MethodHiding mh=new Child();
mh.showS();//method resolution is done at compile time wheather parent (MethodHiding) class contain showS() method by java compiler.
           //if it has then it proceed otherwise it will genrate a compile rime error.



mh.showI();//method resolution is done at compile time wheather parent (MethodHiding) class contain showI() method by java compiler.
//if it has then it proceed otherwise it will genrate a compile rime error.
//method resoltion is done at runtime wheather child class contain showI() method if it contain child class method will be call by jvm.
}
}

