public class Accountt {
    private String id;
    private String name;
    private int balance;

    Accountt(String id,String name){
        this.id=id;
        this.name=name;
    }
    Accountt(String id,String name,int balance){
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
       return amount;}
    public int depit(int amount){
        if(amount<=this.balance) {
            amount = getBalance()-amount; }
        setBalance(amount);
        return amount;}


public String transferto(Accountt a2,int amount){
        if(amount<=this.balance) {
            a2.setBalance(a2.getBalance() + amount);
            this.setBalance(this.getBalance()-amount);
            return "Done Transfer";
        }
      return "will maybe there something wrong";
}
public String toString(){
        return  "  The name is : "+getName() +"  The id is :"+getId()+ "  The balance is:  "+ getBalance();

}

}


