import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Main {
    public static void main(String[] args) {


        Employee e1 = new Employee("Ajara", "V Magazine");
        Employee e2 = new Employee("Nurzhan", "V Magazine");
        Employee e3 = new Employee("Baizhan", "V Magazine");
        Employee e4 = new Employee("Mirlan", "V Magazine");
        Employee e5 = new Employee("Rapia", "V Magazine");
        Employee e6 = new Employee("Adilet", "V Magazine");
        Employee e7 = new Employee("Bekjan", "V Magazine");
        Employee e8 = new Employee("Albina", "V Magazine");
        Employee e9 = new Employee("Baiel", "V Magazine");
        Employee e10 = new Employee("Anelya", "V Magazine");
        Employee[] s = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};
        Shop shop = new Shop("Sweetshop", "sweets.com", s, "Sladosty");
        System.out.println(shop.toString());
        for (Employee ee : shop.getSotrudniki()) {
            System.out.println(ee.toString());
        }

        Shop shop1 = new Shop("Sweetshop", "sweets.com", s, "Sladosti" );
        System.out.println("|------------------------------------------------|");
        System.out.println("|--------------Shop------------------------------|");
        System.out.println("|   name    |   sait   |   sotrudniki   |    chtoProdaut   ");
        System.out.printf(" %s  |  %s  |   %s |  %s  \n",shop1.getName(),
            shop1.getNazvaniyaSaita(),shop1.getSotrudniki()[0].getName(),shop1.getChtoProdaut());
        System.out.printf("      |           |     %s    |      \n",
             shop1.getSotrudniki()[1].getName());
        System.out.printf("        |         |         %s         |        \n",
                shop1.getSotrudniki()[2].getName());
        System.out.printf("           |            |        %s       |         \n",
                shop1.getSotrudniki()[3].getName());






    }
         }
