class amstrong
{
public static void main(String args[])
{
int i=1,sum=0,a=153;
int b=a;
{
while(b!=0)
{
int rem=b%10;
sum=sum+(rem*rem*rem);
b=b/10;
}
if(sum==a)
{
System.out.println("amstrong");
}
else
{
System.out.println("not amstrong");
}
}
}
}