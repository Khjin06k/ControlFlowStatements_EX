import java.util.Scanner;

public class Ex1 {
    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args){
        String dice = myInput.nextLine();

        if(dice.equals("1")) {
            System.out.println("1번");
        } else if(dice.equals("2")){
            System.out.println("2번");
        } else if(dice.equals("3")) {
            System.out.println("3번");
        } else if(dice.equals("4")){
            System.out.println("4번");
        } else if(dice.equals("5")){
            System.out.println("5번");
        } else if(dice.equals("6")){
            System.out.println("6번");
        } else {
            System.out.printf("숫자 %s은 없는 숫자입니다.", dice);
        }



    }
}
