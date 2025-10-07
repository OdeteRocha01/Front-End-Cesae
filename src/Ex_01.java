import java.security.spec.ECFieldF2m;

public class Ex_01 {

    Scanner input = new Scanner(System.in);

    //declarar a variável
    int[] num = new int[10];


    //Pedir ao utilizador os numeros que quer em cada linha
        for (int i = 0; i < 10; i++) {
        System.out.print("Insira um valor na gaveta [" + i + "]: ");
        num[i] = input.nextInt();
    }

    //Ciclo para imprimir os valores guardados  na gaveta
        for (int i = 0; i < num.length; i++){
        System.out.println("Na gaveta, na posição[" + i + "]: " + num[i]);
    }

}



