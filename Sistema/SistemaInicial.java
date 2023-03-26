package Sistema;

import java.util.Scanner;
import Servicos.Abastecimento;
import Servicos.Lavagem;

public class SistemaInicial {
	
	public static void main(String[] args) {
		
				
		int OpcaoServicos = 0;
		
				 
		System.out.println("Bem vindo ao Posto |Java Adtivado|");
		System.out.println("Qual dos serviços deseja:");
		Scanner entrada = new Scanner(System.in);
		
	do {
    
	   System.out.printf("|1-ABASTECER | 2-LAVAGEM| 3-SAIR");
       
       
	   OpcaoServicos = entrada.nextInt();
	   
	   switch (OpcaoServicos) {
	     
	     case 1: 
	    	
	    	Abastecimento abastecer = new Abastecimento();
	    	abastecer.MenuAbastecer();
	    	OpcaoServicos = 3;
	    	break;
	    	 
	     case 2:
	    
	       Lavagem lavagem = new Lavagem();
		   lavagem.MenuLavagem();
		   OpcaoServicos = 3;
	        break;
	    
	     case 3:
	    	
	    	System.out.printf("Obrigado pela preferencia, ate a proxima.");
	    	break;
	    	
	        
	     default:
	    	 
	        System.out.println("Opção Invalida!!");
	        break;
	        
		   
	    }
	
	   
	} while (OpcaoServicos != 3);
	
	  entrada.close();		

	   
	}
	
	
}
