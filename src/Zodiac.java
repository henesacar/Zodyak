import java.util.Scanner;
public class Zodiac {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year;
        System.out.print("Doğum yılınızı girin: ");
        year = scn.nextInt();
        switch (year%12){
            case 0:
                System.out.println("Çin Zodyağı burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı burcunuz: At");
                break;
            case 11:
                System.out.println("Çin Zodyağı burcunuz: Koyun");
                break;

        }
    }
}
