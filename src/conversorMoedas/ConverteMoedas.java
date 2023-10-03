package conversorMoedas;

import javax.swing.*;

public class ConverteMoedas {

	public void converterReaisParaDolares(double valorRecebido){
        double moedaDolar = valorRecebido / 5.06;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "$ " + moedaDolar + " Dólares");
    }

    public void converterReaisParaEuros(double valorRecebido){
        double moedaEuro = valorRecebido / 5.31;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "€" + moedaEuro + " Euros");
    }

    public void converterReaisParaLibras(double valorRecebido){
        double moedaLibra = valorRecebido / 6.12;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "£ " + moedaLibra + " Libras Esterlinas");
    }

    public void converterReaisParaPesosArgentinos(double valorRecebido){
        double moedaPesoArgentino = valorRecebido / 0.014;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "$ " + moedaPesoArgentino + "Pesos Argentinos");
    }

    public void converterReaisParaPesosChilenos(double valorRecebido){
        double moedaPesoChileno = valorRecebido / 0.0056;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "$ " + moedaPesoChileno + " Pesos Chilenos");
    }

}