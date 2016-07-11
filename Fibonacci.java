package prFibonacciGUI;

public class Fibonacci {
	public int fibonacci(int a){
		if(a<0){
			throw new IllegalArgumentException("null");
		}
        int f0=0;
        int f1=1;
        int fn=0;
        for(int i=0; i<a; i++){
            if(i==1){
                fn=0+f1;
            }else{
                fn=f0+f1;
            }
            f0=f1;
            f1=fn;
        }
     
        return fn;
    }
}
