package Observer;

public interface Observer {
    public void add(Client client);
    public void remove(Client client);
    public void notifyALL();
}
