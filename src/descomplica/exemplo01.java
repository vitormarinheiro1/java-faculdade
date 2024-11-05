package descomplica;

public class exemplo01 {
	public static void main (String entrada[])
	{
		// declaração de variáveis
		int NumInt;
		double NumReal, soma;
		char Caracter;
		
		// entrada de dados
		NumInt = Integer.parseInt(entrada[0]);
		NumReal = Double.parseDouble(entrada[1]);
		Caracter = (entrada[2].charAt(0));
		
		//processamento
		soma = (double)NumInt + NumReal;
		// saída de resultados
		System.out.println((double)NumInt + " + " +	NumReal + " = " + soma + " sinal " + Caracter);
		
		System.exit(0);
		
		// rodar no terminal: java exemplo01.java 3 2 a
		// 3.0 + 2.0 = 5.0 sinal a
	}
}
