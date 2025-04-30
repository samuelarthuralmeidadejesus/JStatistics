import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //if
        //if else
        //switch
        //ternário ? :
        int op= Integer.parseInt(JOptionPane.showInputDialog("Qual o resultado de uma população? \n 1-Parâmetro \n 2-Estatística"));
        if(op == 1){
            JOptionPane.showMessageDialog(null,"Certa Resposta","Jstatistics",JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            JOptionPane.showMessageDialog(null,"Resposta Errada!","Jstatistics",JOptionPane.ERROR_MESSAGE);
        
        
        }
        //if else
        //Exercicios(para cada pergunta crie um if)
        /*Considerando Os Números 30,50,80,90 Digite o valor da média aritmética simples? */
        //Gabarito:: 62,5
        /*Considerando os valores 10,40,50,80,10 digite qual é a moda?  */
        // 10
        /*Qual a medida de tendência central que mostra o centro da amostra? */
        // mediana

        Double numero = Double.parseDouble(JOptionPane.showInputDialog("Considerando Os Números 30,50,80,90 Digite o valor da média aritmética simples?")); 
        if(numero == 62.5 ){
        JOptionPane.showMessageDialog(null, "Acertou!","Jstatistics",JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            JOptionPane.showMessageDialog(null,"Errou!","Jstatistics",JOptionPane.ERROR_MESSAGE);
    }

    int valor= Integer.parseInt(JOptionPane.showInputDialog("Considerando os valores 10,40,50,80,10 digite qual é a moda?"));
    if(valor == 10){
        JOptionPane.showMessageDialog(null, "Acertou!", "Jstatistics",JOptionPane.INFORMATION_MESSAGE);

    }else{
        JOptionPane.showMessageDialog(null, "Errou!","Jstatistics",JOptionPane.ERROR_MESSAGE);
    }

    String nome = JOptionPane.showInputDialog("Qual a medida de tendência central que mostra o centro da amostra?");
    if(nome.equalsIgnoreCase("mediana")){
        JOptionPane.showMessageDialog(null, "Acertou!!!", "Jstatistics",JOptionPane.INFORMATION_MESSAGE);

    }else{
        JOptionPane.showMessageDialog(null, "Errou!!!", "Jstatistics",JOptionPane.ERROR_MESSAGE);
    }


    }
}
