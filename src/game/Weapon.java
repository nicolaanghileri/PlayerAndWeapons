package game;

/**
 * Classe Weapon.
 * @author Nicola Anghileri
 * @version 06.10.2021 ultima modifica: 12.10.2021
 */
public abstract class Weapon {
    /**
     * Numero di munizioni presenti nel caricatore.
     */
    private int ammo = 0;
    
    /**
     * Numero di munzioni totale del caricatore.
     */
    private final int AMMO_CAPACITY;
    
    /**
     * Metodo astratto che ritorna il suono dello sparo.
     */
    protected abstract void makeShootNoise();

    /**
     * Metodo astratto che ritorna il suono del caricatore senza colpi.
     */
    protected abstract void makeOutOfAmmoNoise();

    /**
     * Metodo astratto che ritorna il suono di ricaricamento.
     */
    protected abstract void makeReloadNoise();
    
    /**
     * Costruttore che serve per istanziare un oggetto Weapon.
     * @param ammoCapacity la capacità totale del caricatore.
     */
    public Weapon(int ammoCapacity){
        this.AMMO_CAPACITY = ammoCapacity;
    }
    
    /**
     * Metodo che fa sparare l'arma.
     */
    public final void shoot(){
        if(this.ammo > 0){
            this.ammo--;
            this.makeShootNoise();
        }else{
            this.makeOutOfAmmoNoise();
        }
    }

    /**
     * Metodo che fa ricaricare l'arma.
     */
    public final void reload(){
        this.ammo = AMMO_CAPACITY;
        this.makeReloadNoise();
    }

    /**
     * Metodo che ritorna lo stato dell'arma.
     */
    public final String toString(){
        return "Weapon: Ammo status: " + this.ammo + " Total ammo capacity: "
                + AMMO_CAPACITY;
    }

    /**
     * Metodo getter della capacità totale del caricatore.
     * @return la capacità del caricatore.
     */
    public int getAmmoCapacity(){
        return this.AMMO_CAPACITY;
    }

    /**
     * Metodo getter che ritorna il numero di munizioni
     * presenti all'interno del caricatore.
     * @return il numero di munizioni.
     */
    public int getAmmo(){
        return this.ammo;
    }
}
