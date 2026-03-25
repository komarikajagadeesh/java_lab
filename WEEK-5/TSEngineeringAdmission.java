class NotEligibleForEngineering extends RuntimeException 
{
NotEligibleForEngineering(String s)
{
super(s);
}
}
class NotEligibleForVJIT extends RuntimeException
{
NotEligibleForVJIT(String s)
{
super(s);
}
}
class TSEngineeringAdmission
{
public static void main(String args[])
{
try{
int TSEAMCETscore = Integer.parseInt(args[0]);
if(TSEAMCETscore < 50){
throw new NotEligibleForEngineering (" not eligible to apply");
}
else if(TSEAMCETscore < 70 && TSEAMCETscore >= 50 )
{
throw new NotEligibleForVJIT (" not able to enroll in VJIT ");
}
else 
{
System.out.println("Welcome to VJIT-Thanks For Your Registration!");
}
}
catch(NotEligibleForEngineering | NotEligibleForVJIT e)
{
System.out.println("Error occured :" );
e.printStackTrace();
System.out.println(e.getMessage());
System.out.println(e.toString());
}
System.out.println("Rest of the Code");
}
}