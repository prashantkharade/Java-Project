package calculator;

import java.util.Scanner;

public class calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		 String[] b = {"1=>Arithmetic","2=>unary", "3=>Assignment ", "4=>Relational", "5=>Logical"};
		for(int i=0;i<5;i++)
		{
			System.out.print(b[i]+"\t");
			
		}
		System.out.println();
		System.out.print("Enter the choice : ");
	      Scanner sc1 = new Scanner(System.in);
			int c = sc1.nextInt();
			int x,y,z;
		switch(c)
		{
		default :
		{
			System.out.println("Entered wrong choice");
			break;
		}
		
		case 1:
			 String[] b1 = {"1=>Addition","2=>Substraction", "3=>Multiplication", "4=>Division", "5=>Modulus"};
				for(int i=0;i<5;i++)
				{
					System.out.print(b1[i]+"\t");
					
				}
				System.out.println();
			System.out.print("Enter the choice : ");
		   
				int a = sc1.nextInt();
				
				switch(a)
				{
			    	case 1:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    		z = x + y;
			    		System.out.println("Addition is : "+z);
			    		break;
			    	case 2:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    		z = x - y;
			    		System.out.println("Substraction is : "+z);
			    		break;
			    	case 3:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    		z = x * y;
			    		System.out.println("Multiplication is : "+z);
			    		break;
			    	case 4:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    		z = x / y;
			    		System.out.println("Division is : "+z);
			    		break;
			    	case 5:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    		z = x % y;
			    		System.out.println("Modulus is : "+z);
			    		break;
			    	default:
			    		System.out.println("Wrong choice entered");
				}
				break;
		case 5:
			 String[] b5 = {"1=>AND","2=>OR", "3=>XOR"};
				for(int i=0;i<3;i++)
				{
					System.out.print(b5[i]+"\t");
					
				}
				System.out.println();
				System.out.print("Enter the choice : ");
			 //     Scanner sc2 = new Scanner(System.in);
					int a5 = sc1.nextInt();
					boolean x2,y2,z2;
					switch(a5)
					{
				    	case 1:
				    		System.out.print("Enter Frist boolean value : ");
				    		x2 = sc1.nextBoolean();
				    		System.out.print("Enter second boolean value : ");
				    		y2 = sc1.nextBoolean();
				    		z2 = x2 && y2;
				    		System.out.println("Bitwise AND is : "+z2);
				    		break;
				    	case 2:
				    		System.out.print("Enter Frist boolean value : ");
				    		x2 = sc1.nextBoolean();
				    		System.out.print("Enter second boolean value : ");
				    		y2 = sc1.nextBoolean();
				    		z2 = x2 | y2;
				    		System.out.println("OR is : "+z2);
				    		break;
				    	case 3:
				    		System.out.print("Enter Frist boolean value : ");
				    		x2 = sc1.nextBoolean();
				    		System.out.print("Enter second boolean value : ");
				    		y2 = sc1.nextBoolean();
				    		z2 = x2 ^ y2;
				    		System.out.println("XOR is : "+z2);
				    		break;


				    	default:
				    		System.out.println("Wrong choice entered");
				    	
					}
					break;
		case 2:
			 String[] b2 = {"1=>Pre-Increment ","2=>Post-Increment","3=>Pre-Decrement ","4=>Post-Decrement ", "5=>Logical not"};
				for(int i=0;i<5;i++)
				{
					System.out.print(b2[i]+"\t");
					
				}
				System.out.println();
				System.out.print("Enter the choice : ");
				int a2 = sc1.nextInt();
				int x1;
				switch(a2)
				{
				case 1:
					System.out.print("Enter no : ");
		    		x1 = sc1.nextInt();
		    		System.out.println("Pre-Increment is : "+(++x1));
		    		break;
				case 2:
					System.out.print("Enter no : ");
		    		x1 = sc1.nextInt();
		    		System.out.println("Post-Increment is : "+(x1++));
		    		break;
				case 3:
					System.out.print("Enter no : ");
		    		x1 = sc1.nextInt();
		    		System.out.println("Pre-Decrement is : "+(--x1));
		    		break;
				case 4:
					System.out.print("Enter no : ");
		    		x1 = sc1.nextInt();
		    		System.out.println("Post-Decrement is : "+(x1--));
		    		break;
				case 5:
					System.out.print("Enter Boolean value : ");
		    		x2 = sc1.nextBoolean();
		    		System.out.println("Logical not is : "+(!x2));
		    		break;
				default:
		    		System.out.println("Wrong choice entered");	
				}
				break;
		case 3:
			 String[] b3 = {"1=> +=","2=> -=", "3=> *=", "4=> /=", "5=> %="};
				for(int i=0;i<5;i++)
				{
					System.out.print(b3[i]+"\t");
					
				}
				System.out.println();
			System.out.print("Enter the choice : ");
		   
				int a3 = sc1.nextInt();
				
				switch(a3)
				{
			    	case 1:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    	//	z = x + y;
			    		System.out.println("+= is : "+(x+=y));
			    		break;
			    	case 2:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    	//	z = x - y;
			    		System.out.println("-= is : "+(x-=y));
			    		break;
			    	case 3:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    		//z = x * y;
			    		System.out.println("*= is : "+(x*=y));
			    		break;
			    	case 4:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    	//	z = x / y;
			    		System.out.println("/= is : "+(x/=y));
			    		break;
			    	case 5:
			    		System.out.print("Enter Frist no : ");
			    		x = sc1.nextInt();
			    		System.out.print("Enter second no : ");
			    		y = sc1.nextInt();
			    	//	z = x % y;
			    		System.out.println("%= is : "+(x%=y));
			    		break;
			    	default:
			    		System.out.println("Wrong choice entered");
				}
				break;
		case 4:
			 String[] b4= {"1=>Equal to","2=>Not Equal to","3=>less than","4=>less than or equal to", "5=>Greater than","6=>Greater than or equal to"};
				for(int i=0;i<6;i++)
				{
					System.out.print(b4[i]+"\t");
					
				}
				System.out.println();
				System.out.print("Enter the choice : ");
				int a4 = sc1.nextInt();
				//int x4;
				switch(a4)
				{
				case 1:
		    		System.out.print("Enter Frist no : ");
		    		x = sc1.nextInt();
		    		System.out.print("Enter second no : ");
		    		y = sc1.nextInt();
		    		if(x==y) {System.out.println("numbers are equal");}
		    		else {
		    		System.out.println("Numbers are not equal");
		    		}
		    		break;
		    	case 2:
		    		System.out.print("Enter Frist no : ");
		    		x = sc1.nextInt();
		    		System.out.print("Enter second no : ");
		    		y = sc1.nextInt();
		    		if(x!=y) {System.out.println("numbers are not equal");}
		    		else {
		    		System.out.println("Numbers are equal");
		    		}
		    		break;
		    	case 3:
		    		System.out.print("Enter Frist no : ");
		    		x = sc1.nextInt();
		    		System.out.print("Enter second no : ");
		    		y = sc1.nextInt();
		    		if(x<y) {System.out.println(x+" is less than "+y);}
		    		else {
		    		System.out.println(x+" is greater than or equal to "+y);
		    		}
		    		break;
		    	case 4:
		    		System.out.print("Enter Frist no : ");
		    		x = sc1.nextInt();
		    		System.out.print("Enter second no : ");
		    		y = sc1.nextInt();
		    		if(x<=y) {System.out.println(x+"is less than or equal to "+y);}
		    		else {
		    		System.out.println(x+" is greater than "+y);
		    		}
		    		break;
		    	case 5:
		    		System.out.print("Enter Frist no : ");
		    		x = sc1.nextInt();
		    		System.out.print("Enter second no : ");
		    		y = sc1.nextInt();
		    		if(x>y) {System.out.println(x+" is greater than "+y);}
		    		else {
		    		System.out.println(x+" is less than or equal to "+y);
		    		}
		    		break;
		    	case 6:
		    		System.out.print("Enter Frist no : ");
		    		x = sc1.nextInt();
		    		System.out.print("Enter second no : ");
		    		y = sc1.nextInt();
		    		if(x>=y) {System.out.println(x+"is greater than or equal to "+y);}
		    		else {
		    		System.out.println(x+" is less than "+y);
		    		}
		    		break;
		    	default:
		    		System.out.println("Wrong choice entered");
			}
				break;

		}
		}
		while(true);
      
 	}

}
