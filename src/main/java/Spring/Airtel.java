package Spring;

public class Airtel implements sim{

    @Override
    public void calling(){
        System.out.println("Calling Airtel");
    }

    @Override
    public void data(){
        System.out.println("Data Airtel");
    }
}
