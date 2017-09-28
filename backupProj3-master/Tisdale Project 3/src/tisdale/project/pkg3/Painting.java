/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisdale.project.pkg3;

import java.util.Date;

/**
 *
 * @author student
 */
public class Painting extends StoreItem{
    private static int paintingCount = 0;
    private int height;
    private int width;
    private String painter;
    private String media;    
    
    Painting(String title, Date dateAcquired, int purchasePrice, int askingPrice, 
            int height, int width, String painter, String media) {       
        super(title, dateAcquired, purchasePrice, askingPrice);
        setHeight(height);
        setWidth(width);
        setPainter(painter);
        setMedia(media);
        paintingCount++;
    }
    
    public static int getCount() {
        return paintingCount;
    }
 
    public String getPainter() {
        return painter;
    }
    
    public void setPainter(String painter) {
        this.painter = painter;
    }
    
    private void setHeight(int height) {
        this.height = height;
    }
    
    private int getHeight() {
        return height;
    }
    
    private void setWidth(int width) {
        this.width = width;
    }
    
    private int getWidth() {
        return width;
    }
    
    private void setMedia(String media) {
        this.media = media;
    }
    
    private String getMedia(){
        return media;
    }
    
    @Override
    public void remove() {
        paintingCount--;
        super.remove();
    }
    
    public String printableString(){
        String paintingInfo = "Title: " + this.getTitle() + "\nDate Acquired: " + this.getDateAcquired() + "\nPurchase Price: " + this.getPurchasePrice() + 
                "\nAsking Price: " + this.getAskingPrice()+ "\nHeight: " + this.getHeight() + 
                "\nWidth: " + this.getWidth()+ "\nMedia: " + this.getMedia();
        
        return paintingInfo;
    }
}
