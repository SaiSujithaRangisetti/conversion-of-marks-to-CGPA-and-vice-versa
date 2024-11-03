import java.util.Scanner;
public class Calculate{
public static void main(String...x)
{
String sn,cn;
int rn,m,ch;
double cgpa;
System.out.println("							WELCOME TO STUDENT RESULT CALCULATOR");
Scanner sca=new Scanner(System.in);
System.out.println("Enter the name of the Student		     		 :");
sn=sca.nextLine();
System.out.println("Enter college RollNumber			       	 :");
rn=sca.nextInt();
sca.nextLine();
System.out.println("Enter the name of the College		     		 :");
cn=sca.nextLine();
System.out.println("Enter your CGPA				    	 	 :");
cgpa=sca.nextDouble();
System.out.println("Your marks corresponding to CGPA "+cgpa+" is		  :"+(cgpa*9.5));
System.out.println("Enter your marks					 :");
m=sca.nextInt();
System.out.println("Your CGPA corresponding to Marks "+m+" is			 :"+(m/9.5));
}
}
