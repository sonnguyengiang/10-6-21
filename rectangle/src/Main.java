import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a weidht: ");
        double weidth = scanner.nextDouble();
        System.out.print("enter a height: ");
        double height = scanner.nextDouble();

        Ractangle ractangle = new Ractangle(weidth,height);
        System.out.print(ractangle.display());

    }
}
