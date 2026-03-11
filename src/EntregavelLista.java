import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntregavelLista {
    static void main() {

        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Informe o tamanho da lista: ");
        int tamanho = scan.nextInt();

        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite o valor " + (i + 1) + ": ");
            int valor = scan.nextInt();
            numeros.add(valor);
        }
        // a) Imprimir apenas os números pares (filter)

        // b) Imprimir os valores dobrados (map)

        // c) Imprimir os valores em ordem crescente (sorted)

        System.out.println("\n--- Lista original com forEach da List ---");
        for (int numero : numeros){
            System.out.println(numero);
        }
        scan.close();


    }
}
