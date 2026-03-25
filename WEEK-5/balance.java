package mypack;
public class balance
{
String name;
double bal;
public balance(String n, double b)
{
name=n;
bal=b;
}
public void show()
{
if(bal<0)
System.out.println("-->");
System.out.println(name + ":$" + bal);
}
}