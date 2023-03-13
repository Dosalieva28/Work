import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Main {
    public static void main(String[] args) {
     Game gm = new Game("Candy Crush", "Sobirat almazy", 234 ,  "John lee " );
        System.out.println(gm.toString());
        Game.game();
        Game.like();

        Game gm2 = new Game("Candy Crush", "Sobirat brilianty", 234 , "John lee " );
        System.out.println(gm2);
        System.out.println(gm);


    }

    }


