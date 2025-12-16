import java.util.*;


class AgeComp{

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Age :");
		int age = scan.nextInt();
		
		if((age>1) && (age <= 13)){
			
			System.out.println("YOU ARE A CHILD TAKE A LOLLYPOP");
			
		}
		if((age> 13) &&(age <= 30)){
			
			System.out.println("YOU ARE YOUNG EAT CHICKEN AND BEEF");
			
			
		}
		if(age > 30){
			
			System.out.println("YOU ARE OLD EAT FRUITS AND MAINTAIN YOUR HEALTH");
			
		}
		if((age < 1)){
			
			System.out.println("ENTER CORRECT AGE, \n AGE CANNOT BE NEGATIVE");
			
			
		}
		
		
		
	}

}