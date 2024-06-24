import java.util.Scanner;

public class DetectorConteudoImproprio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar uma frase ao usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Verificar se a frase contém as palavras "sexo" ou "sexual" (ignorando maiúsculas/minúsculas)
        if (frase.toLowerCase().contains("sexo") || frase.toLowerCase().contains("sexual")) {
            System.out.println("Conteúdo impróprio");
        } else {
            System.out.println("Conteúdo liberado");
        }

        scanner.close();
    }
}
