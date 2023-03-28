package Servicos;

import Pagamentos.PagamentoLavagem;
import ValorServicos.Valores;
import java.util.Scanner;

public class Lavagem {
	
	public void MenuLavagem() {
		
Valores valor = new Valores();
	    
	    int OpcaoLavagem = 0;
	    double ValorLavagemTotal = 0.00;
	    
	    PagamentoLavagem tipo = new PagamentoLavagem();
	    
		System.out.println("Especifique o Tamanho Carro:");
		Scanner EntradaLavagem = new Scanner(System.in);
		
		do {
		    
			System.out.printf("|1-PEQUENO - %2.2f | 2-MEDIO - %2.2f| 3- GRANDE - %2.2f ",valor.ValorCarroPequeno(),valor.ValorCarroMedio(),valor.ValorCarroGrande());
			OpcaoLavagem = EntradaLavagem.nextInt();
			 
			   
			   switch (OpcaoLavagem) {
			     
			     case 1: 
			    	 
			    	 
			    	 // tipo.PagamentoFinal(OpcaoLavagem , valor.ValorCarroPequeno() );			    	 
			    	 ValorLavagemTotal = valor.ValorCarroPequeno();
			    	 OpcaoLavagem = 6;
			    	 break;
			    	 
			     case 2:
			    	 
			    	 //tipo.PagamentoFinal(OpcaoLavagem , valor.ValorCarroMedio() );			    	 
			    	 ValorLavagemTotal = valor.ValorCarroMedio();
			    	 OpcaoLavagem = 6;
			         break;
			     
			     case 3:
			    	
			    	//tipo.PagamentoFinal(OpcaoLavagem , valor.ValorCarroGrande() );			    	 
			    	 ValorLavagemTotal = valor.ValorCarroGrande();
                  	 OpcaoLavagem = 6;
			    	break; 
			     
			     default:
				 
			        System.out.println("Opção Invalida!!");
			        
				   
			    }
			
			   
			} while (OpcaoLavagem >=1 && OpcaoLavagem <=3);
			
		 
do {
		    
			System.out.printf("Informe Tipo Lavage| 1- SIMPLES - %2.2f | 2-COMPLETA - %2.2f", valor.ValorLavSimples(),valor.ValorLavCompleta());
			OpcaoLavagem = EntradaLavagem.nextInt();
			 
			   
			   switch (OpcaoLavagem) {
			     
			     case 1: 
			    	
    	    	    ValorLavagemTotal = ValorLavagemTotal +  valor.ValorLavSimples();
			    	tipo.PagamentoFinal(OpcaoLavagem , ValorLavagemTotal );			    	 
			    	OpcaoLavagem = 6;
			    	break;
			    	 
			     case 2:
			    	 
			    	ValorLavagemTotal = ValorLavagemTotal +  valor.ValorLavCompleta();
				   	tipo.PagamentoFinal(OpcaoLavagem , ValorLavagemTotal );			    	 
				   	OpcaoLavagem = 6;
				   	break;
			      
			     default:
				 
			        System.out.println("Opção Invalida!!");
			        
			        
				   
			    }
			
			   
			} while (OpcaoLavagem >=1 && OpcaoLavagem <=2);
			
		
		
		
		 EntradaLavagem.close();
	}
	

}
