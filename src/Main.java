public class Main {
    public static void main(String[] args) {
//        phoneBook.dataBase.insert("Amendo", "082165877722");
//        phoneBook.dataBase.insert("Mariesto", "082165877722");
//        phoneBook.dataBase.insert("Sitinjak", "082165877722");
//
//        phoneBook.dataBase.delete("Mariesto");
//
//        phoneBook.dataBase.getAll();
        ConnectionDB connectionDB = ConnectionDB.CONNECTION_DB;
        connectionDB.connectPhoneBookDB();
        connectionDB.phoneBookDB.getAll();
    }
}
