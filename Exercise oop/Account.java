public class Account {
    private String id;
    private String name;
   private int balance;

   Account(String id,String name){
       this.id=id;
       this.name=name;
   }
    Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    private void setName(String name){
       this.name=name;
    }

   private void setId(String id) {
        this.id = id;
    }

   private void setBalance(int balance) {
        this.balance = balance;
    }
/////////////////////////////
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }
    ///////////////////////
    public int credit(int amount){
        amount=amount+getBalance();
   setBalance(amount);

    }
    public int depit(int amount){
     if(amount<=this.balance){
         amount=amount-setBalance();
     }
     setBalance(amount);
    }
//public int transferto(Account A2,int amount){
//       if(this.balance)
//}

}
