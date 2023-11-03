package wee2.day1;

public class IsPalindrome {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int input = 12321;
    int output = 0;
    
    System.out.println("Input Number:" + input);
    
    for(int i=input;i>0;i=i/10)
    {
    	int remainder=i%10;
    	output=(output*10)+ remainder;
    }
    System.out.println("Output Number:" + output);
    if(input==output)
    {
    	System.out.println("The given number" + input + " is a palindrome");
    	
    }else {
         System.out.println("The given number"+ output + "is not a palindrome");
    }
    
	}

}
