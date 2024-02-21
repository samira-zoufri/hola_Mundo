public class Account {
private String id;
private String name;
private int balance;


    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int credit(int amount){
        if(this.balance >= amount) {
            this.balance -= amount;
            return this.balance;
        }
        else {

            return this.balance;
        }

    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

}
