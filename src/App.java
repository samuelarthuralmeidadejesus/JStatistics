import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch e Loops");
        //O switch é uma estrutura de seleção múltipla
        //um if mais organizado
        //Escolha
         //Caso
         //Para resolver listas ou constantes.
           //Menu
            //opcao1
            //opcao2
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n 1-Estastíca Descritiva \n 2-Probabilidade \n 3-Modelos probabilisticos \n 4-Sair"));
        
        if(op!= 4){
            
        }else{
            JOptionPane.showMessageDialog(null, "Encerrando Sistema...");
            if(op == 4)
            System.exit(0);

        }
        switch(op){
            case 1:JOptionPane.showMessageDialog(null, "Estatistica Descritiva");break;
            case 2:JOptionPane.showMessageDialog(null, "Probabilidade");break;
            case 3:JOptionPane.showMessageDialog(null, "Modelos Probabilisticos");break;

            default:
            JOptionPane.showMessageDialog(null, "Opção Invalida!");

            
    
        }

        int contador = 1;
        while(contador<3){
            JOptionPane.showMessageDialog(null, "Viva o SENAI!!");
            contador = contador+1;
        }
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        for(int cont=1;cont<=10;cont++){
            System.out.println(cont);

        }
    {
    } 
    String sair;
     do{
        //System.out.println("sair:s ou n");
        sair = JOptionPane.showInputDialog("Sair:Sim ou Não");

    }while(!sair.equalsIgnoreCase("Sim"));


    }
}
