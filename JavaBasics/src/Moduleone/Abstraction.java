package Moduleone;

abstract class Geometry
{
	public void rectangle(int height, int width)
	{
		int res=height*width;
		System.out.println("area of rectangle : "+res);
	}
	
	public void triangle(int side)
	{
		int res=side*side*side;
		System.out.println("area of triangle : "+res);
	}
}

