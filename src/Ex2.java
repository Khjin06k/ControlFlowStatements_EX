import java.util.Scanner;

public class Ex2 {
    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args){
        String dice = myInput.nextLine();

        switch(dice) {
            case "1":
                System.out.println("1번");
                break;

            case "2":
                System.out.println("2번");
                break;

            case "3":
                System.out.println("3번");
                break;

            case "4":
                System.out.println("4번");
                break;

            case "5":
                System.out.println("5번");
                break;

            case "6" :
                System.out.println("6번");
                break;

            default:
                System.out.printf("숫자 %s는 없는 숫자입니다.", dice);
        }
    }
}
