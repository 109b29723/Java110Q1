class Cal_area
{
	int radius;
	int length;
	int width;
	int height;
	double volume()
	{
		return Math.round((radius*radius*radius*3.14159*4/3)*10.0)/10.0;
	}
	int surfaceArea()
	{
		return (length*width+width*height+length*height)*2;
	}
}
public class Class01 {

	public static void main(String[] args) {
		Cal_area area = new Cal_area();
		area.radius = 10;
		area.length = 4;
		area.width = 5;
		area.height = 6;
		System.out.println("半徑="+area.radius);
		System.out.println("球型體積="+area.volume());
		System.out.println("長="+area.length+",寬="+area.width+",高="+area.height);
		System.out.println("立方體表面積="+area.surfaceArea());

	}

}
