import game.Player;

/**
 * Classe Main per testare il programma fatto.
 * @author Nicola Anghileri
 * @version 12.10.2021
 */
public class Main {
    public static void main(String[] args) {
        Player nicola = new Player();
        ColtDragon colt = new ColtDragon();
        RugerBlackhawk ruger = new RugerBlackhawk();
        
        nicola.addWeapon(colt);
        nicola.addWeapon(ruger);
        
        nicola.changeWeapon();
        nicola.reloadWeapon();
        nicola.shoot();
        System.out.println(colt);
        //OUT PREVIEW
        // Stic Stic Stic Stic Stic Stic 
        // PEM
        // 5 - 6
        //---------------------------------------------------
        nicola.changeWeapon();
        nicola.reloadWeapon();
        nicola.shoot();
        nicola.shoot();
        nicola.shoot();
        nicola.shoot();
        nicola.shoot();
        nicola.shoot();
        nicola.shoot();
        System.out.println(colt);
        //OUT PREVIEW
        // Stoc Stoc Stoc Stoc Stoc Stoc 
        // POM
        // POM
        // POM
        // POM
        // POM
        // POM
        // STUC
        // 5 - 6
    }
}
