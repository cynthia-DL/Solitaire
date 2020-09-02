import java.util.ArrayList;

public class Tas {
    private ArrayList<Carte> contenu;

    public Tas(){
        this.contenu = new ArrayList<Carte>();
    }

    public ArrayList<Carte> getContenu(){
        return this.contenu;
    }
    
}
