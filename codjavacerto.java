import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Testec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

    System.out.print("Olá! Preciso que me diga dois números pra que entre eles apareça qual é o maior!\n");
   // System.out.print("Digite o primeiro número: ");
    String oqOUsuarioDigitar = JOptionPane.showInputDialog(Digite o primeiro número: );
    x = Integer.parseInt(oqOUsuarioDigitar);
    //scanf("%d", &x);
    System.out.print("Digite o segundo número: ");
    OptionPane.showInputDialog("%d", &y);
   

 
    if (x > y) {
    System.out.print("O maior número é: " + x);
        }  else {
    System.out.print("O maior número é: " + y);

}

return 0;
        // TODO code application logic here
    }
   
}
