
package ge.mziuri.model;

import java.io.Serializable;
import java.util.ArrayList;


public class Book implements Serializable {
    
    private int id;
    
    private int user_id;
    
    private ArrayList bets = new ArrayList<Bet>();
    
    private double money;
    
    public Book() {
        
    }
    
    public Book(int user_id, int id, ArrayList bets, double money) {
        this.user_id = user_id;
        this.id = id;
        this.bets = bets;
        this.money = money;
    }

    /**
     * @return the bets
     */
    public ArrayList getBets() {
        return bets;
    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBets(ArrayList bets) {
        this.bets = bets;
    }
    

}
