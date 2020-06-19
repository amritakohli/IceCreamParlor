import java.util.*;
class ICECREAMS
{   
    void initIcecreams()
    {
        String icecreams[]=new String[11];
        int icecreamPrice[] = new int[11];
        icecreams[0]="Bubble Gum Ice Cream";
        icecreamPrice[0] = 200;
        icecreams[1]="Chocolate Ice Cream";
        icecreamPrice[1] = 100;
        icecreams[2]="Cookie Ice Cream";          
        icecreamPrice[2] = 200;
        icecreams[3]="Grape Ice Cream";
        icecreamPrice[3] = 150;
        icecreams[4]="Green Tea Ice Cream";
        icecreamPrice[4] = 150;
        icecreams[5]="Hokey Pokey Classic";
        icecreamPrice[5] = 150;        
        icecreams[6]="Mint Chocolate";
        icecreamPrice[6] = 125;        
        icecreams[7]="Pistachio Ice Cream";
        icecreamPrice[7] = 100;        
        icecreams[8]="Rasberry Ripple";
        icecreamPrice[8] = 150;        
        icecreams[9]="Strawberry Cream";
        icecreamPrice[9] = 100;        
        icecreams[10]="Vanilla Ice Cream";
        icecreamPrice[10] = 75;
        main myMain = new main();
        myMain.getInput(icecreams, icecreamPrice);
    }       
}
       