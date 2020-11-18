import java.util.ArrayList;

public class VendingMachine {

    CoinReturn coinReturn;
    ArrayList<Coin> coins;
    ArrayList<Drawer> drawers;

    public VendingMachine(CoinReturn coinReturn) {
        this.coinReturn = coinReturn;
        coins = new ArrayList<Coin>();
        drawers = new ArrayList<Drawer>();
    }


}
