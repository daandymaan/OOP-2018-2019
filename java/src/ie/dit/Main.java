package ie.dit;

public class Main
{	

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
	
	public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
	}

	public void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
		
	}
	
	public void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
		
	}
<<<<<<< HEAD
	public void starmap()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch(a,new StarMap());
	}
=======
>>>>>>> d85640236ecd5b7cc0c4b1632cfc8cc97e76eb0c
	
	public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
<<<<<<< HEAD
		main.arrays();	
			
=======
		main.starMap();			
>>>>>>> d85640236ecd5b7cc0c4b1632cfc8cc97e76eb0c
	}
}