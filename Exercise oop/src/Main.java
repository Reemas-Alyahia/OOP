//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String id,String name,int balance
        Accountt a1=new Accountt("11331","reemas",1000);
        Accountt a2=new Accountt("11331","Ali",2000);
        System.out.println("The name is: "+a1.getName());
        System.out.println("The id is: "+a1.getId());
        System.out.println("The credit is:  "+a1.credit(120));
        System.out.println("The depit is: "+a1.depit(100));
        System.out.println("The transfor is : "+a1.transferto(a2,700));
        System.out.println(a1);



    }
}