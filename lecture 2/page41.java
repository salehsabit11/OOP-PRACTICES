import java.util.Scanner;
//task 1
// class page41{
//     public static void main(String[] args) {
//         int n=2020;
//         if(n%400==0 && n%100!=0|| n%4==0 && n%100!=0){
//             System.out.println("Leapyearr");
//         }
//         else System.err.println("not leap");
//     }
// }


//task 2
class page41{
    public static void main(String[] args) {
        int n=10;
        int[] even=new int[5];
        int oddindex=0;
        int[] odd=new int[5];
        int evenindex=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) {
                even[evenindex]=i;
                evenindex++;
            }
            else {
                odd[oddindex]=i;
                oddindex++;
            }
        }
        /*System.out.print("Even numbers: ");
        for (int num : even) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.print("Odd number:");

        for(int num:odd){
            System.out.print(num + " ");
        }*/
        int evensum=0;
        for(int num:even){
            evensum+=num;
        }
        System.out.println("Even sum: "+evensum);


    }
}

