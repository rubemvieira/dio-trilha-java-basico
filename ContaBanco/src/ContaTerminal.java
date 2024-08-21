/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rubem
 */
public class ContaTerminal {

    public static void main(String[] args) {
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        Scanner inputDados = new Scanner(System.in);
        inputDados.useLocale(Locale.US);
        System.out.println("Digite o seu nome");
        NomeCliente = inputDados.nextLine();
        System.out.println("Digite o número da agência");
        Agencia = inputDados.nextLine();
        System.out.println("Digite o número da conta");
        Numero = inputDados.nextInt();
        System.out.println("Digite o seu saldo");
        Saldo = inputDados.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de " + Saldo + " já está disponível para saque.");

    }
}
