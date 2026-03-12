import java.util.Scanner;
import javax.swing.text.html.parser.TagElement;
/*public class page47 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        float sum = 0;
        int i = 0;

        while (i < nums.length) {
            sum += nums[i];
            i++;
        }

        float average = sum / nums.length;
        System.out.println("Average: " + average);
    }
}
*/
//task 2
/* 
public class page47{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a letter grade(cgpa):");
        double lettergrade=s.nextDouble();

        System.out.println("Have u completed?");
        boolean semester=s.nextBoolean();
        if(semester){
            if(lettergrade>=3.5){
                System.out.println("Congratulation");
            }
            else{
                System.out.println("Failed to meet expectation");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
}*/

// task3
public class page47{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Sale target:");
        int target=s.nextInt();
        System.out.println("Attendence:");
        int present=s.nextInt();
        int bonus;
        if(target>95&& present==100){
          bonus=60;
          //  System.out.println("60 percent bonus");
        }
        else if(target>95 && present==90){
            bonus=40;
        }
        else bonus=5;
        System.out.println("bonus:"+bonus);
    }
}