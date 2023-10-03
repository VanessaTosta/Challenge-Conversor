package principal;


import conversorMoedas.*;
import conversorTempo.FuncaoTempo;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Funcao moedas = new Funcao();
        FuncaoTempo temperatura = new FuncaoTempo();

        while (true) {

        String opcao = JOptionPane.showInputDialog(null, "Conversor de: ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Moeda", "Tempo"}, "Escolha").toString();

         switch (opcao) {
              
         	case "Moeda":
                    String conversor = JOptionPane.showInputDialog("Valor a converter: ");
 
			if (checar(conversor)) {
                        double valorRecebido = Double.parseDouble(conversor);
                        moedas.converterMoeda(valorRecebido);

                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if (JOptionPane.OK_OPTION == resposta) {
                            System.out.println("Escolha opção Afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                            JOptionPane.showMessageDialog(null, "Desenvolvido por Vanessa Tosta");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
                case "Tempo":
                    conversor = JOptionPane.showInputDialog("Insira um tempo");
                    if (checar(conversor)) {
                        double valorRecebido = Double.parseDouble(conversor);
                        temperatura.converterTemperatura(valorRecebido);

                        int resposta = 0;
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if ((resposta == 0) && (checar(conversor))) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                            JOptionPane.showMessageDialog(null, "Desenvolvido por Vanessa Tosta");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }   
    }

    public static boolean checar(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
   
}