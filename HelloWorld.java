import java.math.BigInteger;
import java.util.concurrent.*;

public class HelloWorld {
public static BigInteger fib(BigInteger n) {
    if (n.compareTo(BigInteger.ONE) == -1 || n.compareTo(BigInteger.ONE) == 0 ) return n;
    else 
        return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.ONE).subtract(BigInteger.ONE)));
}

public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    for (int j = 0; j < 1; j++) { // the difficulty
        final int ID = j;
        executorService.submit(new Runnable() {

            public void run() {
                for (int i=0;i < 10; i++) { // another diffuculty Integer.MAX_VALUE
                    System.out.println(ID+" worker: "+i + ": " + fib(new BigInteger(String.valueOf(i))));
                }
            }
        });
    }        
}
}

/** 
class HelloWorld{public static void main(String args[]) {    
 int n1=0;
 int n2=1;
 int n3;
 int i;
 int count=1000;
  
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  
*/

/** 
 * The HelloWorldApp class simply prints "Hello World" to the standard output
 
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
*/
