package tisdale.project.pkg3;

import java.util.Date;

public class StoreItem {

    private static int itemCount = 0;
    private String title;
    private Date dateAcquired;
    private int purchasePrice;
    private int askingPrice;

    StoreItem(String title, Date dateAcquired, int purchasePrice, int askingPrice) {
        setTitle(title);
        setDateAcquired(dateAcquired);
        setPurchasePrice(purchasePrice);
        setAskingPrice(askingPrice);
        itemCount++;
    }

    public static int getCount() {
        return itemCount;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
     
    public Date getDateAcquired() {
        return dateAcquired;
    }
    
    public void setDateAcquired(Date dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
    
    public int getPurchasePrice() {
        return purchasePrice;
    }
    
    public void setPurchasePrice(int purchacePrice) {
        this.purchasePrice = purchacePrice;
    }
    
    public int getAskingPrice() {
        return askingPrice;
    }
    
    public void setAskingPrice(int askingPrice) {
        this.askingPrice = askingPrice;
    }
    
    
    public void remove() {
        itemCount--;
    }
    
    public int calculateProfit(){
        int profit = purchasePrice - askingPrice;
        return profit;
    }
    
}

