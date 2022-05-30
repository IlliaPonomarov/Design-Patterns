package Observer;

import java.util.*;

public class Product implements Observer{


    private List<Client> clients = new ArrayList<>();




    @Override
    public void add(Client client) {
        clients.add(client);
    }

    @Override
    public void remove(Client client) {
        clients.remove(client);
    }

    @Override
    public void notifyALL() {
        for (Client client : clients) {
            // notify about new products
        }
    }


}
