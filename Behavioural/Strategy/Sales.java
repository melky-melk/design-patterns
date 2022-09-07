interface SalesPricing{
	public double getTotal();
}

class SalePricingContext{
	private SalePricing salePricing;

	// sets the salePricing to know what method it is going to use
	public SalePricingContext(SalePricing salePricing){
		this.salePricing = salePricing;
	}

	// it uses the specific class it takes in to do the process
	public double getTotal(int quantity, double price){
		return this.salePricing.getTotal(quantity, price);
	}
}

class SalePricingNormal implements SalePricing{

	// gets the total like normally
	public double getTotal(int quantity, double price)	{return quantity * price;}
}

class SalePricingWithDiscount implements SalePricing{
	private double discount = 0.0;

	// does the same get total but with a discound
	public double getTotal(int quantity, double price)	{return quantity * price * discount;}
}

class SalePricingWithCashBack implements SalePricing{
	private double discount = 0.0;
	private double threshold = 0.0;

	// does the discount calculation but has a threshold it cant go over
	public double getTotal(int quantity, double price)	{return quantity * price * discount;}
}

public class Sales{
	public static void main(String[] args){
		// first creates a sale pricing, with the specific kind of sale pricing afterwards
		SalePricing salePricing = new SalePricingNormal();

		// then making the context using the specific salePricing set
		SalePricingContext context = new SalePricingContext(salePricing);

		// this will use the normal sale pricing
		double total = context.getTotal(6, 4);
		System.out.println("The total money you need to pay is " + total);
	}
}