import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();

    System.out.print("Informe o tamanho da lista: ");
    int tamanho = scan.nextInt();

    for (int i = 0; i < tamanho; i++){
        System.out.println("Digite o valor " + (i + 1) + ": ");
        int valor = scan.nextInt();
        numeros.add(valor);
    }
    // Lambda que filtra os números da list para mostrar apenas o valores pares
    System.out.println("\n--- Apenas os números pares da sua List ---");
    numeros.stream().filter(numero -> numero % 2 == 0).forEach(System.out::println);

    // Lambda que dobra e mostra os valores da list
    System.out.println("\n--- Dobra e mostra os múmeros da sua List ---");
    numeros.stream().map(numero -> numero * 2).forEach(System.out::println);

    //Lambda que organiza os números da list em ordem crescente
    System.out.println("\n--- Organiza os números da sua List em ordem crescente ---");
    numeros.stream().sorted().forEach(System.out::println);

    // forEach
    System.out.println("\n--- Lista original com forEach da List ---");
    numeros.forEach(System.out::println);
    scan.close();
}
