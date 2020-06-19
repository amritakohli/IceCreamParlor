import java.util.*;
class SUNDAES
{   
    void initSundaes()
    {
        String sundaes[]=new String[6];      
        int sundaesPrice[]=new int[6]; 
        sundaes[0]="Donut Extravaganza";
        sundaesPrice[0] = 300;
        sundaes[1]="Banana Split Classic";
        sundaesPrice[1] = 300;
        sundaes[2]="Chocolate Overload";
        sundaesPrice[2] = 200;
        sundaes[3]="Classic Sundae";
        sundaesPrice[3] = 200;
        sundaes[4]="Brownie Sundae";
        sundaesPrice[4] = 200;
        sundaes[5]="Black and White";  
        sundaesPrice[5] = 200;  
        main myMain = new main();
        myMain.getInput(sundaes, sundaesPrice);       
    }
}
              