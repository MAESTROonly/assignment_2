

import java.util.ArrayList;
import java.util.Collections;
import models.AbstractPerson;
import models.Employee;
import models.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Роман ", "Бародин", 2.4);
        Student student2 = new Student("Владимир", "Путин",3.0 );
        Student student3 = new Student("Артем", "Владимир" , 3.1);
        Employee emp1 = new Employee("Rauan", "Zhanabek", "president",100000 );
        Employee emp2 = new Employee("Kasym", "Zhomart", "security",310000);
        ArrayList<AbstractPerson> people = new ArrayList<>();
        people.add(student1);
        people.add(student2);
        people.add(emp1);
        people.add(emp2);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<AbstractPerson> people){
        for(AbstractPerson person: people){
            printPersonInfo(person);
        }
    }

    public static void printPersonInfo(AbstractPerson person){
        System.out.println(person.toString() + " earns " + person.getPaymentAmount());
    }
}