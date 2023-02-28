public class Assento{
  private int codigo;
  private Boolean ocupado;
  private Sala sala;

  public int getCodigo()
  {
    return codigo;
  }
  public void setCodigo(int c)
  {
    codigo = c;
  }


  public boolean getOcupado()
  {
    return ocupado;
  }
  public void setOcupado(boolean o)
  {
    ocupado = o;
  }


  public Sala getSala()
  {
    return sala;
  }
  public void setSala(Sala s)
  {
    sala = s;
  }
}