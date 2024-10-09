import java.util.Scanner;

   public class SpringSeason {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();;

         boolean isSpring = isSpringSeason(month, day);

                System.out.println(isSpring);
    }

  public static boolean isSpringSeason(int month, int day) {

        if ((month == 2 && day >= 12 && day <= 28) ||
            (month == 3 && day >= 1 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 11)) {
            return true;
        } else {
            return false;
        }
    }
}



