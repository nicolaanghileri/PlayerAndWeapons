package game;

/**
 * Class Sling.
 * @author Nicola Anghileri
 * @version 12.10.2021
 */
public class Sling extends Weapon{
    /**
     * Costruttore per Weapon Sling.
     */
    public Sling(){
        super(1);
    }

    /**
     * Metodo che ritorna il suono dello sparo di Sling.
     */
    @Override
    protected void makeShootNoise(){
        System.out.println("Piuuuu");
    }

    /**
     * Metodo che ritorna il suono del caricatore senza munizioni.
     */
    @Override
    protected void makeOutOfAmmoNoise(){
        System.out.println("piu");
    }

    /**
     * Metodo che ritorna il suono del ricaricamento.
     */
    @Override
    protected void makeReloadNoise(){
        System.out.println("Stic");
    }


}
