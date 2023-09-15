package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighters mark = new Fighters("Mike" , 35 , 235 , 92 , 40);
        Fighters bruce = new Fighters("Bruce" , 15 , 180 , 88 , 70);
        Ring ring = new Ring(mark , bruce , 85 , 95);
        ring.run();
    }
}
