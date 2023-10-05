package Course 2;

 import java.util.Scanner;
public class homeWork2 {


        public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            System.out.println("Cum te numesti? ");
            String name = user.next();
            System.out.println("Buna " + name);
            System.out.println(name + " cum crezi care este numarul magic in matematica?");
            double magicNumber = user.nextDouble();
            if(magicNumber == 3.14){
                System.out.println(name + " bravo, ai castigat");
            }
            else {
                System.out.println(" nu e bine, mai incearca, stiu ca esti un geniu");
            }
        }
    }

}
