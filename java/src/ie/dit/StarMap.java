package ie.dit;
import processing.core.*;
import processing.data.*;

public class StarMap extends PApplet 
{

    public void setting()
    {
            size(500,500);

    }

    arrayList<Star> stars = new arrayList<>();
    public void setup()
    {
            Table table = loadTable("HabHYG15ly.csv","header");
            for(TableRow row:table.rows())
            {
                Star s = new Star(row);
                stars.add(s);
            }
    }
    public void draw()
    {
        

    }




}