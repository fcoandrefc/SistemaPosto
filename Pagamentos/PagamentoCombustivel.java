package Pagamentos;

import java.util.Scanner;

public class PagamentoCombustivel {
	
	public void PagamentoFinal(int OpcaoAbastecer, double ValorCombustivel){
		
		int OpcaoPagamento = 0;
		double ValorPagamento;
		double ValorNota;
		double TotalLitros = 0;
		
		Scanner entradaPagamento = new Scanner(System.in);
		
		
		do {
		 
			System.out.println("Digita quanto deseja abastecer :");
			ValorPagamento = entradaPagamento.nextDouble();
			
			if (ValorPagamento<=0) {
				
				System.out.println("Valor Invalido:");
				
			}else {
				
			 TotalLitros = ValorPagamento / ValorCombustivel;
				
			}
			
		}while(ValorPagamento <=0);
		
		
		do {

			System.out.println("Como deseja Pagar | 1 - Dinheiro | 2-Cartao");
			OpcaoPagamento = entradaPagamento.nextInt();
			
		  switch (OpcaoPagamento) {

			case 1:
				
				do {
					 
					System.out.println("Digita Valor Pagamento :");
					ValorNota = entradaPagamento.nextDouble();
					
					if (ValorPagamento>ValorNota) {
						
						System.out.println("Valor pagamento inferior ao valor do abastecimento!!!:");
						
					}else {
						
					 TotalLitros = ValorPagamento / ValorCombustivel;
						
					}
					
				}while(ValorPagamento >ValorNota);

				System.out.println("Pagamento Processador");
				System.out.printf( "| Valor Dinheiro: %2.2f | Valor Abastecido:  %2.2f | Valor Combustivel: %2.2f | Total Litros: %2.2f"
				+ " |Troco:  %2.2f",ValorNota,ValorPagamento,ValorCombustivel,TotalLitros, (ValorNota - ValorPagamento));
				
			
				OpcaoPagamento = 3;

				   		
			   
                 
			 break;

			case 2:
				
				System.out.println("Pagamento Processador");
				System.out.printf("Valor Abastecido: %2.2f | Valor Combustivel : %2.2f | Total Litros: %2.2f", ValorPagamento,ValorCombustivel,TotalLitros);
				
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
