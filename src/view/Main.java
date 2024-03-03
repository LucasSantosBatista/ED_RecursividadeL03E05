package view;

import javax.swing.JOptionPane;

import controller.FibonacciController;

/**
 * @author Lucas Batista 3 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		int n = 0;
		
		//Teste: exibe Fibonacci até 20 ocorrência
		int a = 0;
        int b = 1;
        for (int i = 0; i < 20; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(a + "  ");
        }
        
        //Valida número
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posição para o Fibonacci(maior que zero e menor que 20): "));
		} while(n < 1 || n > 20);
		
		//Resultado
		FibonacciController fCont = new FibonacciController();
		int resultado = fCont.calculaFibonacci(n);
		System.out.println("\nFibonacci na " + n + "ª posição é " + resultado);
	}

}
