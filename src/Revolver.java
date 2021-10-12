import game.Weapon;

/**
 * Class Revolver.
 * @author Nicola Anghileri
 * @version 12.10.2021
 */
public abstract class Revolver extends Weapon{
    /**
     * Costruttore per Revolver.
     * @param ammoCapacity 
     */
    public Revolver(int ammoCapacity){
        super(ammoCapacity);
    }
}
