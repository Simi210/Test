package Shopping;

public class OffShopping {
	int it1,it2,it3,tot,discount;
	public void shoping(int item1,int item2,int item3)
		{
			this.it1=item1;
			this.it2=item2;
			this.it3=item3;
			tot=it1+it2+it3;
			discount=(tot*15)/100;
			int paid1=tot-discount;
			System.out.println("OffSeason Discount " +discount);
			System.out.println("Payable Amount in offseason : " +paid1);
		}

}
