import java.util.*;
class main
{        
   BILL bill=new BILL();
   public static void main (String args[])
    {   
        main myMain = new main();
        myMain.mainMenu();
    }   
   void mainMenu()
   {
       System.out.print('\u000C');
       Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME TO THE WAFFLE CONE");                     
       String mainmenuItems[]=new String[4];
       mainmenuItems[0]="1. Ice Cream";
       mainmenuItems[1]="2. Sundaes";
       mainmenuItems[2]="3. Milkshakes";
       mainmenuItems[3]="4. Display Bill";
       System.out.println("Which menu would you like to access?: ");              
       int ch;                  
       do
        {
            for(int m=0;m<4;m++)
            {
             System.out.println(mainmenuItems[m]);    
            }
            System.out.println("Hit 0 to exit");
            System.out.print("Enter your choice: ");            
            ch = sc.nextInt();  
            switch(ch)
            {
                case 0:
                   System.out.println("Thanks for visiting.");
                   break;
                case 1:                
                    ICECREAMS ice=new ICECREAMS();
                    ice.initIcecreams(); 
                    break;                
                case 2:                
                    SUNDAES sun=new SUNDAES();
                    sun.initSundaes(); 
                    break;
                case 3:
                    MILKSHAKE mil=new MILKSHAKE();
                    mil.initMilkshake();                   
                    break;
                case 4:
                    System.out.print('\u000C');
                    bill.displayBill();
                    break;
                default: 
                    System.out.print('\u000C');
                    System.out.println("Invalid input, please try again");
                    System.out.println();
            }//end of switch block            
        }while(ch > 4);         
   }     
   void getInput(String[] items, int[] prices)
   {       
       Scanner sc=new Scanner(System.in);
       int choice;
       do
       {           
           //print the icecream menu
           for(int j=0;j < items.length; j++)
           {
                System.out.println((j+1)+". "+ (items[j]));
           }            
           //get choice from user
           System.out.print("Please make your choice: ");           
           choice = sc.nextInt();           
           if(choice <= 11 && choice > 0)
           {
               System.out.println("You have chosen " + items[choice - 1]);                                 
               System.out.print("Enter quantity: ");
               int qty=sc.nextInt();               
               bill.addItem(items[choice-1], qty, prices[choice - 1]);               
               //Continue or not
               System.out.println("Do you want to continue the same menu? Yes: 1, No: 0");
               int shouldContinue = sc.nextInt();
               if(shouldContinue == 0)
               {
                   //go back to main menu
                   mainMenu();
               }
               else if(shouldContinue==1)
               {
                   System.out.print('\u000C'); 
                   choice = 20;
                }
               else
               {
                   System.out.println("Invalid input");
               }
           }
           else if(choice == 0)
           {
               //go back to main menu
                 mainMenu();
           }
           else
           {
                System.out.print('\u000C');
                System.out.println("Invalid input");            
           }           
        }while(choice > 11);
    }
}                  
        