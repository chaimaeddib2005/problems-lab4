package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {   Scanner scan = new Scanner(System.in);
        int SALESPEOPLE;
        System.out.println("Enter the number of salespeople");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxsale = 0;
        int maxindex = 0;
        int minsale = 0;
        int minindex = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > maxsale){
                maxsale = sales[i];
                maxindex = i+1;
                minsale = sales[i];
                minindex = i+1;
            }
            if (sales[i] < minsale){
                minsale = sales[i];
                minindex = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("The average sale is: "+sum/sales.length);
        System.out.println("Salesperson "+maxindex +" had the highest sale with $ "+maxsale+".");
        System.out.println("Salesperson "+minindex+" had the lowest sale with $ "+minsale+".");
        System.out.println("Give the value to check");
        int passrate = scan.nextInt();
        int totalpasser = 0;
        System.out.print("Salesperson who exceeded "+passrate+"amount sales");
        System.out.println("Salesperson     amount");
        for(int i=0; i<sales.length; i++){
            if(sales[i]>= passrate){
                totalpasser += 1;
                System.out.println(i+1 +"     "+sales[i]);
            }
        }
        System.out.println("The number os Salespersons who exceeded "+passrate+" amount sales is: "+totalpasser);
    }
}