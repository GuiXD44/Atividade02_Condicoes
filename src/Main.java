import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a sua idade: ");
    double idade = sc.nextDouble();
    if (idade >= 18) {
        System.out.println("É maior de idade");
    }
    else if (idade < 18) {
        System.out.println("É menor de idade");
    }
}
}