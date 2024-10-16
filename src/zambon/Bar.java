package zambon;
import java.util.Scanner;

public class Bar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       

        double precoIngressoHomem = 10.0;
        double precoIngressoMulher = 8.0;
        double precoCerveja = 5.0;
        double precoRefrigerante = 3.0;
        double precoEspetinho = 7.0;
        double couvertArtistico = 4.0;
        double valorIsencaoCouvert = 30.0;

        System.out.print("Sexo (F ou M): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int qtdCervejas = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int qtdRefrigerantes = scanner.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int qtdEspetinhos = scanner.nextInt();

        double valorIngresso = (sexo == 'M') ? precoIngressoHomem : precoIngressoMulher;
        double valorConsumo = (qtdCervejas * precoCerveja) + (qtdRefrigerantes * precoRefrigerante) + (qtdEspetinhos * precoEspetinho);
        double valorCouvert = (valorConsumo > valorIsencaoCouvert) ? 0 : couvertArtistico;
        double valorTotal = valorIngresso + valorConsumo + valorCouvert;

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", valorConsumo);
        System.out.printf("Couvert = R$ %.2f\n", valorCouvert);
        System.out.printf("Ingresso = R$ %.2f\n", valorIngresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
