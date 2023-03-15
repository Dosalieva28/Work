package person;

public class Singer extends Person {
    private String bandNime;
    public Singer(){

    }

    public Singer(String bandNime) {
        this.bandNime = bandNime;
    }

    public Singer(String name, String designation, String bandNime) {
        super(name, designation);
        this.bandNime = bandNime;
    }

    public String getBandNime() {
        return bandNime;
    }

    public void setBandNime(String bandNime) {
        this.bandNime = bandNime;
    }


    @Override
    public String toString() {
        return "Singer{" +
                "bandNime='" + bandNime + '\'' +
                "} " + super.toString();
    }

    public Singer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
