import javax.swing.JOptionPane;

public class Duvida3 {
    public static void main(String args){
        double areaJardim1 =200;
        double areaJardim2 = 300;
        double areaJardim3 = 500;

        double[] areasJardins = {200, 300, 500};
        System.out.println(areasJardins[0]);
        System.out.println(areasJardins[1]);
        System.out.println(areasJardins[2]);
        

        double media =(areaJardim1+areaJardim2+areaJardim3)/3;
        JOptionPane.showMessageDialog(null,media);

        //20 jardins
    }

}
