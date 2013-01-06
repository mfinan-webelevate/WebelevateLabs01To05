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
		int x = 0;


		//Declare objects
		MainWindow mWindow;
		InputBox iBox;
		OutputBox oBox;

		//Create objects
		mWindow = new MainWindow();
		iBox = new InputBox(mWindow);
		oBox = new OutputBox(mWindow);

		//set a value

		//Use objects
		mWindow.show();

		//get Input
		x = iBox.getInteger("input a value for x : ");

		//Process


		//Output
		oBox.show();
		oBox.print("The value you put into the variable x is :" + x );

	}
}
