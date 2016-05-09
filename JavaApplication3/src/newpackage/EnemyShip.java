/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author USER
 */
public abstract class EnemyShip {
    
    private String name;
    private double amntdamage;
    public String getName()
    {
        return name;
    }
    public void setName(String newname)
    {
        name=newname;
    }
    public double getDamage()
    {
        return amntdamage;
    }
    public void setDamage(double newdamage)
    {
        amntdamage=newdamage;
    }
    public void followHeroShip()
    {
        System.out.println(getName()+"is following the hero");
    }
    public void displayEnemyShip()
    {
        System.out.println(getName()+"is on the screen");
    }
    public void enemyShipshoots()
    {
        System.out.println(getName()+"attacks and does"+getDamage());
    }
}
