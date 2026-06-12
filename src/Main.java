import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = leitura.nextDouble();

        String valorFormatado = String.format("%.2f", valor);
        System.out.println("Valor formatado: R$ " + valorFormatado);

    }
}