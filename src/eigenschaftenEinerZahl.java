import java.util.Scanner;

public class eigenschaftenEinerZahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gluecksZahl = 7;
        System.out.println(gluecksZahl + " ist deine Glückszahl");

        int zahl = scanner.nextInt();

        if (zahl % 10 == 0) {
            System.out.println(zahl + " ist eine runde Zahl");
        } else {
            System.out.println(zahl + " ist keine runde Zahl");
        }
        if (zahl % 2 == 0) {
            System.out.println(zahl + " ist eine gerade Zahl");
        } else {
            System.out.println(zahl + " ist keine gerade Zahl");
        }
        if (gluecksZahl == zahl) {
            System.out.println(zahl + " entspricht deiner Glückszahl");
        } else {
            System.out.println(zahl + " entspricht nicht deiner Glückszahl");
        }
        if (zahl >= 10 && zahl <= 99) {
            System.out.println(zahl + " ist eine zweistellige Zahl");
        } else {
            System.out.println(zahl + " ist keine zweistellige Zahl");
        }
    }
}
