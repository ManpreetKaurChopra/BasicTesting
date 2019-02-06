package Basics;

public class multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String userDetails [][] =new String[8][4];
		
		userDetails[0][0] = "sahil";
		userDetails[0][1]="c";
		userDetails[1][0]="Manpr";
		userDetails[1][1]="c";
		
		int rowlenth = userDetails.length;
		int colenth = userDetails[0].length;
		
		for (int i = 0; i < rowlenth; i++) {
			
			for (int j = 0; j < colenth; j++) {
				
				
				System.out.print(userDetails[i][j] + "  ");
							}
			System.out.println("");
				
			}

	}

}

