//1 — Classe Animal com um método som(). Crie Cachorro e Gato
// que sobrescrevem som() ("Au au" e "Miau").

//class Animal {
//    String som() { return "..."; }
//}
//
//class Cachorro extends Animal {
//    @Override String som() { return "Au au"; }
//}
//
//class Gato extends Animal {
//    @Override String som() { return "Miau"; }
//}
//
//public class tdeaula10 {
//    public static void main(String[] args) {
//        Animal[] animais = { new Cachorro(), new Gato() };
//        for (Animal animal : animais) {
//            System.out.println(animal.som());
//        }
//    }
//}









//2 — Classe Funcionario (nome, salarioBase) com salario(). Crie Gerente que recebe u
// m bonus no construtor (com super) e sobrescreve salario() para somar o bônus.

//class Funcionario {
//    protected String nome;
//    protected double salarioBase;
//
//    Funcionario(String nome, double salarioBase) {
//        this.nome = nome;
//        this.salarioBase = salarioBase;
//    }
//
//    double salario() { return salarioBase; }
//}
//
//class Gerente extends Funcionario {
//    private double bonus;
//
//    Gerente(String nome, double salarioBase, double bonus) {
//        super(nome, salarioBase);
//        this.bonus = bonus;
//    }
//
//    @Override
//    double salario() { return salarioBase + bonus; }
//}
//
//public class tdeaula10 {
//    public static void main(String[] args) {
//        Gerente gerente = new Gerente("Dalva", 3000, 2000);
//        System.out.println(gerente.nome + ": " + gerente.salario());
//    }
//}










//3 — Classe Forma com area() devolvendo 0. Crie Quadrado e Circulo que sobrescrevem area().

//class Forma {
//    double area() { return 0; }
//}
//
//class Quadrado extends Forma {
//    private double lado;
//    Quadrado(double lado) { this.lado = lado; }
//    @Override double area() { return lado * lado; }
//}
//
//class Circulo extends Forma {
//    private double raio;
//    Circulo(double raio) { this.raio = raio; }
//    @Override double area() { return 3.14159 * raio * raio; }
//}
//
//public class tdeaula10 {
//    public static void main(String[] args) {
//        System.out.printf("Quadrado: %.2f%n", new Quadrado(4).area());
//        System.out.printf("Circulo:  %.2f%n", new Circulo(2).area());
//    }
//}








//4 — Classe Veiculo (marca) com descricao(). Crie Carro que adiciona portas e
// sobrescreve descricao() reaproveitando a da superclasse com super.descricao().


//class Veiculo {
//    protected String marca;
//    Veiculo(String marca) { this.marca = marca; }
//    String descricao() { return "Veiculo da marca " + marca; }
//}
//
//class Carro extends Veiculo {
//    private int portas;
//    Carro(String marca, int portas) {
//        super(marca);
//        this.portas = portas;
//    }
//
//    @Override
//    String descricao() {
//        return super.descricao() + " com " + portas + " portas";
//    }
//}
//
//public class tdeaula10 {
//    public static void main(String[] args) {
//        System.out.println(new Carro("Fiat", 4).descricao());
//    }
//}











//5 — Classe Conta (saldo, depositar). Crie ContaPoupanca que herda tudo
// e acrescenta um método renderJuros(taxa).

//class Conta {
//    protected double saldo;
//    void depositar(double valor) { if (valor > 0) saldo += valor; }
//    double getSaldo() { return saldo; }
//}
//
//class ContaPoupanca extends Conta {
//    void renderJuros(double taxa) { saldo += saldo * taxa; }
//}
//
//public class tdeaula10 {
//    public static void main(String[] args) {
//        ContaPoupanca poupanca = new ContaPoupanca();
//        poupanca.depositar(1000);
//        poupanca.renderJuros(0.10);
//        System.out.println("Saldo: " + poupanca.getSaldo());
//    }
//}










//6 — Crie um sistema de folha de pagamento. Leia do console, com Scanner,
// quantos funcionários existem; para cada um, leia o nome, o salário base e se
// é gerente (e, se for, o bônus). Guarde todos numa ArrayList<Funcionario> e, no fim,
// imprima o contracheque de cada um e o total da folha.


import java.util.ArrayList;
import java.util.Scanner;

//class Funcionario {
//    private String nome;
//    private double salarioBase;
//
//    Funcionario(String nome, double salarioBase) {
//        this.nome = nome;
//        this.salarioBase = salarioBase;
//    }
//
//    public String getNome() { return nome; }
//    double salario() { return salarioBase; }
//}
//
//class Gerente extends Funcionario {
//    private double bonus;
//
//    Gerente(String nome, double salarioBase, double bonus) {
//        super(nome, salarioBase);
//        this.bonus = bonus;
//    }
//
//    @Override
//    double salario() { return super.salario() + bonus; }
//}
//
//public class tdeaula10 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Funcionario> folha = new ArrayList<>();
//
//        System.out.print("Quantos funcionarios? ");
//        int quantidade = sc.nextInt();
//
//        for (int i = 0; i < quantidade; i++) {
//            System.out.print("Nome: ");
//            String nome = sc.next();
//            System.out.print("Salario base: ");
//            double base = sc.nextDouble();
//            System.out.print("E gerente? (s/n): ");
//            String resposta = sc.next();
//
//            if (resposta.equalsIgnoreCase("s")) {
//                System.out.print("Bonus: ");
//                double bonus = sc.nextDouble();
//                folha.add(new Gerente(nome, base, bonus));
//            } else {
//                folha.add(new Funcionario(nome, base));
//            }
//        }
//
//        System.out.println("\n=== FOLHA ===");
//        double total = 0;
//        for (Funcionario funcionario : folha) {
//            System.out.printf("%s: R$ %.2f%n", funcionario.getNome(), funcionario.salario());
//            total += funcionario.salario();
//        }
//        System.out.printf("Total: R$ %.2f%n", total);
//    }
//}