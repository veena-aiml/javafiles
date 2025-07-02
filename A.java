interface print
{
void message();
}
class A implements print
{
public void message()
{
System.out.println("hai");
  System.out.println("hello");
}
public static void main(String args[])
{
A a=new A();
a.message();
}
}
