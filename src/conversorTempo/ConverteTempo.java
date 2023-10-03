package conversorTempo;

import javax.swing.JOptionPane;


public class ConverteTempo {

	    public double converterAnosEmMeses(double valorRecebido) {
	        double anosEmMeses = valorRecebido * 11;
	        anosEmMeses = (double) Math.round(anosEmMeses);
	        JOptionPane.showMessageDialog(null, valorRecebido + anosEmMeses + " Meses ");
	        return anosEmMeses;
	    }

	    public double converterAnosEmHoras(double valorRecebido) {
	        double anosEmHoras = valorRecebido * 8775;
	        anosEmHoras = (double) Math.round(anosEmHoras);
	        JOptionPane.showMessageDialog(null, valorRecebido + anosEmHoras + " Horas");
	        return anosEmHoras;
	    }

	    public double converterAnosEmMinutos(double valorRecebido) {
	        double anosEmMinutos = valorRecebido  * 525959;
	        anosEmMinutos = (double) Math.round(anosEmMinutos);
	        JOptionPane.showMessageDialog(null, valorRecebido + anosEmMinutos + " Minutos");
	        return anosEmMinutos;
	    }

	    public double converterMesesEmHoras(double valorRecebido) {
	        double mesesEmHoras = valorRecebido * 729;
	        mesesEmHoras = (double) Math.round(mesesEmHoras);
	        JOptionPane.showMessageDialog(null, valorRecebido + mesesEmHoras + " Horas");
	        return mesesEmHoras;
	    }
	    
	    public double converterMesesEmMinutos(double valorRecebido) {
	        double mesesEmMinutos = valorRecebido * 43829;
	        mesesEmMinutos = (double) Math.round(mesesEmMinutos);
	        JOptionPane.showMessageDialog(null, valorRecebido + mesesEmMinutos + " Minutos");
	        return mesesEmMinutos;
	    }
	    
	    public double converterHorasEmMinutos(double valorRecebido) {
	        double horasEmMinutos = valorRecebido * 59;
	        horasEmMinutos = (double) Math.round(horasEmMinutos);
	        JOptionPane.showMessageDialog(null, valorRecebido + horasEmMinutos + " Minutos");
	        return horasEmMinutos;
	    }
	    
	    
	   

	}

