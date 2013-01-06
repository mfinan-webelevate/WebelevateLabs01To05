/*****************************************************************
 *	Sphere
 *
 *	Date: 02 Oct 2011
 *	@author Conor O Reilly
 *****************************************************************/

class Sphere
{
	// DATA
	//............................................................
	//Private Constants
		private final double PI = Math.PI;
		private final double RATIO_4_OVER_3 = (float)  4 / 3 ;

	//Private Variables
		private double theRadius;
		private double theVolume;

	// CONSTRUCTORS
	//............................................................
	public Sphere()				// same name as the class and the file name
	{
		this.theRadius=0;
		this.theVolume=0;
	}

	// METHODS - behaviours
	//............................................................
	public void computeVolume()
	{
		this.theVolume = RATIO_4_OVER_3 *  PI * ( this.theRadius * this.theRadius * this.theRadius);

		// using the Math library the formula would be written
		// this.theVolume = RATIO_4_OVER_3 * Math.PI * Math.pow( this.theRadius, 3);
	}

	// METHODS - gets (accessors)  and sets (mutators)
	//............................................................
	public void setTheRadius(double radius)
	{
           this.theRadius= radius;
	}

	public double getTheRadius()
	{
	       return(this.theRadius);
	}

	// SHOULD NOT HAVE THIS METHOD, as theVolume is set by computeVolume()
	// just an example of the use of private - so external classes cannot see this method
	// and we wouldn't want it set any other way but by the computeVolume method.
	// Even though it is private it would be better not to have this method at all.
	private void setTheVolume(double volume)
	{
           this.theVolume = volume;
	}


	public double getTheVolume()
	{
           return(this.theVolume);
	}

}
