import java.util.Scanner;

public class ExercPessoal {

	public static void main(String[] args) {
		/* Montar um formulario de landing page para seguros de eventos com os seguintes campos:
		 * Pessoa Física ou Juridica (CNPJ ou CPF);
		 * Nome para contato;
		 * Whatsapp
		 * E-mail
		 * Nome do Evento
		 * Data Aproximada do Evento
		 * Melhor horario para contata-lo (Manhã, tarde ou noite);
		 * Forma de contato; ligação ou whatsapp
		 */
	Scanner leitorNumeros = new Scanner (System.in);
	Scanner leitorTexto = new Scanner (System.in);
	String tipoCliente, nomeContato, whats, email, nomeEvento, data, periodo, formaContato;
	
	
	System.out.println("Pessoa Fisica ou Juridica: ");
	tipoCliente = leitorTexto.next(); //sempre dps da pergunta ou solicitação devo declarar o nome da variavel (tipo, nome)
	
	System.out.println("Nome para contato: " );
	nomeContato = leitorTexto.next();
	
	System.out.println("Whatsapp: ");
	whats = leitorTexto.next();
	
	System.out.println("E-mail: ");
	email = leitorTexto.next();
	
	System.out.println("Nome do Evento: ");
	nomeEvento = leitorTexto.next();

	System.out.println("Data Aproximada do Evento: ");
	data = leitorTexto.next();
	
	System.out.println("Melhor periodo para contata-lo: manha,tarde ou noite: ");
	periodo = leitorTexto.next();
	
	System.out.println("Qual a melhor forma para contata-lo: Whats ou ligacao: ");
	formaContato = leitorTexto.next();
	
	
	System.out.println("Tipo Cliente: " + tipoCliente);
	System.out.println("Nome para Contato: " + nomeContato);
	System.out.println("Whatsapp: " + whats);
	System.out.println("E-mail: " + email);
	System.out.println("Nome do Evento: " + nomeEvento);
	System.out.println("Data do Evento: " + data);
	System.out.println("Melhor período para contata-lo: " + periodo);
	System.out.println("Melhor forma para contata-lo: " + formaContato);
	
	
	
	
			
	
		
	}

}
