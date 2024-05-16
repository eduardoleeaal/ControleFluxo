import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        System.out.println(getResultado(nota));
        sc.close();
    }

    public static String getResultado(int nota) {
        return nota > 6 ? "Aprovado" : nota == 6 ? "Recuperação" : "Reprovado";
    }
}
