//import java.sql.Savepoint;
import java.util.Scanner;

// class page49{
//     public static void main(String[] args) {
//         int[] a={2,4,5,7,8,6,9};
//         int odd=0;
//         int even=0;
//         for(int i=0;i<a.length;i++){
//             if(a[i]%2==0) even++;
//             else odd++;
//         }
//         System.out.println(even+" and "+odd);
//     }
// }

//task 2
class page49{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci");
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++){
            int sum=a+b;
            System.err.print(sum+" ");
            a=b;
            b=sum;
           
        }

       

    }
}