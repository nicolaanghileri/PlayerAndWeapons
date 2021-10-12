/**
 * Class RugerBlackhawk.
 * @author Nicola Anghileri
 * @version 12.10.2021
 */
public class RugerBlackhawk extends Revolver {
    /**
     * Ctor.
     */
    public RugerBlackhawk(){
        super(6);
    }

    @Override
    protected void makeShootNoise() {
        System.out.println("POM");
    }

    @Override
    protected void makeOutOfAmmoNoise() {
        System.out.println("Stuc"); 
    }

    @Override
    protected void makeReloadNoise() {
        System.out.println("Stoc Stoc Stoc Stoc Stoc Stoc");
    }
}
