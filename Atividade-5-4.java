import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int y = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        int [] vetor = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int x = 0; x < vetor.length; x++) {

            y = y + 1;

            System.out.println("Digite um valor: ");
            vetor[x] = sc.nextInt();
        }

        for (int x = 0; x < vetor.length; x++) {

            if (vetor[x] >= 0 && vetor[x] <= 100) {
                a = a + 1;
            } else if (vetor[x] >= 101 && vetor[x] <= 200) {
                b = b + 1;
            }else if (vetor[x] > 200) {
                c = c + 1;
            }
        }

        System.out.println(a + " - Entre 0 e 100");
        System.out.println(b + " - Entre 101 e 200");
        System.out.println(c + " - Maior que 200");

    }
}
