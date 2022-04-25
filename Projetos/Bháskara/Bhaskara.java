import java.util.Scanner;
import java.util.Locale;

public class Bhaskara {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, x1, x2, delta;

        System.out.println("Digite as partes da equacao do segundo grau:");
        System.out.print("a = ");
        a = sc.nextDouble(); sc.nextLine();
        System.out.print("b = ");
        b = sc.nextDouble(); sc.nextLine();
        System.out.print("c = ");
        c = sc.nextDouble(); sc.nextLine();
        
        sc.close();

        delta = Math.pow(b, 2.0) - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2.0*a);
        x2 = (-b - Math.sqrt(delta)) / (2.0*a);

        System.out.println("Equacao: " + a + "x² + " + b + "x + " + c);
        System.out.println("Raizes da equacao:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
