package Servicos;

import java.util.Scanner;
import Pagamentos.PagamentoCombustivel;
import ValorServicos.Valores;


public class Abastecimento {
	
  public void MenuAbastecer() {
	  
	    Valores valor = new Valores();
	    
	    int OpcaoAbastecer = 0;
	    
	    PagamentoCombustivel tipo = new PagamentoCombustivel();
	    
		System.out.println("Qual Combustive deseja:");
		Scanner entradaAbastecer = new Scanner(System.in);
		
		do {
		    
			System.out.printf("|1-GASOLINA| 2-ALCOOL| 3-DIESEL ");
			OpcaoAbastecer = entradaAbastecer.nextInt();
			 
			   
			   switch (OpcaoAbastecer) {
			     
			     case 1: 
			    	 
			    	 
			    	 tipo.PagamentoFinal(OpcaoAbastecer , valor.ValorGasolina() );			    	 
			    	 OpcaoAbastecer = 6;
			    	 break;
			    	 
			     case 2:
			    	 
			    	 tipo.PagamentoFinal(OpcaoAbastecer , valor.ValorAlcool() );			    	 
			    	 OpcaoAbastecer = 6;
			         break;
			     
			     case 3:
			    	
			    	tipo.PagamentoFinal(OpcaoAbastecer , valor.ValorDiesel() );			    	 
			    	OpcaoAbastecer = 6;
			    	break; 
			     
			     default:
				 
			        System.out.println("Opção Invalida!!");
			        
				   
			    }
			
			   
			} while (OpcaoAbastecer >=1 && OpcaoAbastecer <=3);
			
		 
		 entradaAbastecer.close();
		     
	
}

}
