import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
	/*o salario dos func é calc de acordo com a carga horaria trabalhada mês
	 * por isso você deverá perguntar qual a qtde de horas trabalhadas e mult pelo vlr hora
	 */
	
	Scanner leitorNumeros = new Scanner (System.in);
	Scanner leitorTexto = new Scanner (System.in);
	
	System.out.println("Petshop FIAP\n\nDigite a qtde de horas trabalhada: ");
	int qtde = leitorNumeros.nextInt();
	double valorHora = 18; // declarei ela aqui embaixo e já usei, mas poderia ter declarado acima
	double salario = valorHora * qtde;
	//System.out.println("Salario Bruto: " + salario);
	/*O func pode realizar horas extras no mês, para calcular o vlr da hora extra você deverá
	 * solicitar a qtde de hras extras no mês e acrescentar 50% sobre o vlr hora, por ex:
	 * Imagine que o func tenha realizado 10 hrs extr no mês, sabendo que o salario por hora
	 * é de 10,00, o func receberá:
	 * adicional : 10* 0,5 (50%) = 5
	 * valor da hora extra : 10 + 5 = 15,00
	 * Calculo das horas extras: 10 * 5 = 150,00
	 */
	
	double qtdHext, vlrHext;
	System.out.println("Digite a quantide horas extras trabalhadas no mês, exceto domingos e feriados: ");
	qtdHext = leitorNumeros.nextDouble();
	vlrHext = (valorHora * 0.5) * qtdHext;
	//System.out.println("O valor tota de horas extras trabalhadas no mes foi de: " + vlrHext);
	//int x = Integer.parseInt("salario"); não deu certo o resultado
	//int y = Integer.parseInt("vlrHext"); nao deu certo o resultado
	//System.out.println("A soma do salario + suas horas extras foi de: " + (salario + vlrHext));
	//Obs.: acima, colocando o salario +vlrHext entre parenteses
	//poderia também ao inves de colocar em parenteses converter o que essas váriaveis em 
	//valor (texto em vlr). Como: declarando acima => int x = Integer.parseIn ("salario");
	// int y = Integer.parseIn ("vlrHext);
	/*ou poderia declarar variavel salarioFinal
	 * 
	 */
	double vlrHextDomingo = 0; // aqui eu coloquei zero caso para ter um numero valido em caso de soma
	
	//System.out.println("A soma do salario + suas horas extras foi de: " + (salario + vlrHext));
	//System.out.println("A soma do salario + suas horas extras foi de: " + salarioFinal);
	//System.out.println("A soma do salario + suas horas extras foi de: " + salario + vlrHext);
	//nã deu certo a conversao acima
	// agora perguntar se houve hora extra no domingo ou feriado
	System.out.println("Realizou horas extras de domingo ou feriado? ");
	String resposta = leitorTexto.nextLine();
	if (resposta.equals("Sim")) {
	System.out.println("Digite a quantidade de horas trabalhadas no domingo: ");
	qtdHext = leitorNumeros.nextDouble();
	vlrHextDomingo = valorHora * 2 * qtdHext;
	}
	double salarioFinal = salario + vlrHext + vlrHextDomingo;
	// a ultima variavel pode dar erro, se por exemplo, a resposta for não,
	// para resolver isso, essa variavel tem que ter um numero a se somar (no caso ZERO)
	// porque se a resp for não, somase o ZERO junto aos demais numeros
	
	/*Condicao de desconto INSS
	 * Até 1302,00 | 7,5%
	 * De 1.302,01 até 2.571,29 | 9%
	 * De 2.501,30 até 3.856,94 | 12%
	 * De 3.856,95 até 7.507,49| 14%
	 * Acima disso 877,24
	 */
	double descontoINSS = 0;
	if (salarioFinal <= 1302.00) {
		// 7,5%
		descontoINSS = salarioFinal * 0.075;
		}
		else if (salarioFinal >1302 && salarioFinal<=2571.29) {
		// 9%	
		descontoINSS = salarioFinal * 0.09;
		}
		else if (salarioFinal>2579.29 && salarioFinal<=3856.94) {
		// 12%
		descontoINSS = salarioFinal * 0.12;
		}
			else if (salarioFinal>3856.94 && salarioFinal<=7507.49) {
		// 14%
		descontoINSS = salarioFinal * 0.14;
		}
			else {
			//877.24
		descontoINSS = 877.24;
				
			}
		double salarioFinalInss = salarioFinal - descontoINSS;
		
		//mesma coisa que salarioFinal = salarioFinal - descontoINSS
		//System.out.println("Salario Bruto: " + salario + "\nHoras Extras: " + vlrHext + 
		//"\nHoras extras 100%: " + vlrHextDomingo + "\nSalario Final: " + salarioFinal
		//"\nDesconto INSS: " + salarioFinalInss);
			
		System.out.println("Salario Bruto: " + salario + "\nHoras Extras: " + vlrHext + 
				"\nHoras extras 100%: " + vlrHextDomingo + "\nSalario Final: "
				+ salarioFinal + "\nInss: " + descontoINSS + 
				"\nSalarioFinalDesconto: " + salarioFinalInss);
					
}}

	