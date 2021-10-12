/**
 * Class ColtDragon.
 * @author Nicola Anghileri
 * @version 12.10.2021
 */
public class ColtDragon extends Revolver {
    /**
     * Costruttore per ColtDragon
     */
    public ColtDragon(){
        super(6);
    }
    
    /**
     * Suono dello sparo di una ColtDragon. 
     */
    @Override
    protected void makeShootNoise() {
        System.out.println("PEM"); 
    }

    /**
     * Suono di una ColtDragon senza munizioni.
     */
    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("Stac"); 
    }
    
    /**
     * Suono di una ColtDragon che ricarica le munizioni.
     */
    @Override
    protected void makeReloadNoise() {
        System.out.println("Stic Stic Stic Stic Stic Stic");
    }
}
