import java.util.*;
class Multiply
{
	double op_one,op_two;
	Scanner sc = new Scanner(System.in);
	double mul()
	{
        return (op_one * op_two);
	}
	double add()
	{
         return (op_one + op_two);
	}
	double sub()
	{
           return (op_one - op_two);
	}
	double divide()
	{
		return (op_one / op_two);
	}
	void getData()
	{

		System.out.println("Enter the first operand");
		op_one = sc.nextDouble();
		System.out.println("Enter the second operand");
		op_two = sc.nextDouble();
	}
	void clearScreen()
	{
		System.out.print("\033[H\033[2J");
	}
}
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Multiply mull = new Multiply();
		char key;
        do
        {
        	System.out.println("Press M for multiplication"+"\n"+
        		                "Press A for addition"+"\n"+
        		                "Press S for subtraction"+"\n"+
        		                "Press D for divide");
            char number = sc.next().charAt(0);
        	switch(number)
        	{

        		case 'M':
        		case 'm':
        		mull.getData();
                System.out.println(mull.mul());
                break;

                case 'A':
                case 'a':
                mull.getData();
                System.out.println(mull.add());
                break;

                case 'S':
                case 's':
                mull.getData();
                System.out.println(mull.sub());
                break;

                case 'D':
                case 'd':
                mull.getData();
                System.out.println(mull.divide());
                break;

                default:
                System.out.println("Wrong input");

        	} 
           System.out.println("To continue press 1 or press anyother key to exit");
           key = sc.next().charAt(0);
           mull.clearScreen();
        } while(key== '1');
    }
}