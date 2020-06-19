import java.util.*;
class MILKSHAKE
{   
    void initMilkshake()
    {
         String milkshake[]=new String[9];
         int milkshakePrice[]=new int[9]; 
         milkshake[0]="Chocolate Milkshake";
         milkshakePrice[0] = 100;
         milkshake[1]="Vanilla Milkshake";
         milkshakePrice[1] = 100;
         milkshake[2]="Strawberry Milkshake";
         milkshakePrice[2] = 100;
         milkshake[3]="Mango Milkshake";
         milkshakePrice[3] = 150;
         milkshake[4]="Classic Cold Coffee";
         milkshakePrice[4] = 100;
         milkshake[5]="Mixed Fruit Shake";
         milkshakePrice[5] = 200;
         milkshake[6]="Pineapple Milkshake";
         milkshakePrice[6] = 150;
         milkshake[7]="Custard Apple Shake";
         milkshakePrice[7] = 150;
         milkshake[8]="Banana Milkshake";
         milkshakePrice[8] = 150;
         main myMain = new main();
         myMain.getInput(milkshake, milkshakePrice);
    }  
}