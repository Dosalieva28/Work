import java.util.Arrays;

public class Shop {
    private String name;
    private String nazvaniyaSaita;
    private Employee[] sotrudniki;
    private String chtoProdaut;

    public Shop(String name, String nazvaniyaSaita, Employee[] sotrudniki, String chtoProdaut){
        this.name=name;
        this.nazvaniyaSaita=nazvaniyaSaita;
        this.sotrudniki=sotrudniki;
        this.chtoProdaut=chtoProdaut;

    }

    public  Shop(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNazvaniyaSaita() {
        return nazvaniyaSaita;
    }

    public void setNazvaniyaSaita(String nazvaniyaSaita) {
        this.nazvaniyaSaita = nazvaniyaSaita;
    }

    public Employee[] getSotrudniki() {
        return sotrudniki;
    }

    public void setSotrudniki(Employee[] sotrudniki) {
        this.sotrudniki = sotrudniki;
    }

    public String getChtoProdaut() {
        return chtoProdaut;
    }

    public void setChtoProdaut(String chtoProdaut) {
        this.chtoProdaut = chtoProdaut;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", nazvaniyaSaita='" + nazvaniyaSaita + '\'' +
                ", sotrudniki=" + Arrays.toString(sotrudniki) +
                ", chtoProdaut='" + chtoProdaut + '\'' +
                '}';
    }
}
