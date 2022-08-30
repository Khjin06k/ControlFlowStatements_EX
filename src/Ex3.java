import java.util.Scanner;

public class Ex3 {
    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args){
        int num = myInput.nextInt();

        if(num == 100){
            System.out.println("A+");
        }
        int num1 = num%10;

        if(num >=90){
            switch(num1){
                case 0:
                case 1:
                case 2:
                System.out.println("A-");
                    break;
                case 8:
                case 9:
                System.out.println("A+");
                    break;
                default: System.out.println("A");
            }
        } else if(num >=80){
            switch(num1){
                case 0:
                case 1:
                case 2:
                System.out.println("B-");
                    break;
                case 8:
                case 9:
                System.out.println("B+");
                break;
                default: System.out.println("B");
            }
        } else if(num>=70){
            switch(num1) {
                case 0:
                case 1:
                case 2:
                System.out.println("C-");
                    break;
                case 8:
                case 9:
                System.out.println("C+");
                    break;
                default:
                    System.out.println("C");
            }
        } else if(num >=60){
            switch(num1) {
                case 0:
                case 1:
                case 2:
                System.out.println("D-");
                    break;
                case 8:
                case 9:
                System.out.println("D+");
                    break;
                default:
                    System.out.println("D");
            }
        } else {
            System.out.println("F");
        }
    }
}
