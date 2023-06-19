package salary2;

public class HraCalculate extends Basicpay{
	
		int hr,pf;
		public void hra()	
			{
			
				super.basic(30000,2000,6000);
				 hr=(30000 *5)/100;
				 pf=(30000*20)/100;
				System.out.println("SALARY SLIP  " );
				System.out.println("***************** " );
				System.out.println("BASIC : " +basic);
				System.out.println("DEDUCTION : " +ded);
				System.out.println("BONUS : " +bon);
				System.out.println("HRA : " +hr);
				System.out.println("PF : " +pf);
				
			}

		public static void main(String[]args) {
			HraCalculate obj=new HraCalculate();
			obj.hra();
		}

	}

	

