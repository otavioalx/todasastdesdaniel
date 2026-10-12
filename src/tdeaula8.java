
//1 — Classe Retangulo com largura e altura, construtor, e um método area().
//class Retangulo {
//    double largura;
//    double altura;
//
//    Retangulo(double largura, double altura) {
//        this.largura = largura;
//        this.altura = altura;
//    }
//
//    double area() {
//        return largura * altura;
//    }
//}
//public class tdeaula8 {
//    public static void main(String[] args) {
//        Retangulo retangulo = new Retangulo(5, 3);
//        System.out.println("Area: " + retangulo.area());
//    }
//}



//2 — Classe ContaBancaria com saldo e os métodos depositar(valor) e
// sacar(valor). O saque não pode deixar o saldo negativo.
//class ContaBancaria {
//    double saldo;
//
//    void depositar(double valor) { saldo += valor; }
//
//    void sacar(double valor) {
//        if (valor <= saldo) saldo -= valor;
//        else System.out.println("Saldo insuficiente");
//    }
//}
//
//public class tdeaula8 {
//    public static void main(String[] args) {
//        ContaBancaria conta = new ContaBancaria();
//        conta.depositar(100);
//        conta.sacar(30);
//        System.out.println("Saldo: " + conta.saldo);
//        conta.sacar(200);
//    }
//}







//3 — Classe Produto com nome e preco, construtor e toString() no formato Caneta - R$ 3.50.
//class Produto {
//    String nome;
//    double preco;
//
//    Produto(String nome, double preco) {
//        this.nome = nome;
//        this.preco = preco;
//    }
//
//    public String toString() {
//        return nome + " - R$ " + String.format("%.2f", preco);
//    }
//}
//
//public class tdeaula8 {
//    public static void main(String[] args) {
//        Produto produto = new Produto("Caneta", 3.5);
//        System.out.println(produto);
//    }
//}








//4 — Classe Aluno com nome, nota1 e nota2, construtor e um método media().
//class Aluno {
//    String nome;
//    double nota1, nota2;
//
//    Aluno(String nome, double nota1, double nota2) {
//        this.nome = nome;
//        this.nota1 = nota1;
//        this.nota2 = nota2;
//    }
//
//    double media() { return (nota1 + nota2) / 2.0; }
//}
//
//public class tdeaula8 {
//    public static void main(String[] args) {
//        Aluno aluno = new Aluno("Carla", 9.0, 6.0);
//        System.out.printf("%s: media %.1f%n", aluno.nome, aluno.media());
//    }
//}







//5 — Classe Carro com marca, modelo e ano, construtor e um método descricao() que devolve Fiat Uno (2010).
//class Carro {
//    String marca, modelo;
//    int ano;
//
//    Carro(String marca, String modelo, int ano) {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.ano = ano;
//    }
//
//    String descricao() {
//        return marca + " " + modelo + " (" + ano + ")";
//    }
//}
//
//public class tdeaula8 {
//    public static void main(String[] args) {
//        Carro carro = new Carro("Fiat", "Uno", 2010);
//        System.out.println(carro.descricao());
//    }
//}










//6 — Cadastro de estoque: leia com Scanner quantos produtos existem; para cada um, nome e preço,
// guardando numa ArrayList<Produto>. No fim, imprima todos e o valor total.
import java.util.ArrayList;
import java.util.Scanner;

//class Produto {
//    String nome;
//    double preco;
//    Produto(String nome, double preco) {
//        this.nome = nome;
//        this.preco = preco;
//    }
//}

//public class tdeaula8 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Produto> estoque = new ArrayList<>();
//        System.out.print("Quantos produtos? ");
//        int quantidade = scanner.nextInt();
//        for (int i = 0; i < quantidade; i++) {
//            System.out.print("Nome: ");
//            String nome = scanner.next();
//            System.out.print("Preco: ");
//            double preco = scanner.nextDouble();
//            estoque.add(new Produto(nome, preco));
//        }
//        System.out.println("\n=== ESTOQUE ===");
//        double total = 0;
//        for (Produto produto : estoque) {
//            System.out.printf("%s - R$ %.2f%n", produto.nome, produto.preco);
//            total += produto.preco;
//        }
//        System.out.printf("Total: R$ %.2f%n", total);
//    }
//}

