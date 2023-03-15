import person.Dancer;
import person.Person;
import person.Programmer;
import person.Singer;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Main {
    public static void main(String[] args) {

        Person per = new Person("Sara","Programmist");
        System.out.println(per.toString());
        per.eat();
        per.learn();
        per.walk();
        Programmer pr = new Programmer("Ajara","Programmist", "Skyland");
        System.out.println(pr.toString());
        pr.eat();
        pr.learn();
        pr.walk();
        Dancer dan = new Dancer("Sofia", "Dancer", "Blackpink" );
        System.out.println(dan.toString());
        dan.eat();
        dan.learn();
        dan.walk();
        Singer sin = new Singer("Dias", "SM", "BTS");
        System.out.println(sin.toString());
        sin.eat();
        sin.learn();
        sin.walk();

    }
    }


