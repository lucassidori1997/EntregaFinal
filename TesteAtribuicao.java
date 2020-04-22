import javax.swing.JOptionPane;

public class TesteAtribuicao
{
   public static void main (String [] args)
   {
      String nome = "Nubia";
      int idade = 24;
      String nomeD = "POO";
      boolean pratica = true;
      //boolean pratica = sPratica.equals("sim") ? true : false;

      Professor professor = new Professor(nome, idade);
      
      Disciplina disciplina = new Disciplina(nomeD, pratica);
      
      Atribuicao atribuicao = new Atribuicao(professor, disciplina);

      JOptionPane.showMessageDialog(null, atribuicao.getDados());
   }

}