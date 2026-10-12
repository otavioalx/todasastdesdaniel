
//1 — Classe Produto com nome e preco privados. O setPreco deve recusar preço negativo.

//class Produto {
//    private String nome;
//    private double preco;
//
//    Produto(String nome, double preco) {
//        this.nome = nome;
//        setPreco(preco);
//    }
//
//    public String getNome() { return nome; }
//    public double getPreco() { return preco; }
//
//    public void setPreco(double preco) {
//        if (preco >= 0) {
//            this.preco = preco;
//        } else {
//            System.out.println("Preco invalido, ignorado");
//        }
//    }
//}
//
//public class tdeaula9 {
//    public static void main(String[] args) {
//        Produto produto = new Produto("Caneta", 3.5);
//        produto.setPreco(-10);
//        System.out.println(produto.getNome() + ": " + produto.getPreco());
//        produto.setPreco(5.0);
//        System.out.println(produto.getNome() + ": " + produto.getPreco());
//    }
//}





//2 — Classe Pessoa com idade privada. O setIdade deve recusar idade negativa.

//class Pessoa {
//    private String nome;
//    private int idade;
//
//    Pessoa(String nome) { this.nome = nome; }
//
//    public int getIdade() { return idade; }
//
//    public void setIdade(int idade) {
//        if (idade >= 0) {
//            this.idade = idade;
//        } else {
//            System.out.println("Idade invalida");
//        }
//    }
//}
//
//public class tdeaula9 {
//    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa("Ana");
//        pessoa.setIdade(-5);
//        pessoa.setIdade(30);
//        System.out.println("Idade: " + pessoa.getIdade());
//    }
//}





//3 — Classe Conta com saldo privado, sem setter. O saldo só muda por depositar e sacar (devolva true/false no saque).
//class Conta {
//    private double saldo;
//
//    public double getSaldo() { return saldo; }
//
//    public void depositar(double valor) {
//        if (valor > 0) saldo += valor;
//    }
//
//    public boolean sacar(double valor) {
//        if (valor > 0 && valor <= saldo) {
//            saldo -= valor;
//            return true;
//        }
//        return false;
//    }
//}
//
//public class tdeaula9 {
//    public static void main(String[] args) {
//        Conta conta = new Conta();
//        conta.depositar(200);
//        System.out.println("Saque 50 ok? " + conta.sacar(50));
//        System.out.println("Saque 500 ok? " + conta.sacar(500));
//        System.out.println("Saldo: " + conta.getSaldo());
//    }
//}







//4 — Classe Termometro com celsius privado, setCelsius, e dois getters: getCelsius() e getFahrenheit().
//class Termometro {
//    private double celsius;
//
//    public void setCelsius(double celsius) { this.celsius = celsius; }
//    public double getCelsius() { return celsius; }
//    public double getFahrenheit() { return celsius * 9 / 5 + 32; }
//}
//
//public class tdeaula9 {
//    public static void main(String[] args) {
//        Termometro termometro = new Termometro();
//        termometro.setCelsius(25);
//        System.out.printf("%.1f C = %.1f F%n", termometro.getCelsius(), termometro.getFahrenheit());
//    }
//}






//5 — Classe Aluno com nome, nota1 e nota2 privados, getter para o nome e um método media().

//class Aluno {
//    private String nome;
//    private double nota1, nota2;
//
//    Aluno(String nome, double nota1, double nota2) {
//        this.nome = nome;
//        this.nota1 = nota1;
//        this.nota2 = nota2;
//    }
//
//    public String getNome() { return nome; }
//    public double media() { return (nota1 + nota2) / 2.0; }
//}
//
//public class tdeaula9 {
//    public static void main(String[] args) {
//        Aluno aluno = new Aluno("Bruno", 7.0, 8.0);
//        System.out.printf("%s: media %.1f%n", aluno.getNome(), aluno.media());
//    }
//}






//6 — Usando a Conta do exercício 3, leia do console operações: D valor (depositar),
// S valor (sacar), F (fim). No fim, imprima o saldo; saque sem saldo avisa e não acontece.

//import java.util.Scanner;
//
//class Conta {
//    private double saldo;
//    public double getSaldo() { return saldo; }
//    public void depositar(double valor) { if (valor > 0) saldo += valor; }
//    public boolean sacar(double valor) {
//        if (valor > 0 && valor <= saldo) {
//            saldo -= valor;
//            return true;
//        }
//        return false;
//    }
//}
//
//public class tdeaula9 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Conta conta = new Conta();
//
//        System.out.println("Operacoes: D valor | S valor | F para fim");
//        while (true) {
//            String operacao = scanner.next();
//            if (operacao.equalsIgnoreCase("F")) break;
//            double valor = scanner.nextDouble();
//            if (operacao.equalsIgnoreCase("D")) {
//                conta.depositar(valor);
//            } else if (operacao.equalsIgnoreCase("S")) {
//                if (!conta.sacar(valor)) System.out.println("Saque negado");
//            }
//        }
//        System.out.printf("Saldo final: R$ %.2f%n", conta.getSaldo());
//    }
//}


