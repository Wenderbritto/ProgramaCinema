public class Assento{
  private String codigo;
  private Boolean ocupado;
  private Sala sala;

  public String getCodigo()
  {
    return codigo;
  }
  public void setCodigo(String c)
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