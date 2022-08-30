package calculator;

import java.util.Scanner;

public class calculator {
static	int x,y,z;
static boolean x1,y1,z1;
calculator(int x,int y, int z)
{
this.x = x;
this.y = y;
this.z=z;
}
void add()
{
	 z=x+y;
		
}
void sub()
{
	z=x-y;
}
void mul()
{
	z=x*y;
}
void div()
{
	z=x/y;
}
void mod()
{
	z=x%y;
}
void preinc()
{
	z=(++x);
}
void postinc()
{
	z=(x++);
}
void predec()
{
	z=(--x);
}
void postdec()
{
	z=(x--);
}
void not(boolean x1)
{
	z1=(!x1);
}
void pe()
{
	z=(x+=y);
}
void se()
{
	z=(x-=y);
}
void me()
{
	z=(x*=y);
}
void de()
{
	z=(x/=y);
}
void moe()
{
	z=(x%=y);
}
void equalto()
{
	if(x==y)
	{
		System.out.println("Numbers are equal");
	}
	else {
		System.out.println("Numbers are not equal");
	}
}
void notequalto()
{
	if(x!=y)
	{
		System.out.println("Numbers are not equal");
	}
	else
	{
		System.out.println("Numbers are equal");
	}
}
void less()
{
	if(x<y)
	{
		System.out.println("First no is less than second number");
	}
	else {
		System.out.println("First no is not less than or equal to second");
	}
}
void lessequal()
{
	if(x<=y)
	{
		System.out.println("First no is less than or equal to second number");
	}
	else {
		System.out.println("First no is greater than second number");
	}
}
void greater()
{
	if(x>y)
	{
		System.out.println("First no is greater than second number");
	}
	else {
		System.out.println("First no is not greater than or equal to second");
	}
}
void greaterequal()
{
	if(x>=y)
	{
		System.out.println("First no is greater than or equal to second number");
	}
	else {
		System.out.println("First no is less than second number");
	}
}
void and()
{
	z1=(x1&&y1);
}
void or()
{
	z1=(x1||y1);
}
void xor()
{
	z1=(x1^y1);
}
void show()
{
	System.out.println(z);
}
void show1()
{
	System.out.println(z1);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ente Frist value");
			x=sc.nextInt();
			System.out.println("Ente Second value");
			y=sc.nextInt();
		System.out.println("Enter the choice");
		String[][] b = {{"1=>Addition","2=>Substraction", "3=>Multiplication", "4=>Division", "5=>Modulus","6=>Pre-Increment"},{"7=>Post-Increment",
				"8=>Pre-Decrement","9=>Post-Decrement","10=>Not","11=>Add and equal to","12=>Subtract equal to"},{"13=>multiply equal to",
				"14=>Divide equal to","15=>Mod equal to","16=>Equal to","17=>Not Equal to","18=>Less than"},{"19=>Less than or equal to",
				"20=>Greater than","21=>Greatere than or equal to","22=>Logical AND","23=>Logical OR","24=>logical XOR"}};
		for(int i=0;i<4;i++)
		{ 
			for(int j=0;j<6;j++)
			{
			
			System.out.print(b[i][j]+"\t");
			}
			
			
				System.out.println();
			}
		
		
		
	
		// x1;
		calculator c = new calculator(x,y,z);
		//c.show();
		System.out.println("Enter choice");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			c.add();
			System.out.println("Addition is");
			c.show();
			break;
		case 2:
			c.sub();
			System.out.println("Substrsction is");
			c.show();
			break;
		case 3:
			c.mul();
			System.out.println("Multiplication is");
			c.show();
			break;
		case 4:
			c.div();
			System.out.println("Division is");
			c.show();
			break;
		case 5:
			c.mod();
			System.out.println("modulus is");
			c.show();
			break;
		case 6:
			c.preinc();
			System.out.println("Pre increment is :  ");
			c.show();
			break;
		case 7:
			c.postinc();
			System.out.println("Post increment is :  ");
			c.show();
			break;
		case 8:
			c.predec();
			System.out.println("Pre decrement is :  ");
			c.show();
			break;
		case 9:
			c.postdec();
			System.out.println("Post decrement is :  ");
			c.show();
			break;
		case 10:
			System.out.println("Enter boolean value");
			x1=sc.nextBoolean();
			c.not(x1);
			System.out.println("Logical NOT is :  ");
			c.show();
			break;
		case 11:
			c.pe();
			System.out.println("plus equal to += is");
			c.show();
			break;
		case 12:
			c.se();
			System.out.println("Substrsct equal to -= is");
			c.show();
			break;
		case 13:
			c.me();
			System.out.println("Multiply equal to *= is");
			c.show();
			break;
		case 14:
			c.de();
			System.out.println("Division equal to /= is");
			c.show();
			break;
		case 15:
			c.moe();
			System.out.println("Modulus equal to %= is");
			c.show();
			break;	
		case 16:
			c.equalto();
		//	System.out.println("Both vslues are equal");
		//	c.show();
			break;
		case 17:
			c.notequalto();
		//	System.out.println("Both values are different");
			//c.show();
			break;
		case 18:
			c.less();
			//System.out.println("First value is less than second");
			//c.show();
			break;
		case 19:
			c.lessequal();
			//System.out.println("First value is less than or equal to second");
			//c.show();
			break;
		case 20:
			c.greater();
			//System.out.println("First value is greater than second");
			//c.show();
			break;
		case 21:
			c.greaterequal();
			//System.out.println("First value is greater than or equal to second");
			//c.show();
			break;
		case 22:
			System.out.println("Enter boolean value 1");
			x1=sc.nextBoolean();
			System.out.println("Enter boolean value 2");
			y1=sc.nextBoolean();
			c.and();
			System.out.println("Logical AND is");
			c.show1();
		case 23:
			System.out.println("Enter boolean value 1");
			x1=sc.nextBoolean();
			System.out.println("Enter boolean value 2");
			y1=sc.nextBoolean();
			c.or();
			System.out.println("Logical OR is");
			c.show1();
		case 24:
			System.out.println("Enter boolean value 1");
			x1=sc.nextBoolean();
			System.out.println("Enter boolean value 2");
			y1=sc.nextBoolean();
			c.xor();
			System.out.println("Logical XOR is");
			c.show1();
			
			
		default:
			System.out.println("Wrong input");	
		}
		
		}
		while(true);
		
		
	}

}
