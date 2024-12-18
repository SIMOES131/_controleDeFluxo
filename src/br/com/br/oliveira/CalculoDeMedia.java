import java.util.Scanner;

public class CalculoDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializa o Scanner para entrada do usuário

        // Solicita ao usuário para inserir as notas
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        double nota4 = scanner.nextDouble();

        // Calcula a média
        double media = calcularMediaAritmetica(nota1, nota2, nota3, nota4);
        // Verifica a situação do aluno
        String resultado = verificarSituacao(media);

        // Exibe os resultados
        System.out.println("A média aritmética é: " + media);
        System.out.println("Situação do aluno: " + resultado);

        scanner.close(); // Fecha o Scanner
    }

    public static double calcularMediaAritmetica(double num1, double num2, double num3, double num4) {
        return (num1 + num2 + num3 + num4) / 4.0; // Calcula a média
    }

    public static String verificarSituacao(double media) {
        if (media >= 5.0 && media < 7.0) {
            return "Aluno em recuperação";
        } else if (media >= 7.0 && media <= 10) {
            return "Aluno aprovado";
        } else {
            return "Aluno reprovado";
        }
    }
}
