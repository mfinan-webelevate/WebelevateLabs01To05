import javabook.*;

public class App
{  // Save as "App4_1.java"
   public static void main(String[] args)
  {
   
   //declare variables
   int length;
   int width;
   int area;
   
   //declare objects
   MainWindow mWindow;
   InputBox iBox;
   OutputBox oBox;
   
   //create objects
   mWindow = new MainWindow();
   iBox = new InputBox(mWindow);
   oBox = new OutputBox(mWindow);
   
   mWindow.show();
   
   //get the length of the rectangle
   length = iBox.getInteger("Enter a length: ");
   
   //get the width of the rectangle
   width = iBox.getInteger("Enter a width: ");
   
   //process
   area = length * width;
   
   //output
   OutputBox.show(area);
   
  }
}   