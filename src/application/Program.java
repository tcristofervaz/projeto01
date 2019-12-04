package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entidade.Reserva;
import modelo.excecao.DominioExcecao;

public class Program {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Digite o número do Quarto: ");
			int numquarto = sc.nextInt();
			System.out.print("Digite a data de entrada (dd/mm/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Digite a data de saída (dd/mm/yyyy): ");
			Date checkout = sdf.parse(sc.next());
			
	         Reserva reserva = new Reserva(numquarto, checkin, checkout);
	         System.out.println("Reserva: "+reserva);
	         
	         System.out.println();
	         System.out.println("Digite uma nova data: ");
	         System.out.print("Digite a data de entrada (dd/mm/yyyy): ");
	 		 checkin = sdf.parse(sc.next());
	 		 System.out.print("Digite a data de saída (dd/mm/yyyy): ");
	 		 checkout = sdf.parse(sc.next());
	 		  
	 		 reserva.updateDatas(checkin, checkout);
	 		 System.out.println("Reserva: "+reserva);
		}
 		catch (ParseException e) {
 			System.out.println("Data Formato Inválido!");
 		}
		catch (DominioExcecao e) {
			System.out.println("Erro na reserva: "+e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro desconhecido!");
		}
		sc.close();
        
	}

}
