import javax.sound.midi.Track;

public class fairytale {
    public static void main(String[] args) {
        System.out.println();
        Place House = new Place("Дом");
        Place courtyard = new Place("Двор");


        Moomintroll Moom = new Moomintroll("25", House);
        Think Per = new Think("Ага, Снусмумрик воспользовался веревочной лестницей.");
        Human snusnu = new Human("Снусмумрик", House);
        Decor window = new Decor();
        Decor Stairs = new Decor();
        Think kuv = new Think("Это он от радости. А вот тут он перекувырнулся, уж это точно.");
        track sled  = new track();

        snusnu.walk(courtyard);
        snusnu.somersault();
        Moom.look(window);
        Moom.thinking(Per);
        Moom.climbed(Stairs);
        Moom.walk(courtyard);
        Moom.drewattention(sled);
        Moom.thinking(kuv);
    }
}
