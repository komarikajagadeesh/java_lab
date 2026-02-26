 final class student
{
	int rollNumber;
	 void getNumber(int n){
	rollNumber=n;
	}
	 void printNumber()
	{
		System.out.println("the rollno:"+rollNumber);
	}

}
class Test extends student
{
	float part1,part2;
	void getMarks(float a,float b){
		part1=a;
		part2=b;
	}
	void putMarks()
	{
		System.out.println("the part1 marks is:"+part1);
		System.out.println("the part2 marks is:"+part2);

	}

}
interface sports
{
	float sportwt=6.0f;
	void putwt();
}
class results extends Test implements sports
{
	float total;
	public void putwt(){
	System.out.println("the sportwt:"+sportwt);

	}
	void display(){
		total=part1+part2+sportwt;
		System.out.println("the total marks is:"+total);
		System.out.println("the rollno is:"+rollNumber);

	}

}
class MultipleInheritance
{
	public static void main(String[] args){
	results a=new results();
	a.getNumber(10);
	a.printNumber();
	a.getMarks(10.5F,11.1F);
	a.putMarks();
	a.putwt();
	a.display();
	}
}