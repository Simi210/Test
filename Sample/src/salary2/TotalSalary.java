package salary2;

public class TotalSalary extends HraCalculate {
		public void total()
			{
				super.hra();
				int tot=basic+hr+bon-ded-pf;
				System.out.println("TOTAL : " +tot);
			}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TotalSalary obj=new TotalSalary();
			obj.total();
		}

	}

	

