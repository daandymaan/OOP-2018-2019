<<<<<<< HEAD
package ie.dit;
import processing.core.PVector;

public class Star 
{

    private int hab;
    private String displayName;
    private float distance;
    private float xg,yg,zg;
    private float absMag;
    PVector coords;



    public Star(TableRow r)
    {
        displayName = row.getString("Display Name");
        absMAg = row.getFloat("absMag");
        coords = row.getPVector("xg","yg","zg");
        distance = row.getFloat("Distance");

    }
    public int getHab()
    {
        return hab;
    }
    public void setHab(int hab)
    {
        this.hab = hab;
    }
    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;

    }
    public String getDisplay()
    {
        return displayName;
    }
    public float getDistance()
    {
        return distance;
    }
    public void setDistance(float distance)
    {
        this.distance = distance;
    }
    public void setCoords(float xg, float yg, float zg)
    {
        coords = new PVector(xg,yg,zg);
    }
    public PVector getCoords()
    {
        return coords;
    }
    public void setAbsMag(float absMag)
    {
        this.absMag = absMag;
    }   
    public float getAbsMag()
    {
        return absMag;
    }





    
=======
package ie.dit;

import processing.data.TableRow;

public class Star
{
    private String displayName;
    private int hab;
    private float xG;
    private float yG;
    private float zG;
    private float absMag;

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    /**
     * @return the hab
     */
    public int getHab() {
        return hab;
    }

    /**
     * @param hab the hab to set
     */
    public void setHab(int hab) {
        this.hab = hab;
    }

    /**
     * @return the xG
     */
    public float getxG() {
        return xG;
    }

    /**
     * @param xG the xG to set
     */
    public void setxG(float xG) {
        this.xG = xG;
    }

    /**
     * @return the yG
     */
    public float getyG() {
        return yG;
    }

    /**
     * @param yG the yG to set
     */
    public void setyG(float yG) {
        this.yG = yG;
    }

    /**
     * @return the zG
     */
    public float getzG() {
        return zG;
    }

    /**
     * @param zG the zG to set
     */
    public void setzG(float zG) {
        this.zG = zG;
    }

    /**
     * @return the absMag
     */
    public float getAbsMag() {
        return absMag;
    }

    /**
     * @param absMag the absMag to set
     */
    public void setAbsMag(float absMag) {
        this.absMag = absMag;
    }

    public String toString()
    {
        return displayName + "\t" + hab + "\t" + xG + "\t" + yG + "\t" + zG + "\t" + absMag;  
    }

    public Star(TableRow row)
    {
        displayName = row.getString("Display Name");
        hab = row.getInt("Hab?");
        xG = row.getFloat("Xg");
        yG = row.getFloat("Yg");
        zG = row.getFloat("Zg");
        absMag = row.getFloat("AbsMag");
    }

>>>>>>> d85640236ecd5b7cc0c4b1632cfc8cc97e76eb0c
}