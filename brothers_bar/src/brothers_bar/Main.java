package brothers_bar;

public class Main extends Functionality {
	public static void main(String []args)
	{
		int rounds;
		int n=get_number_of_drinks();
		if(n<3)
		{
			System.out.println("There are 0 possible rounds!");
			return;
		}
		int glasses[] = new int[n];
		glasses=get_arr_of_sizes(n);
		rounds=number_of_rounds(glasses);
		System.out.println("There are " + rounds + " possible rounds!");
		
	}
}
