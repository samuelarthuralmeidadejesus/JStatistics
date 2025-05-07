import javax.swing.*;
import java.util.Random;

public class LancaDados {

    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao Jogo");

        
        String resposta = JOptionPane.showInputDialog(null, 
            "Um Monstro aparece\n em sua frente.\n \nVocê deseja atacar ele? \n(Sim/Não)");

        if (resposta != null && resposta.equalsIgnoreCase("Sim")) {
            
            int respostaLancarDado = JOptionPane.showConfirmDialog(null, "Clique em OK para lançar o dado!", "Lançar Dado", JOptionPane.OK_CANCEL_OPTION);

            if (respostaLancarDado == JOptionPane.OK_OPTION) {
                
                Random random = new Random();
                int resultado = random.nextInt(20) + 1;

                JOptionPane.showMessageDialog(null, "O dado rolou e deu: " + resultado);
            } else {
                JOptionPane.showMessageDialog(null, "Você cancelou o lançamento.");
            }
        } else if (resposta != null && resposta.equalsIgnoreCase("Não")) {
            
            JOptionPane.showMessageDialog(null, "Você fugiu do monstro com sucesso.");
        } else {
            
            JOptionPane.showMessageDialog(null, "Por favor, responda com 'Sim' ou 'Não'.");
        }
    }
}
