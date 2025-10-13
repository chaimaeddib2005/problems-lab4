package problem2;

import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);

    static Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
// Create a list, then repeatedly print the menu and do what the
// user asks until they quit
//-------------------------------------------------------
    public static void main(String[] args)
    {   list.addElement(5);
        list.addElement(3);
        list.addElement(2);
        list.addElement(4);
        list.addElement(6);
        list.addElement(8);
        list.addElement(9);
        list.addElement(10);
        list.addElement(11);
        list.addElement(12);
        list.removeAll(5);
        list.removeAll(113);

        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    //--------------------------------------
// Do what the menu item calls for
//--------------------------------------
    public static void dispatch(int choice)
    {
        int loc;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                list.print();
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    //----------------------------
// Print the user's choices
//----------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Print the list");
        System.out.print("\nEnter your choice: ");
    }
}
