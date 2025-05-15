import javax.swing.JOptionPane;


//testando as variaveis
public class Duvida1 {
    public static void main(String[] args) throws Exception {
        String msg = "Alo jardim";
        byte numFerramenta = 127;
        short agendamentoMes = 32767;
        int idAgendamento = 2147483647;
        long dataAgendamento = System.currentTimeMillis();
        float precoServico = 99.90f;
        double areaJardim = 120.75;
        char tipoServico = 'P';
        boolean concluido = true;
        String cliente = "Samuel";




        JOptionPane.showMessageDialog(null, msg);
        JOptionPane.showMessageDialog(null, "ID: "+idAgendamento);
        JOptionPane.showMessageDialog(null, "numero de ferramentas: "+numFerramenta);
        JOptionPane.showMessageDialog(null, "numero de agendamentos no mes: "+agendamentoMes);
        JOptionPane.showMessageDialog(null, "data atual em milisegundos: "+dataAgendamento);
        JOptionPane.showMessageDialog(null, "preco do serviço: "+precoServico);
        JOptionPane.showMessageDialog(null, "area do jardim: "+areaJardim);
        JOptionPane.showMessageDialog(null, "Tipo de serviço: "+ (tipoServico== 'P'? "Poda" : "Corte de Grama")); //se for "P", ele executa o "Poda". Se colocar outra letra qualquer, ele executa "Corte de Grama"
        if(concluido){
            JOptionPane.showMessageDialog(null, "Faz o pix agora: "+cliente+" Você sabia que seu nome tem: "+cliente.length()+" letras");
        }else{
            JOptionPane.showMessageDialog(null, "Serviço em andamento, aguarde por favor..");
        }


    }
}