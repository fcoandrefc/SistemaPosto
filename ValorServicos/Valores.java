package ValorServicos;

public class Valores {
		
	double Gasolina;
	double Alcool;
	double Diesel;
	
	double CarroPequeno;
	double CarroMedio;
	double CarroGrande;
	
	double LavCompleta;
	double LavSimples;
	

	
 public Valores() {
	 
	 Gasolina = 5.65;
	 Alcool = 3.65;
	 Diesel = 4.25;
	 
	 CarroPequeno = 20.00;
	 CarroMedio = 30.00;
	 CarroGrande = 50.00;
	 
	 LavSimples = 15.00;
	 LavCompleta = 25.00;
 
 }
  	

 public double ValorGasolina() {
	 
	 return Gasolina;
 }
 
 public double ValorAlcool() {
	 
	 return Alcool;
 }
 
 public double ValorDiesel() {
	 
	 return Diesel;
 }
 
 
public double ValorCarroPequeno() {
	 
	 return CarroPequeno;
 }

public double ValorCarroMedio() {
	 
	 return CarroMedio;
}

public double ValorCarroGrande() {
	 
	 return CarroGrande;
}

public double ValorLavSimples() {
	 
	 return LavSimples;
}

public double ValorLavCompleta() {
	 
	 return LavCompleta;
}
}
