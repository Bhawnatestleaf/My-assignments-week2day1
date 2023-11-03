package wee2.day1;

import java.util.Arrays;

public class FindMissingNumber {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,4,3,2,8,6,7};
		int sum=0;
		Arrays.sort(num);//1,2,3,4,6,7,8
		for(int i=0;i<num.length;i++);
		sum=sum + num[1];
	}
	System.out.println(sum);
	int sum1=0;{
		
	for(int j=1;j<8;j++) {
		
		sum1 = sum1+j;
	}
	
	System.out.println("sum1");
	int sum;
	System.out.println("Missing Number:" +(sum1-sum));
	
	}

	
}

