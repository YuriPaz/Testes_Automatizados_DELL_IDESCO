package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Models.Operacao;

public class TestOperacao {

	Operacao op = new Operacao();

	@Test
	public void deveriaSomar() throws Exception {
		double valor1 = 3;
		double valor2 = 5;

		double soma = op.Soma(valor1, valor2);

		assertEquals(8, soma);
	}

	@Test
	public void deveriaSubtrair() throws Exception {
		double valor1, valor2, sub;

		valor1 = 5;
		valor2 = 3;

		sub = op.Sub(valor1, valor2);

		assertEquals(2, sub);
	}

	@Test
	public void deveriaMultiplicar() throws Exception {
		double valor1 = 1, valor2 = 2, mult;

		mult = op.Mult(valor1, valor2);

		assertEquals(2, mult);
	}

	@Test
	public void deveriaDividir() throws Exception {
		double valor1 = 6, valor2 = 2, div;

		div = op.Div(valor1, valor2);

		assertEquals(3, div);
	}

	@Test
	public void subtracaoPorZero() throws Exception {
		double valor1 = 52369, valor2 = 0, div;

		div = op.Div(valor1, valor2);

		assertEquals(0, div);
	}

}
