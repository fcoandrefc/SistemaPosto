package Pagamentos;

import java.util.Scanner;

public class PagamentoLavagem {
	
	
public void PagamentoFinal(int OpcaoAbastecer, double ValorCombustivel){
		
		int OpcaoPagamento = 0;
		double ValorPagamento = 0;
		double ValorNota = 0;
	
		Scanner entradaPagamento = new Scanner(System.in);
		
			
		System.out.printf(" Valor da sua Lavagem é : %2.2f", ValorCombustivel);
		System.out.println(" ");
		
		
		do {

			System.out.println("Como deseja Pagar | 1 - Dinheiro | 2-Cartao |");
			OpcaoPagamento = entradaPagamento.nextInt();
			
		  switch (OpcaoPagamento) {

			case 1:
				
				do {
					 
					System.out.println("Digita Valor Nota :");
					ValorNota = entradaPagamento.nextDouble();
					
					if (ValorPagamento>ValorCombustivel) {
						
						System.out.println("Valor pagamento inferior ao valor da lavagem!!!");
						
					}
					
					
				}while(ValorPagamento >ValorCombustivel);

				System.out.println("Pagamento Processador");
				System.out.printf("| Valor Dinheiro: %2.2f | Valor Lavagem : %2.2f | Troco: %2.2f " , ValorNota, ValorCombustivel,
				(ValorNota - ValorCombustivel));
				
      			OpcaoPagamento = 3;
	
			   
                 
			 break;

			case 2:
				
				System.out.println("Pagamento Processador, Obrigado Pela preferencia!");
				System.out.printf(" Valor Lavagem: %2.2f", ValorCombustivel);
				OpcaoPagamento = 3;

				break;

			case 3:

				break;
			default:
				
				System.out.println("Opção Invalida!!");

			}

		} while (OpcaoPagamento >= 1 && OpcaoPagamento <= 2);
		
		entradaPagamento.close();

	}

}
