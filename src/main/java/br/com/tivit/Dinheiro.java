/**
 * 
 */
package br.com.tivit;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.MonetaryOperator;
import javax.money.NumberValue;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

/**
 * @author Alexandre
 *
 */
public class Dinheiro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CurrencyUnit moeda = Monetary.getCurrency("BRL");
		MonetaryAmount valorDaParcela = Money.of(75, moeda);
		System.out.println(valorDaParcela);
		MonetaryAmount vlTotal = valorDaParcela.multiply(12);
		System.out.println(vlTotal);
		MonetaryAmount desconto = vlTotal.with(MonetaryOperators.percent(10));
		System.out.println(desconto);
		
		NumberValue descontoSemMoeda = desconto.getNumber();
		
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
		String valorPorExtenso=conversor.toWords(descontoSemMoeda.doubleValue() );
		System.out.println(valorPorExtenso);
		
		
		
	}

}
