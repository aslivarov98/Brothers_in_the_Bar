package brothers_bar;
import java.util.Scanner;

public class Functionality extends Drink {
	
	static Boolean check_three(int drink_size, int position, int []arr)
	{
		int n=0;
		Boolean correct=false;
		if(position<arr.length-2)
		for(int i=position; i<position+3; ++i)
		{
			if(arr[i]==drink_size)
				++n;
		}
		if(n==3)
			correct=true;
		return correct;
	}
	
	static int[] remove_three(int position, int []arr)
	{
		int n=arr.length;
		int j=0;
		int []new_arr = new int[n-3];
		for(int i=0; i<n-3; ++i)
		{
			if(i==position)
			{
				j+=3;
			}
			if (j>n)
			{
				return new_arr;
			}
			new_arr[i]=arr[j];
			++j;
			
		}
		return new_arr;
		
	}
	
	static int get_number_of_drinks()
	{
		int n=0;
		int h=0;
		Scanner sc = new Scanner(System.in);
		while (n<1 || n>100000)
		{
			if (h>=1)
			{
				System.out.print("Wrong input! \n");
			}
			System.out.print("Enter the number of drinks that are placed on the bar, \n");
			System.out.print("the number should be greater or equal to 1 and less or equal to 100000!:");
			n=sc.nextInt();
			++h;
		}
		return n;
	}
	
	static int[] get_arr_of_sizes(int n)
	{
		int []sizes = new int[n];
		int h=0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<n; ++i)
		{
			System.out.print("Enter the size of drink number " + i);
			System.out.print(", the number should be greater or equal to 1 and less or equal to 1000000!:");
			h=sc.nextInt();
			sizes[i]=h;
			if(h<1 || h>1000000)
			{
				System.out.println("Wrong input, reenter the size of drink number " + i + "!\n");
				--i;
			}
		}
		sc.close();
		return sizes;
	}
	
	
	
	static int number_of_rounds(int []arr)
	{
		int rounds=0;
		int n=arr.length;
		for (int i=0; i<n; ++i)
		{
			if(check_three(arr[i], i, arr)==true)
			{
				++rounds;
				arr=remove_three(i, arr);
				n=arr.length;
				i=-1;
				
			}
					
		}
		return rounds;
	}

}
