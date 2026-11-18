public class Product implements IProduct {
    private String[] productNames;
    private int[][] sales;

    public Product(String[].productNames, int[] sales) {
        this.productNames= productNames;
        this.sales = sales;
    }
    @Override
    public int calculateTotalSales() {

        int Total = 0;

        for (int row=0; row<sales.length; row++) {
            for (int col=0; col<sales[row].length;col++){
                total += sales[row][col];
            }
        }
        return total;
    }
}
