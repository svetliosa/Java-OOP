public class Main {
    public static void main(String[] args){
        String fname = "data";

        Shop shop = new Shop(fname);

        shop.PrintClients();
        System.out.println("Average purchase amount: " + shop.AveragePricePurchase());

        shop.SortByEnterHour();
        shop.PrintClients();

        shop.SortByMinutesStay();
        shop.PrintClients();

    }
}
