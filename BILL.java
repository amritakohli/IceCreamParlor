import java.util.*;
class BILL
 {
     static String[] itemsName = new String[100];
     static int[] itemsQuantity = new int[100];
     static int[] itemsPrice = new int[100];
     static int count = 0;
     void addItem(String name, int quantity, int price)
     {
        int i = 0;
        boolean flag = false;
        for(i = 0; i < count; i++)
        {
            if(itemsName[i] == name)
            {
                 flag = true;
                 itemsQuantity[i] += quantity;
                 break;
            }
        }         
        if(flag == false)
        {
             itemsName[count] = name;
             itemsQuantity[count] = quantity;
             itemsPrice[count] = price;
             count++;
        }
    }      
    void displayBill()
    {
        int i;
        int total = 0;
        int price;        
        System.out.println("\t\t\t\t\t\tBILL"); 
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Name\t\t\t\tQuantity\t\t\t\t\tPrice");
        for(i = 0; i < count; i++)
        {
            price = (itemsQuantity[i] * itemsPrice[i]);
            System.out.println((i+1) +". " + itemsName[i] + "\t\t" + itemsQuantity[i] + "\t\t\t\t\t\t" + price);
            total += price;
        }       
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("SUM\t=> \t\t\t\t\t\t" + total);
        System.out.println("TAX\t=> \t\t\t\t\t\t" + 0.12*total);
        System.out.println("AMOUNT PAYABLE=>  \t\t\t\t\t" + (total + 0.12*total));
    }   
}