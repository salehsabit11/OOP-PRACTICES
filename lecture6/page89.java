
import java.util.Scanner;

// class page89{
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter the name:");
//         String name=s.nextLine();
//         String reversed="";
//         for(int i=name.length()-1;i>=0;i--){
//             reversed+=name.charAt(i);
//         }
//         System.err.println("Reversed: "+reversed);
//         s.close();
//     }
// }




// task 2

// class page89 {

//     public static void main(String[] args) {
//         String s = "sabit";
//         int st = 0;
//         int ed = s.length() - 1;
//         Boolean ok = true;
//         while (st < ed) {
//             if (s.charAt(st) == s.charAt(ed)) {
//                 st++;
//                 ed--;
//             } else {
//                 ok = false;
//                 break;
//             }

//         }
//         if (ok) {
//             System.out.println("Palidrome"); 
//         }else {
//             System.out.println("Not palindrome");
//         }
//     }
// }


//task 3
class page89{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int[] occurence=new int[256];
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            occurence[c]++;
        }
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(occurence[c]!=0){
                System.out.println(c+"->"+occurence[c]);
                occurence[c]=0;
            }
        }

    
        sc.close();
    }
}