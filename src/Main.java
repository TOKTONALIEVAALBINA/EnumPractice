import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String word = sc.nextLine();
        Spring spring = Spring.valueOf(word.toUpperCase());
        spring.met();

        switch (spring){
            case MAY -> System.out.println("may");
            case APRIL -> System.out.println("april");
            case MARCH -> System.out.println("march");
        }
    }
}