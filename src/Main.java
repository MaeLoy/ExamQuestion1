//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Scanner scanner = new Scanner(System.in);

String [] productNames = {"Nights Monarch mattresses" , "Restonic Barbados mattress" , "Sealy Phuket mattress"};
int [][] sales = new int[3][3];

//Sales
    for (int row = 0; row<productNames.length;row++) {
        for (int col=0; col<sales[row][col].length; col++) {
            System.out.println("Enter Number of sales for" + (col+1) + "for" +productNames[row] + ":");
            sales[row][col]= scanner.nextInt();
        }
        System.out.println();
    }
    Product product = new product(productNames,sales);

    System.out.println("PRODUCT SALES REPORT - 2026");
    System.out.println();

    System.out.println("*******************************************************");

    System.out.println("TOTAL PRODUCT SALES" + product.calculateTotalSales());

    System.out.println("AVARAGE PRODUCT SALES:");

    produc
}
