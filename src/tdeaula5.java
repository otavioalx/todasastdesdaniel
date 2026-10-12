//1 — Escreva um método que recebe um int idade e soma 1 a ele.
// No main, mostre que a variável original não muda (primitivo é passado por valor).

//public class tdeaula5 {
//    public static void main(String[] args) {
//        int idade = 20;
//        aniversario(idade);
//        System.out.println("Idade no main: " + idade);
//    }
//
//    static void aniversario(int idade) {
//        idade = idade + 1;
//    }
//}







//2 — Escreva um método que recebe um int[] e dobra todos os elementos.
// Mostre que o array original muda (objeto é passado por referência).
import java.util.Arrays;
//public class tdeaula5 {
//    public static void main(String[] args) {
//        int[] valores = {1, 2, 3, 4};
//        dobrarTudo(valores);
//        System.out.println(Arrays.toString(valores));
//    }
//
//    static void dobrarTudo(int[] valores) {
//        for (int i = 0; i < valores.length; i++) {
//            valores[i] *= 2;
//        }
//    }
//}






//3 — Crie um array, aponte um segundo nome para ele (int[] apelido = original;),
// altere por apelido e mostre que original também mudou (aliasing).
import java.util.Arrays;
//public class tdeaula5 {
//    public static void main(String[] args) {
//        int[] original = {5, 10, 15};
//        int[] apelido = original;
//        apelido[1] = 99;
//        System.out.println("original: " + Arrays.toString(original));
//        System.out.println("apelido:  " + Arrays.toString(apelido));
//    }
//}






//4 — Crie duas String com o mesmo conteúdo usando new String(...).
// Compare com == e com .equals() e observe a diferença.
//public class tdeaula5 {
//    public static void main(String[] args) {
//        String palavra1 = new String("java");
//        String palavra2 = new String("java");
//        System.out.println("palavra1 == palavra2:      " + (palavra1 == palavra2));
//        System.out.println("palavra1.equals(palavra2): " + palavra1.equals(palavra2));
//    }
//}







//5 — Escreva um método int somaSegura(int[] valores) que devolve 0 se o array
// for null, e a soma dos elementos caso contrário.
//public class tdeaula5 {
//    public static void main(String[] args) {
//        int[] cheio = {1, 2, 3};
//        int[] vazio = null;
//        System.out.println("Soma cheio: " + somaSegura(cheio));
//        System.out.println("Soma vazio: " + somaSegura(vazio));
//    }
//
//    static int somaSegura(int[] valores) {
//        if (valores == null) {
//            return 0;
//        }
//        int total = 0;
//        for (int valor : valores) {
//            total += valor;
//        }
//        return total;
//    }
//}







//6 — Escreva um método void aplicarDesconto(double[] precos, double percentual) que reduz cada preço pelo percentual.
// Leia do console quantos preços e os valores, chame o método e imprima a lista alterada — comprovando que o método
//  mudou o array original (referência).

import java.util.Arrays;
import java.util.Scanner;

//public class tdeaula5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Quantos precos? ");
//        int quantidade = sc.nextInt();
//        double[] precos = new double[quantidade];
//        for (int i = 0; i < quantidade; i++) {
//            System.out.print("Preco: ");
//            precos[i] = sc.nextDouble();
//        }
//
//        aplicarDesconto(precos, 10);   // 10% de desconto
//        System.out.println(Arrays.toString(precos));
//    }
//
//    static void aplicarDesconto(double[] precos, double percentual) {
//        for (int i = 0; i < precos.length; i++) {
//            precos[i] = precos[i] - precos[i] * percentual / 100;
//        }
//    }
//}





