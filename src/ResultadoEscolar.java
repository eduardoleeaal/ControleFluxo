import java.util.Scanner;
/**
 * Classe ResultadoEscolar
 * Esta classe é responsável por determinar o resultado escolar de um aluno com base na nota que ele recebe.
 */
public class ResultadoEscolar {

    /**
     * Método principal do programa.
     * Este método é o ponto de entrada do programa. Ele lê a nota do aluno a partir da entrada do usuário,
     * chama o método getResultado passando a nota como argumento e imprime o resultado na console.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        System.out.println(getResultado(nota));
        sc.close();
    }

    /**
     * Método getResultado
     * Este método recebe a nota do aluno como um argumento e retorna uma string representando o resultado escolar do aluno.
     * Se a nota for maior que 6, o aluno é aprovado. Se a nota for exatamente 6, o aluno está em recuperação. 
     * Se a nota for menor que 6, o aluno é reprovado.
     *
     * @param nota a nota do aluno
     * @return o resultado escolar do aluno
     */
    public static String getResultado(int nota) {
        return nota > 6 ? "Aprovado" : nota == 6 ? "Recuperação" : "Reprovado";
    }
}