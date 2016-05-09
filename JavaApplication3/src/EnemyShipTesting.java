
import java.util.Scanner;
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
public class EnemyShipTesting {
    public static void main(String args[])
    {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy=null;
        Scanner userInput=new Scanner(System.in);
        System.out.println("What type ship??(U/R/B)");
        if(userInput.hasNextLine())
        {
            String typeOfShip=userInput.nextLine();
            theEnemy=shipFactory.makeEnemyShip(typeOfShip);
        }
        if(theEnemy!=null)
        {
        dostuffEnemy(theEnemy);
        }
        else
            System.out.println("Enter a U/R/B next time");
    }
    public static void dostuffEnemy(EnemyShip anenemyShip)
    {
        anenemyShip.displayEnemyShip();
        anenemyShip.enemyShipshoots();
        anenemyShip.followHeroShip();
    }
}
