// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if(x2<0){
			for(int i=0;i>x2;i--){
				x1--;
			}
			return x1;
		}
		for(int i = 0;i<x2 ; i++){
			x1++;
		}
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if(x2<0){
			for(int i=0;i>x2;i--){
				x1++;
			}
			return x1;
		}
		for(int i = 0;i<x2 ; i++){
			x1--;
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		if(x1<0 && x2<0){
			int a=0;
		for (int j = 0;j>x2;j--){
		for(int i = 0;i>x1 ; i--){
			a++;
		}
	}
		return a;
		
		}
		if(x1<0){
		int a=0;
		for (int j = 0;j<x2;j++){
		for(int i = 0;i>x1 ; i--){
			a++;
		}
	}
		return minus(0, a);
		
		}
		if(x2<0){
			int a=0;
		for (int j = 0;j>x2;j--){
		for(int i = 0;i<x1 ; i++){
			a++;
		}
	}
		return minus(0, a);
		
		}
		int a=0;
		for (int j = 0;j<x2;j++){
		for(int i = 0;i<x1 ; i++){
			a++;
		}
	}
		return a;
		
}


	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		if(n==0){
			return 1;
		}
		if(x==0){
			return 0;
		}
		int a=x;
		for(int i=1;i<n;i++){
			a=times(a,x);
		}

		return a;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		if(x2<0 && x1<0){
			x2=minus(0, x2);
			x1=minus(0, x1);
	
		   }
       if(x2>x1 && x1>0){
		return 0;
	   }
	   if(x1<0){
		x1=minus(0, x1);
		int sum=x2;
		int count=1;
		while(minus(x1,sum)>=x2){
		 sum=plus(sum,x2);
		 count++;
		}
 
		 return minus(0, count) ;
	   }
	   if(x2<0){
		x2=minus(0, x2);
		int sum=x2;
		int count=1;
		while(minus(x1,sum)>=x2){
		 sum=plus(sum,x2);
		 count++;
		}
 
		 return minus(0, count) ;
	   }
	   

	  

	   
	   
	   int sum=x2;
	   int count=1;
	   while(minus(x1,sum)>=x2){
		sum=plus(sum,x2);
		count++;
	   }

		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
       int a=div(x1,x2);
	   int b=times(a,x2);
	   int c=minus(x1,b);
		return c;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		if(x==0){
			return 0;
		}
		int i=0;
		int a=0;
		while(a<x){
			a=times(i,i);
			i++;
		}
		if(a>x){
			return i-2;
		}
        
		return i-1;
	}	  	  
}