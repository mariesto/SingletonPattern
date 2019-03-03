import java.util.HashMap;
import java.util.Map;

public class PhoneBookDB implements DB_Interface{

    public static final PhoneBookDB PHONE_BOOK_DB = new PhoneBookDB();

    private PhoneBookDB(){}

    public static PhoneBookDB getInstance(){
        return PHONE_BOOK_DB;
    }

    Map<String, String> data = new HashMap<>();

    public void insert(String name, String number){
        data.put(name, number);
    }

    public void getAll(){
        if (data.size() == 0){
            System.out.println("PhoneBookDB still empty");
        }else {
            System.out.println(data + " ");
        }
    }

    public void delete(String key){
        data.remove(key);
    }
}
