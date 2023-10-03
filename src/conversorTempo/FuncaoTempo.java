package conversorTempo;

import javax.swing.*;

public class FuncaoTempo {
    ConverteTempo tempo = new ConverteTempo();

    public void converterTemperatura(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter", "Tempo", JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                "Ano em Mês",
                "Ano em Horas",
                "Ano em Minutos",
                "Mês em Horas",
                "Mês em Minutos",
                "Horas em Minutos"}, "Escolha")).toString();
        
        switch (opcao) {
            case "Ano em Mês":
                tempo.converterAnosEmMeses(valorRecebido);
                break;
            case "Ano em Horas":
                tempo.converterAnosEmHoras(valorRecebido);
                break;
            case "Ano em Minutos":
                tempo.converterAnosEmMinutos(valorRecebido);
                break;
            case "Mês em Horas":
                tempo.converterMesesEmHoras(valorRecebido);
                break;
            case "Mês em Minutos":
                tempo.converterMesesEmMinutos(valorRecebido);
                break;
            case "Horas em Minutos":
                tempo.converterHorasEmMinutos(valorRecebido);
                break;
       }
   }
}
