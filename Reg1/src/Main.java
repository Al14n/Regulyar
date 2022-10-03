import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите 4 слова одной длины через пробел");
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();

        Reg.Regik(b);
    }
}