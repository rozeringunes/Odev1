import com.java1.CreditManager;
import com.java1.MortgageManager;
import com.java1.Product;
import com.java1.VehicleManager;

class Main {
    public static  void main (String[]  args){
        CreditManager creditManager= new CreditManager();
        creditManager.add();
        creditManager.calculate();

        MortgageManager mortgageManager = new MortgageManager();
        mortgageManager.add();

        CreditManager[] credits = new CreditManager[2];
        credits[0]= new MortgageManager();
        credits[1]=new VehicleManager();

        for (int i=0;i<credits.length;i++){
            credits[i].calculate();
        }

     }
    }

