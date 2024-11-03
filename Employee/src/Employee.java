public class Employee {
    private String id;
    private String name;
    private int salarey;

    Employee(String id,String name,int salarey){
this.id=id;
this.name=name;
this.salarey=salarey;
    }
    private void setName(String name){
        this.name=name;
    }
    private void setId(String id){
        this.id=id;
    }
    private void setSalarey(int salarey){
        this.salarey=salarey;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalarey() {
        return salarey;
    }
    public int getAnnoulsalary(){
        int all=getSalarey()*12;
         setSalarey(all);
    return all;}

    public int raiseSalary(int percent) {
        if (percent > 0) {
            int raise = (getSalarey() * percent) / 100;
            setSalarey(getSalarey() + raise);
            return getSalarey();
        }
        return getSalarey();
    }
        public String toString() {
        return "The name is: "+" "+getName()+"  The id is:  "+getId()+" "+"  The Salary is:  "+getSalarey();


//            System.out.println("The name is: "+getName());
//            System.out.println("The id is:  "+getId());
//            System.out.println("The Salary is:  "+getSalarey());

        }


    }



