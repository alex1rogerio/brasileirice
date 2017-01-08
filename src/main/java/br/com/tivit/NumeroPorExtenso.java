/**
 * 
 */
package br.com.tivit;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

/**
 * @author Alexandre
 *
 */
public class NumeroPorExtenso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumericToWordsConverter numericToWordsConverter = new NumericToWordsConverter(new FormatoDeReal());
		BigDecimal valor = new BigDecimal("1.90");
		System.out.println(numericToWordsConverter.toWords(valor.doubleValue()));
		
		
		
		
	}

}
