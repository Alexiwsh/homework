package homework;

import java.util.Random;
import java.util.Scanner;
public class homework {

	private static Random random = new Random();
	
	private static String natural_divide()
	{
		float q = 21;
		float w = 8;
		return q + " / " + w + " = " + (q / w);
	}
	private static String number_sum()
	{
		int n = random.nextInt(99);
		return "The variable n is: " + n + "; The sum of digitals: " + ((n / 10) + (n % 10) );
	}
	private static String rounded_num()
	{
		double num = random.nextDouble() * 10;
		return "The variable num is: " + num + "; Rounded version: " + Math.round(num);
	}
	private static String three_digit_sum()
	{
		int num = random.nextInt(899) + 100;
		int sum = 0;
		String ret = "The vaiable num is: " + num + "; it's digit's sum: ";
		while(num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
		return ret + sum;	
	}
	
	private static String weight_on_moon()
	{
		float num = (float) random.nextDouble() * 100;
		return "Your Weight on Earth: " + num + "; Your Weight on Moon: " + (num * 0.17);
	}
	
	private static String greater_of_two()
	{
		int num = random.nextInt();
		int num2 = random.nextInt();
		return (num > num2 ? num : num2) + " is greater than " + (num > num2 ? num2 : num);
	}
	
	private static String parity_check()
	{
		int num = random.nextInt(10000);
		return num + " is " + (num % 2 == 0 ? "even " : "odd ") + "number";
	}
	
	private static String double_is_the_integer()
	{
		double num = random.nextDouble() * 100;
		return num + " is " + (num - (int)num > 0 ? "not" : null) + " integral";
	}
	
	private static String show_name()
	{
		Scanner scanin = new Scanner(System.in);
		System.out.println("Enter Your name");
		String name = scanin.nextLine();
		return "Your name: " + name;
	}
	
	private static String multiplication_table()
	{
		Scanner scanin = new Scanner(System.in);
		String ret = "";
		System.out.println("Enter a num");
		int choice = scanin.nextInt();
		for(int i = 1; i <= 9; ++i)
			ret += choice + " * " + i + " = " + choice * i + "\n";
		return ret;
	}
	
	private static String travel_time()
	{
		int time_travel;
		int distance;
		System.out.println("Введите дистанцию в метрах");
		Scanner scanin = new Scanner(System.in);
		distance = scanin.nextInt();
		System.out.println("Введите временной промежуток");
		time_travel = scanin.nextInt();
		return "За время " + time_travel + " требуется ехать со скоростью " + ((float)distance / time_travel) / 1000 + "км/ч чтобы проехать " + distance + " метров";
	}
	
	public static void main(String[] args) {
		while(true)
		{
			Scanner scanin = new Scanner(System.in);
			System.out.println("Enter a number, which function you want call or 0 to quit");
			int choice = scanin.nextInt();
			String output = "";
			if(choice == 0)
				break;
			scanin.reset();
			switch(choice) {
			case 1:
				output = natural_divide();
				break;
			case 2:
				output = number_sum();
				break;
			case 3:
				output = rounded_num();
				break;
			case 4:
				output = three_digit_sum();
				break;
			case 5:
				output = weight_on_moon();
				break;
			case 6:
				output = greater_of_two();
				break;
			case 7:
				output = parity_check();
				break;
			case 8:
				output = double_is_the_integer();
				break;
			case 9:
				output = show_name();
				break;
			case 10:
				output = multiplication_table();
				break;
			case 11:
				output = travel_time();
				break;																												
			}
			System.out.println(output);
			
		}
	}

}