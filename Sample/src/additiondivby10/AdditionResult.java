package additiondivby10;

public class AdditionResult extends Addition {
	public void result()
	{
		int res= super.add(10,20);
		if(res%10==0)
			{
				System.out.println("The sum of the numbers are divisible by 10");
			}
		else
			{
			System.out.println("Sum of the numbers are not divisible by 10");
			}
		
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	AdditionResult obj=new AdditionResult();
	obj.result();
}

	

}
