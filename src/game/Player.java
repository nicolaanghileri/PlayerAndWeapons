package game;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Player.
 * @author Nicola Anghileri
 * @version 06.10.2021 ultima modifica: 12.10.2021
 */
public class Player {
    
    /**
     * La lista di armi che possiede il Player.
     */
    List<Weapon> weapons = new ArrayList<>();
    
    /**
     * L'id dell'arma (all'interno della lista) corrente.
     */
    private int currentWeaponId = 0;
    
    /**
     * l'arma corrente del Player.
     */
    Weapon currentWeapon;
    
    /**
     * Metodo costruttore per Player.
     */
    public Player(){
        this.addWeapon(new Sling());
        this.currentWeapon = this.weapons.get(0);
    }
    
    /**
     * Metodo che cambia l'arma del giocatore.
     */
    public void changeWeapon(){
        if(currentWeaponId < weapons.size()){
            if(currentWeaponId == weapons.size() - 1){
                this.currentWeaponId = 0;
            }else{
                this.currentWeaponId++;
            }  
        }
        this.currentWeapon = this.weapons.get(currentWeaponId);
    }
    
    /**
     * Metodo che aggiunge un Weapon alla lista di armi.
     * @param weapon l'arma da aggiungere.
     */
    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }
    
    /**
     * Metodo che invoca il metodo shoot dell'arma.
     */
    public void shoot(){
        currentWeapon.shoot();
    }
    
    /**
     * Metodo che invoca il metodo reload dell'arma.
     */
    public void reloadWeapon(){
        currentWeapon.reload();
    }
}
