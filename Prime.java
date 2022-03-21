class Prime
{
public static void main(String args[])
{
int a=7;
boolean p=false;
for(int n=2;n<=a-1;n++)
{
if(a%n==0)
{
p=true;
break;
}
}
if(!p)
System.out.println(a+ "is prime");
else
System.out.println(a+ "is not prime");
}
}