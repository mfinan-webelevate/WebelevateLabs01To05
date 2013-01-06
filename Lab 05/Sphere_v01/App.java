/*****************************************************************
 *	calculate the volume of a sphere given the radius
 *  EXPLAINING THE MOVE TO OBJECTS step 1
 *
 *	Date: 01 Oct 2011
 *	@author Conor O Reilly
 *
 *****************************************************************/

import javabook.*;

class App
{

	//Declare constants
	public static final double PI = Math.PI;			// get the exact value from the Math.PI constant
										// part of default java.lang library so don't need an import statement to use it

	public static final double RATIO_4_OVER_3 = (float)  4 / 3 ;



	public static void main(String args[])
	{

		//Declare variables
		double theRadius;
		double theVolume;

		//Declare objects
		MainWindow mWindow;
		InputBox iBox;
		OutputBox oBox;

		//Create objects
		mWindow = new MainWindow();
		iBox = new InputBox(mWindow);
		oBox = new OutputBox(mWindow);

		//Use objects
		mWindow.show();

		//get Input
		theRadius = iBox.getDouble("Please enter the radius of the sphere: ");

		//debug code
		System.out.println( "The ratio 4 over 3 :" + RATIO_4_OVER_3);
		System.out.println( "PI :" + Math.PI);
		System.out.println( "The radius to the power of 3 :" + ( theRadius * theRadius * theRadius));

		//Process
		//theVolume = RATIO_4_OVER_3 * Math.PI * ( theRadius * theRadius * theRadius);
		theVolume = SphereAreaCalc(theRadius);

		//Output
		oBox.show();
		oBox.print(" The volume of a sphere with a radius of  " + theRadius + " is "+ theVolume);
	}

	public static double SphereAreaCalc( double aRadius)
	{
		//the variables in here only exist in memory while
		//this part of the code is running then they are gone

		double aVolume;
		aVolume = RATIO_4_OVER_3 * PI * Math.pow( aRadius, 3 );
		return aVolume;
	}
}
