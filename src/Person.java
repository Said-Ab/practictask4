public class Person {
    String name;
    int age;
    String work;
    int salary;
    int phonePrice;
    public Person(){}
    public Person(String name,int age,String work,int salary,int phonePrice){
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phonePrice = phonePrice;
    }
    public void setSalary(){
    }

    @Override
    public String toString() {
        return "       Person" +"\n"+
                ", name=" + name + "\n" +
                ", age=" + age +"\n"+
                ", work=" + work + "\n" +
                ", salary=" + salary +"\n"+
                ", phonePrice=" + phonePrice;
    }
}
