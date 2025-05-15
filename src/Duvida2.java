import javax.swing.JOptionPane;

public class Duvida2 {

    public static void main(String args[]){
        final int FIDELIDADE = 10;
        final double DESCONTO = 0.10;

        int contador = 0;
        double acumulador = 0;
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Iniciando:1-Poda (150R$) 2-Cortar Grama (250R$) 3-Sair"));
            if(opcao == 1){
                acumulador=acumulador+150;
                contador = contador +1;
            }else if(opcao ==2){
                acumulador=acumulador+250;
                contador = contador +1;
            }

        }while(opcao != 3);
        JOptionPane.showMessageDialog(null,"total da compra:"+acumulador);
        if(contador >= FIDELIDADE){
            double valorComDesconto = acumulador - (acumulador*DESCONTO);
            JOptionPane.showMessageDialog(null,"Valor com Desconto:"+valorComDesconto);
        }
        double media = acumulador/contador;
    }

}
