import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0;
        int y = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        n = sc.nextInt();

        y = n;

        for (int x = n; x >= 1; x--) {

            y = y - 1;

            System.out.println(x +" patinhos foram passear Além das montanhas Para brincar A mamãe gritou: Quá, quá, quá, quá");

            if ( y >= 1) {
                System.out.println("Mas só " + y + " patinhos voltaram de lá");
            } else if (y == 0) {
                System.out.println("Mas nunhum patinho voltou de lá");
            }
        }

        System.out.println(" A mamãe patinha foi procurar Além das montanhas Na beira do mar A mamãe gritou: Quá, quá, quá, quá E os " + n + " patinhos voltaram de lá.");

    }
}
