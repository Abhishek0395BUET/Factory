
import newpackage.EnemyShip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShiptype)
    {
        EnemyShip newShip=null;
        if(newShiptype.equals("U"))
        {
            return new UFOEnemyShip();
        }
        else if(newShiptype.equals("R"))
        {
            return new RocketEnemyShip();
        }
        else if(newShiptype.equals("B"))
        {
            return new BigUFOEnemyShip();
        }
        else return null;
    }
}
