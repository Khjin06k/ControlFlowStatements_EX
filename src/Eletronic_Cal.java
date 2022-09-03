import java.util.Scanner;

class Electronic_Cal {
    public static void main(String[] args){
        //Head
        System.out.println("=========================");
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=========================");

        //Body
        //사용량은 정수라고 가정하고 계산 진행
        // 기준 100kWh 이하 / 100kWh 초과 / 200kWh 초과 / 300kWh 초과 / 400kWh 초과 / 500kWh 초과
        // 만약 150kWh 만큼 사용한 경우 100kWh에 대한 가격인 60.7원 + 100kWh를 초과한 50만큼의 가격은 129.5원을 기준으로 책정 필요
        Scanner sc = new Scanner(System.in);
        int kWh = sc.nextInt();
        double price;

        if(kWh <=100){
            price = kWh*60.7;
        } else if(kWh<200){
            price = 100*60.7+(kWh-100)*125.9;
        } else if(kWh<300){
            price = 100*60.7+100*125.9+(kWh-200)*187.9;
        } else if(kWh<400){
            price = 100*60.7+100*125.9+100*187.9+(kWh-300)*280.6;
        } else if(kWh<500){
            price = 100*60.7+100*125.9+100*187.9+100*280.6+(kWh-400)*417.7;
        } else{
            price = 100*60.7+100*125.9+100*187.9+100*280.6+100*417.7+(kWh-500)*670.6;
        }
        System.out.println(price);







    }
}
