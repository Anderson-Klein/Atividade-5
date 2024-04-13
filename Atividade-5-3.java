import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ida = 0;
        int idm = 0;
        int idd = 0;
        int idEmDias = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade primeiro quantos anos depois quantos mes e por ultimo quantos dias de vida: ");
        System.out.printf("Digite quantos anos: ");
        ida = sc.nextInt();
        System.out.printf("Digite quantos meses: ");
        idm = sc.nextInt();
        System.out.printf("Digite quantos dias: ");
        idd = sc.nextInt();


        ida = ida * 365;
        idm = idm * 30;

        idEmDias = ida + idm + idd;

        System.out.println("Sua idade em dias: " + idEmDias);
    }
}
