import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Classe é um conjuto de objetos
        //Nosso Objetivo nesse codigo é entender a diferença
        //entre método com tipo void e método com tipo S
        Mamifero m1 = new Mamifero();
        m1.setNomeCientifico("Bos Taurus");
        JOptionPane.showMessageDialog(null,"Nome Cientifico:"+m1.getNomeCientifico());
        //exercicio
        /*
         * Considerando a utilização de métodos set e get
         * Considerando a aula de hoje
         * anatomia de função e procedimento
         * diferença entre função e procedimento
         * set - void (procedimento)
         * get - String (Função)
         * Java = Métodos
         * void
         * String, int, boolean
         * 
         * Desafio
         * Crie mais dois objetos
         * Para Armezenar e mostrar os dados do
         * Canguru
         * Peixe Boi
         */

        m1.setNomeCientifico("Macropus");
        JOptionPane.showMessageDialog(null,"Nome Cientifico:"+m1.getNomeCientifico());

        m1.setNomeCientifico("Trichechus");
        JOptionPane.showMessageDialog(null,"Nome Cientifico:"+m1.getNomeCientifico());
    }
}
