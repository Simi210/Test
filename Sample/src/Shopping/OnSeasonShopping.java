package Shopping;

public class OnSeasonShopping extends OffShopping {
	int it5,it6, it7,tot1, discount1;
	public void shoping(int item5,int item6,int item7)
	{
		super.shoping(1000,500,890);
		this.it5=item5;
		this.it6=item6;
		this.it7=item7;
		tot1=it5+it6+it7;
		discount1=(tot1*40)/100;
		int paid=tot1-discount1;
		System.out.println("OnSeason Discount Amount : " +discount1);
		System.out.println("Payable Amount in onseason : " +paid);
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	OnSeasonShopping  obj=new OnSeasonShopping();
	obj.shoping(1000,500,890);
}

}
