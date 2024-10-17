import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Dias",19,"designer",100000,40000);
        Person person2 = new Person("Esen",20,"IT",120000,60000);
        Person person3 = new Person("Bakyt",32,"teacher",50000,70000);
        Person person4 = new Person("Umar",26,"cleaner",30000,25000);
        Person person5 = new Person("Said",16,"businessman",450000,20000);
        Person[]people={person1,person2,person3,person4,person5};
        for (Person person:people){
            System.out.println(person);
            System.out.println(" ");
        }
        Person maxSalary=people[0];
        Person minSalary=people[0];
        Person expensivePhone=people[0];


        for (Person persona:people){
            if (persona.salary>maxSalary.salary){
                maxSalary=persona;
            }
            if(persona.salary< maxSalary.salary){
                maxSalary=persona;
            }
            if(persona.phonePrice> expensivePhone.phonePrice){
                expensivePhone=persona;
            }
        }
        System.out.println(" ");
        System.out.println("самая большая зарплата у "+maxSalary.name+"\nс зарплатой:"+maxSalary.salary);
        System.out.println(" ");
        System.out.println("самая маленькая зарплата у "+minSalary.name+"\nс зарплатой:"+minSalary.salary);
        System.out.println(" ");
        System.out.println("самый дорогой телефон у "+expensivePhone.name+"\nсо стоймостью:"+expensivePhone.salary);
    }
}