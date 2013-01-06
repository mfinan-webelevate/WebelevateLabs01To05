/*****************************************************************
 *	calculate the volume of a sphere given the radius
 *  using a sphere class
 *
 *	Date: 01 Oct 2011
 *	@author Conor O Reilly
 *
 *****************************************************************/

import javabook.*;

class App
{

	public static void main(String args[])
	{
		App thisProgram = new App();
	}

	public App()
	{
		//Declare variables
		double aRadius;
		double aVolume;

		//Declare objects
		MainWindow mWindow;
		InputBox iBox;
		OutputBox oBox;

		Sphere aSphere;

		//Create objects
		mWindow = new MainWindow();
		iBox = new InputBox(mWindow);
		oBox = new OutputBox(mWindow);

		aSphere = new Sphere();

		//Use objects
		mWindow.show();

		//get Input
		aRadius = iBox.getDouble("Please enter the radius of the sphere: ");
		aSphere.setTheRadius(aRadius);

		//debug code
		System.out.println( "value input:" + aRadius);
		System.out.println( "the radius value in the sphere object:" + aSphere.getTheRadius() );

		//Process
		aSphere.computeVolume();
		aVolume = aSphere.getTheVolume();

		//Output
		oBox.show();
		oBox.print(" The volume of a sphere with a radius of  " + aRadius + " is "+ aVolume );

	}

}
