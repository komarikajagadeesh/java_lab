class  A
{
void callme(){
System.out.println("the callme is a");
}
}
class B extends A
{
	void callme(){
	System.out.println("the callme is b");
	}
}
class C extends B
{
	void callme(){
	System.out.println("the callme is c");
	}
	void callme1(){
	System.out.println("the calme1 is c");
	}
}
class Dispatch
{
	public static void main(String[] args){
	A r;
	r=new A();
	r.callme();
	r=new B();
	r.callme();
	r=new C();
	r.callme();
	}
}
