import java.util.*;
import java.io.*;
public class Employeeinfo {
public static void main(String arg[]) {
	int f=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the array");
int n=in.nextInt();
Employe e[]=new Employe[n];
for(int i=0;i<n;i++) {
e[i]=new Employe();
e[i].input();
System.out.println("\n");

}
System.out.println("\n display \n");
for(int i=0;i<n;i++)
{
e[i].display();
System.out.print("\n");
}
System.out.println("Enter the employee number of employee to be searched");
int empno=in.nextInt();
for(int i=0;i<n;i++)
{
if(e[i].eno==empno)
{
e[i].display();
System.out.print("\n");
f=1;
}
}
if(f!=1) {
	System.out.println("Employee doesnot exists");
}
}
}
class Employe{
String ename;
int eno;
int esalary;
public void input() {
Scanner in=new Scanner(System.in);
System.out.println("\n enter the employee name");
this.ename=in.nextLine();
System.out.println("enter the employee number");
this.eno=in.nextInt();
System.out.println("enter the employee salary");
this.esalary=in.nextInt();
}
void display() {
System.out.println("enter the number :" +eno);
System.out.println("enter the name :" +ename);
System.out.println("enter the number :" +esalary);
}

}
