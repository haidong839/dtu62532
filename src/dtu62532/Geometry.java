package dtu62532;

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry gg = new Geometry();
		for(int ii= 0; ii<10; ii++)
		System.out.println(ii + " " + gg.getGeometry(ii));
		
	}
	
	public int getGeometry(int i) {
		if(i == 0) return 2;
		return 2*getGeometry(i-1);
	}

}
