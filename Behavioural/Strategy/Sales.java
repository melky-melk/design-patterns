interface SalesPricing{
	public double getTotal();
}

class SalePricingContext{
	private SalePricing salePricing;

	public SalePricingContext(SalePricing salePricing){
		this.salePricing = salePricing;
	}

	// it uses the specific class it takes in to do the process
	public double getTotal(int quantity, double price){
		return this.salePricing.getTotal(quantity, price);
	}
}

class SalePricingNormal implements SalePricing{
	public double getTotal(int quantity, double price){
		return quantity * price;
	}
}

class SalePricingWithDiscount implements SalePricing{
	private double discount = 0.0;

	public double getTotal(int quantity, double price){
		return quantity * price * discount;
	}
}

class SalePricingWithCashBack implements SalePricing{
	private double discount = 0.0;
	private double threshold = 0.0;

	public double getTotal(int quantity, double price){
		return quantity * price * discount;
	}
}

public class Sales{
	public static void main(String[] args){
		SalePricing salePricing = new SalePricingNormal();

		SalePricingContext context = new SalePricingContext(salePricing);

		double total = context.getTotal(6, 4);
		System.out.println("The total money you need to pay is " + total);
	}
}