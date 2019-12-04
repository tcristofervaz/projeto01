package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entidade.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o número do Quarto: ");
		int numquarto = sc.nextInt();
		
		System.out.print("Digite a data de entrada (dd/mm/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		
		System.out.print("Digite a data de saída (dd/mm/yyyy): ");
		Date checkout = sdf.parse(sc.next());
		
		 if (!checkout.after(checkin)) {
		    	System.out.println("Data inválida");
		    }
		    
		    else {
		         Reserva reserva = new Reserva(numquarto, checkin, checkout);
		         System.out.println("Reserva: "+reserva);
		         
		         System.out.println();
		         System.out.println("Digite uma nova data: ");
		         System.out.print("Digite a data de entrada (dd/mm/yyyy): ");
		 		  checkin = sdf.parse(sc.next());
		 		
		 		 System.out.print("Digite a data de saída (dd/mm/yyyy): ");
		 		  checkout = sdf.parse(sc.next());
		 		  
		 		  
		 		  Date agora = new Date();
		 		  
		 		  if (checkin.before(agora) || checkout.before(agora))
		 		  {
		 			  System.out.println("Erro na data, deve ser digitado datas futuras.");
		 		  }
		 		  else if (!checkout.after(checkin))
		 		  {
		 			 System.out.println("Data inválida");  
		 		  }
		 		  else 
		 		  {
		 					 		  
		 		  
		 		  reserva.updateDatas(checkin, checkout);
		 		  
		 		 System.out.println("Reserva: "+reserva);
		    }
		    }
		 
		 
		
		
		sc.close();

	}

}
