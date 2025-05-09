import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null,"Alô, Jardim!");

            JOptionPane.showMessageDialog(null,"Por Favor Insira Os Seguintes Dados");

            String nome = JOptionPane.showInputDialog(null,"Nome");
            String endereco = JOptionPane.showInputDialog(null,"Endereço");

            String arquivo = "dados.txt";

            
            FileWriter fileWriter = new FileWriter(arquivo, true);

            fileWriter.write("Nome: " + nome + "\n");
            fileWriter.write("Endereço: " + endereco + "\n");

            fileWriter.close();

            JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");

        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, "Erro ao gravar no arquivo.");
            e.printStackTrace();
        }

        try {
            JOptionPane.showMessageDialog(null,"Seja Bem-Vindo Ao Calculador de Aréa do Jardim!");

            String larguraJardim = JOptionPane.showInputDialog(null,"Largura do Jardim:");
            String comprimentoJardim = JOptionPane.showInputDialog(null,"Comprimento do Jardim:");

            double largura = Double.parseDouble(larguraJardim);
            double comprimento = Double.parseDouble(comprimentoJardim);

            double area = largura * comprimento;

            JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " metros quadrados.");
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Por favor, insira apenas números válidos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }
}