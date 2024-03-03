/**
 * 
 */
package controller;

/**
 * @author Lucas Batista 3 de mar. de 2024
 */
public class FibonacciController {

	public FibonacciController() {
		super();
	}

	public int calculaFibonacci(int n) {
		// Condição de parada: n é zero ou 1, assim passando por todas ocorrências antes da posição desejada
		if (n == 0 || n == 1) {
			return n;
		}
		// Chama função calculando Fibonacci recursivamente da posição desejada até 0 ou 1
		else {
			return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
		}
	}
}
