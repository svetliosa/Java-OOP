
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Shop {
    private List<Client> clients = new ArrayList<Client>();

    public Shop(String fname){
            try{
                Scanner sc = new Scanner(new File(fname));
                while (sc.hasNextLine()) {
                    clients.add(new Client(sc.nextInt(), sc.nextInt(), sc.nextDouble()));
                }
            }catch (IOException e) {
                System.out.println("exception");
            }
    }

    public void PrintClients(){
        System.out.println(clients.toString());
    }
    
    public double AveragePricePurchase(){
        double amount = 0;
        for (Client c: clients) {
            amount += c.GetAmountPurchase();
        }

        return amount/clients.size();
    }

    public void SortByEnterHour() {
        clients.sort(Comparator.comparing(Client::GetEnterHour));
    }

    public void SortByMinutesStay() {
        Collections.sort(clients);
    }
}
