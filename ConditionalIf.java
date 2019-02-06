package Basics;

public class ConditionalIf {

	public static void main(String[] args) {
		
		
		
		String name1 = "sahil123chopra";
		
		
		if(name1.equalsIgnoreCase("sahilchopra")){
			
			
			System.out.println("name are same");
			
		}
		else if (name1.equalsIgnoreCase("sahil_chopra")){
			System.out.println("name are not  same");
		}
		
		else if(name1.equalsIgnoreCase("sahil123")){
			
			
			System.out.println("name are not  same");
		}
		
		else{
			
			System.out.println("name are not same");
		}
	}

}
