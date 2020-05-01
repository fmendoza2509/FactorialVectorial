package factorialvectorial;

public class FactorialVectorial {
    public static void Factorial(int n){
        int fact =1;
        if((n==0)||(n==1)){
            fact=1;
        }else if(n==2){
            fact = 2;
        }else if(n>2){
            for(int i=2;i<=n;i++){
                fact *=i;
            }
        }
        System.out.println(fact);
    }
    public static void factorialArray(String a[]){
        int n =0;
        for(int i=0;i<a.length;i++){
            n = Integer.parseInt(a[i]);
            Factorial(n);
        } 
    }
    public static void main(String[] args) {
        factorialArray(args);
    }
    
}
