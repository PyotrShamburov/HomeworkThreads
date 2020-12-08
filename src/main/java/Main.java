import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        Person person1 = new Person("Mike",23,"Male");
        Person person2 = new Person("Elisa",21,"Female");
        Person person3 = new Person("Dan",24,"Male");
        Person person4 = new Person("Ann",31,"Female");
        Person person5 = new Person("Louis",30,"Male");
        Person person6 = new Person("Elly",29,"Female");
        Person person7 = new Person("John",19,"Male");
        Person person8 = new Person("Jessica",13,"Female");
        Person person9 = new Person("Michael",40,"Male");
        Person person10 = new Person("Natalya",25,"Female");
        Person person11 = new Person("Nicolas",36,"Male");
        Person person12 = new Person("Elisabet",28,"Female");

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);
        people.add(person11);
        people.add(person12);

        Community community = new Community();
        community.setPeople(people);

        Thread currentThread = Thread.currentThread();

        ThreadForJson secondThread = new ThreadForJson(community);
        ThreadForXml thirdThread = new ThreadForXml(community);
        ThreadForTxt fourthThread = new ThreadForTxt(people);
        try {
            currentThread.join(2000);
        }catch (InterruptedException exception){
            System.out.println(exception.toString());
        }

        System.out.println(currentThread.getName()+" done his work.");





    }
}
