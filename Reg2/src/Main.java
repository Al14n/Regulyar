import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        Reg.Regic(a);
    }
}