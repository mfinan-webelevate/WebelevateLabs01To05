/**
 *	Code Skeleton
 *
 *
 *	Date: 01 Nov 2012
 *	@author Conor O Reilly
 *
 */

import javabook.*;

class App
{
	public static void main(String args[])
	{

		//Declare constants


		//Declare variables
		int length = 0;
		int width = 0;
		int area = 0;


		//Declare objects
		MainWindow mWindow;
		InputBox iBox;
		OutputBox oBox;

		//Create objects
		mWindow = new MainWindow();
		iBox = new InputBox(mWindow);
		oBox = new OutputBox(mWindow);

		//set a value
		
		//specify location
		
		
		//Use objects
		mWindow.show();
		

		//get Input
		length = iBox.getInteger("Enter a value for Length :");
		width = iBox.getInteger("Enter a value for Width :");

		//Process
		area = length * width;


		//Output
		oBox.show();
		oBox.print("The area of the rectangle is " + area);
	}
}
