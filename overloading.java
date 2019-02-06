package Basics;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean status =	addition(10,20);
	if (status == true) {
		displayName();
		
	} else {
   System.out.println("not found");
	}
	
		
			}
	
	
	
	
   public static boolean  addition(int a ,int b){
	   
	  int result = 0;
	  boolean flag = true;
	  result = a + b ;
	  
	  if(result == 30)
	  {
		  
	   	flag=true;  
		  
	  }else{
		  
		 flag=false; 
		  
	  }
	return flag;
	  
	  
	  
	 
	   
   }
   
   
    
   
   public static void displayName(){
		  
		  
		System.out.println("Sahil");  
	  }
	
	
	
	
	
	
	

}
