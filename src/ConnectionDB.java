public class ConnectionDB {
    public static final ConnectionDB CONNECTION_DB = new ConnectionDB();

    PhoneBookDB phoneBookDB = PhoneBookDB.getInstance();

    private ConnectionDB(){}

    public static ConnectionDB getInstance(){
        return CONNECTION_DB;
    }

    public PhoneBookDB connectPhoneBookDB(){
        System.out.println("******Connected to PhoneBookDB******");
        return null;
    }
}
