package Ex2project.Ex2project;

public class Ex2projectclass1 {
	
	
	
	public static String BVAnumberToChar(int x) {
		if ((x<1) &(x>100) )
			return "error";
		if ((x>=1) & (x<=49))
			return "F";
		if((x>=50) & (x<=59))
			return "E";
		if((x>=60) & (x<=69))
			return "D";
		if ((x>=70) & (x<=79))
			return "C";
		if((x>=80) & (x<=89))
			return "B";
		if ((x>=90) & (x<=100))
			return "A";
		else
			return null;
		
	}
	

		
		

}
