class Prime2
{
public static void main(String args[])
{
int c=0,n=0,j=1,i=1,oe=0;
while(n<100)
{
	j=1;
	c=0;
	while(j<=i)
	{
		if(i%j==0)
		{
			c=c+1;
		}
		j++;
	}
	if(c==2)
	{
		System.out.println(+i);
	}
	n++;
	i++;
}
}
}