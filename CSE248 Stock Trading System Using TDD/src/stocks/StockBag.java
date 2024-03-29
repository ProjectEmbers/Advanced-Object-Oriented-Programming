package stocks;

public class StockBag 
{
	private Stock[] stockArr;
	private int nElems;

	public StockBag(int maxSize) 
	{
		stockArr = new Stock[maxSize];
		nElems = 0;
	}

	public void insert(String instrument, double shares, double price)
	{
		stockArr[nElems++] = new Stock(instrument, shares, price);
	}
	
	
	public double getGrandTotal()
	{
		double grandTotal = 0;
		for(int i = 0; i < nElems; i++) 
		{
			grandTotal += (stockArr[i].getShares() * stockArr[i].getPrice());
		}
		return grandTotal;
	}
	
	

}
