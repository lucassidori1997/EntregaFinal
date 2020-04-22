public class Disciplina
{
   private String nomeD;
   private boolean pratica;
   
   public Disciplina (String nomeD, boolean pratica)
   {
      this.nomeD = nomeD;
      this.pratica = pratica;
   }
   
   public String getNomeD()
   {
      return nomeD;
   }
   public boolean getPratica()
   {
      return pratica;
   }
   
   public void setNomeD(String nomeD)
   {
      this.nomeD = nomeD;
   }
   public void setPratica(boolean pratica)
   {
      this.pratica = pratica;
   }
   
   public String getDados()
   {
     return "Disciplina [ nome = " + nomeD + ", pratica = " + pratica + "]";  
   }
}