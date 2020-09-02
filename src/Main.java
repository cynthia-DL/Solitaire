package src;

public class Main {
    public static void main(String[] args) {
        Paquet wesh = new Paquet();

        System.out.println(wesh + "On prend la dernière carte du paquet, a savoir " + wesh.prendreLaDerniereCarte()
                + ". Le paquet contiend donc" + wesh);
    }

}
