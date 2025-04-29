import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //aplicando logica de progamação (Aristoteles e Gorge Boolean)
        //Scanner leia = new Scanner(System.in);
        //Variável : é um espaço reservado na memória do computador
        //Variável : serve para guardar valores
        //Variável : ela tem um tipo (texto,número,lógico...)
        /* 
         * Ex-1: crie um algoritimo para o JStatitics que leia
         * a opção desejada
         * "Qual o conjuto de dados utilizado: 1-populacional 2-amostral"
         * o valor recebido deve ser um valor inteiro.
         * /* */

    
        /*int opçao; //declarei a variavel em java.
        System.out.println("\t #------- \t #------- \t JStatistics \t #-------- \t #------- \t");
        System.out.println("Qual o conjuto de dados utilizado: 1-populacional 2-amostral");
        opçao = leia.nextInt();
        System.out.println(opçao);*/

        int opcao;
        JOptionPane.showMessageDialog(null,"O jogo da Estatística: JStatístics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos Começar o Jogo? \n Escolha a estrategia \n 1-Populacional \n 2-Amostral"));
        JOptionPane.showMessageDialog(null, "Você escolheu:"+opcao,"Jstatistics",JOptionPane.DEFAULT_OPTION);
    
         
         /*Ex-2
         * Você deve criar um menu perguntando para o usuario
         * que tipo de variavel ele deseja cadastrar
         * 1-quantitativa
         * 2-qualitativa
         * 
         * o menu deve ter as quebras de linha conforme o texto acima.
         * tudo deve ser feito em apenas um System.out.println()
         * Mostre a opção escolhida ( o número lido)
         */

         String opcaoVariavel = JOptionPane.showInputDialog(null,
         "Que tipo de váriavel você deseja cadastrar: \n 1-Quantitativa \n 2-Qualitativa");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        JOptionPane.showMessageDialog(null,"Você Escolheu:"+opVariavel);
    
        
        
    }
}
