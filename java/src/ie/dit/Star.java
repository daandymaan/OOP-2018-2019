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





    
}