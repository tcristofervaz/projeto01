package modelo.entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	
	private Integer numeroquarto;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva() {
		
	}

	public Reserva(Integer numeroquarto, Date checkin, Date checkout) {
		this.numeroquarto = numeroquarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumeroquarto() {
		return numeroquarto;
	}

	public void setNumeroquarto(Integer numeroquarto) {
		this.numeroquarto = numeroquarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	
	public Date getCheckout() {
		return checkout;
	}

    public long duracao() {
    	long diff = checkout.getTime() - checkin.getTime();
       return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);    	
    }
    
    public void updateDatas (Date checkin, Date checkout) {
    	this.checkin = checkin;
    	this.checkout = checkout;
    }
	
    @Override
    
    public String toString() {
    	return "Quarto " + numeroquarto +", check-in: "+sdf.format(checkin)+", check-out: "+sdf.format(checkout)+", "+duracao()+" noites";
    			
    }
    
   
	
	
}
