public class Game {


    private String name;
    private static String pravilaIgry;
    private int skolkoMestoZanimaet;
    private final int dataVyhodaIgry=55;
    private String ktoPridumal;

    public Game(){

    }

    public Game(String name, String pravilaIgry, int skolkoMestoZanimaet,  String ktoPridumal) {
        this.name = name;
        this.pravilaIgry = pravilaIgry;
        this.skolkoMestoZanimaet = skolkoMestoZanimaet;
        this.ktoPridumal = ktoPridumal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPravilaIgry() {
        return pravilaIgry;
    }

    public void setPravilaIgry(String pravilaIgry) {
        this.pravilaIgry = pravilaIgry;
    }

    public int getSkolkoMestoZanimaet() {
        return skolkoMestoZanimaet;
    }

    public void setSkolkoMestoZanimaet(int skolkoMestoZanimaet) {
        this.skolkoMestoZanimaet = skolkoMestoZanimaet;
    }

    public int getDataVyhodaIgry() {
        return dataVyhodaIgry;
    }



    public String getKtoPridumal() {
        return ktoPridumal;
    }

    public void setKtoPridumal(String ktoPridumal) {
        this.ktoPridumal = ktoPridumal;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", pravilaIgry='" + pravilaIgry + '\'' +
                ", skolkoMestoZanimaet=" + skolkoMestoZanimaet +
                ", dataVyhodaIgry='" + dataVyhodaIgry + '\'' +
                ", ktoPridumal='" + ktoPridumal + '\'' +
                '}';
    }
    public static void game(){
        System.out.println("Это статик метод");
    }
    public static void like(){
        System.out.println("Это стат метод");
    }
}

