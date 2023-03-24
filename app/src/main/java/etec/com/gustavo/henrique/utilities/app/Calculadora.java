package etec.com.gustavo.henrique.utilities;

/**
 * Classe Calculadora - Manipulara as Operaçoes
 */
public class Calculadora {

	/**
	 * [somar description]
	 * @param  valorA [description]
	 * @param  valorB [description]
	 * @return        [description]
	 */
	protected float somar(float valorA, float valorB) {
		return valorA + valorB;
	}

	/**
	 * [subtrair description]
	 * @param  valorA [description]
	 * @param  valorB [description]
	 * @return        [description]
	 */
	protected float subtrair(float valorA, float valorB) {
		return valorA - valorB;
	}

	/**
	 * [multiplicar description]
	 * @param  valorA [description]
	 * @param  valorB [description]
	 * @return        [description]
	 */
	protected float multiplicar(float valorA, float valorB) {
		return valorA * valorB; 
	}

	/**
	 * [dividir description]
	 * @param  valorA [description]
	 * @param  valorB [description]
	 * @return        [description]
	 */
	protected float dividir(float valorA, float valorB) {
		return valorA / valorB;
	}


	/**
	 * [realizarOperacao description]
	 * @param  valorA   [description]
	 * @param  valorB   [description]
	 * @param  operacao [description]
	 * @return          [description]
	 */
	protected float realizarOperacao(float valorA, float valorB, String operacao) {
		float result = 0.0;

		switch (operacao) {
			case "+": 
				result = this.somar(valorA, valorB);
				break;

			case "-":
				result = this.subtrair(valorA, valorB);
				break;

			case "*":
				result = this.multiplicar(valorA, valorB);
				break;

			case "/":
				result = this.dividir(valorA, valorB);
				break;
		}

		return result;
	}

}
