public class Employee {
    private String name;
    private String gdeRabotaet;

    public Employee(String name, String gdeRabotaet){
        this.name=name;
        this.gdeRabotaet=gdeRabotaet;
    }
    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGdeRabotaet() {
        return gdeRabotaet;
    }

    public void setGdeRabotaet(String gdeRabotaet) {
        this.gdeRabotaet = gdeRabotaet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gdeRabotaet='" + gdeRabotaet + '\'' +
                '}';
    }
}

