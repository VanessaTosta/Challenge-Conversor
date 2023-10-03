package conversorMoedas;

import javax.swing.JOptionPane;



public class Funcao extends ConverteMoedas {

    ConverteMoedas moedas = new ConverteMoedas();
    ConverteMoedasParaReais reais = new ConverteMoedasParaReais();

    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Converter de: ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Reais a Dólares", "Reais a Euros", "Reais a Libras", "Reais a Peso Argentino", "Reais a Peso Chileno", "Dólares a Reais", "Euros a Reais", "Libras a Reais", "Peso Argentino a Reais", "Peso Chileno a Reais"}, "Escolha")).toString();
  
        switch (opcao) {
            case "Reais a Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;
            case "Reais a Euros":
                moedas.converterReaisParaEuros(valorRecebido);
                break;
            case "Reais a Libras":
                moedas.converterReaisParaLibras(valorRecebido);
                break;
            case "Reais a Peso Argentino":
                moedas.converterReaisParaPesosArgentinos(valorRecebido);
                break;
            case "Reais a Peso Chileno":
                moedas.converterReaisParaPesosChilenos(valorRecebido);
                break;
            case "Dólares a Reais":
                reais.converterDolaresParaReais(valorRecebido);
                break;
            case "Euros a Reais":
                reais.converterEurosParaReais(valorRecebido);
                break;
            case "Libras a Reais":
                reais.converterLibrasParaReais(valorRecebido);
                break;
            case "Peso Argentino a Reais":
                reais.converterPesosArgentinosParaReais(valorRecebido);
                break;
            case "Peso Chileno a Reais":
                reais.converterPesosChilenosParaReais(valorRecebido);
                break;
                
           
        }
        
    }
}