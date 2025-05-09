import javax.swing.JOptionPane;

public class Jardim {
    public static void main(String[] args) {
        try {
            
            JOptionPane.showMessageDialog(null, "Bem-vindo ao Calculador de Área do Jardim!");

            
            String larguraStr = JOptionPane.showInputDialog(null, "Digite a Largura do Jardim (em metros):");
            String comprimentoStr = JOptionPane.showInputDialog(null, "Digite o Comprimento do Jardim (em metros):");

            
            double largura = Double.parseDouble(larguraStr);
            double comprimento = Double.parseDouble(comprimentoStr);

            
            double area = largura * comprimento;

           
            JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " metros quadrados.");

            
            String classificacao = (area > 70) ? "Grande" : "Pequeno";

            
            JOptionPane.showMessageDialog(null, "O jardim é considerado: " + classificacao);

        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas números válidos.");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }

        int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Aqui Estão Nossos Serviços: \n-------------------------------------------------- \n1-Manutenção de Jardins(100R$) \n 2-Criação e Projeto de Jardins(250R$) \n 3-Instalação de Sistemas de Irrigação(70R$)\n" +
                        " 4-Jardinagem Sustentável(300R$) \n 5-Sair \n--------------------------------------------------"));

        if (op == 5) {
            JOptionPane.showMessageDialog(null, "Até Logo :)");
            System.exit(0);
        }

        double valorServico = 0;

        switch (op) {
            case 1:
                valorServico = 100.0;
                JOptionPane.showMessageDialog(null, "Você escolheu Manutenção de Jardins");
                break;
            case 2:
                valorServico = 250.0;
                JOptionPane.showMessageDialog(null, "Você escolheu Criação e Projeto de Jardins");
                break;
            case 3:
                valorServico = 70.0;
                JOptionPane.showMessageDialog(null, "Você escolheu Instalação de Sistemas de Irrigação");
                break;
            case 4:
                valorServico = 300.0;
                JOptionPane.showMessageDialog(null, "Você escolheu Jardinagem Sustentável");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                return; 
        }

        String resposta = JOptionPane.showInputDialog("Deseja Aplicar Seu Desconto De Fidelidade? (15%)");

        if (resposta.equalsIgnoreCase("sim")) {
            valorServico = valorServico * 0.85; 
            JOptionPane.showMessageDialog(null, "Valor com desconto: R$ " + valorServico);
        } else {
            JOptionPane.showMessageDialog(null, "Valor sem desconto: R$ " + valorServico);
        }
    }
}



