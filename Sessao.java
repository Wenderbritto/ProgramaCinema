public class Sessao{
  private String data;
  private String hora;
  private float valor;
  private boolean encerrada;
  private Sala sala;
  private Filme filme;

  public String getData()
  {
    return data;
  }
  public void setData(String d)
  {
    data = d;
  }


  public String getHora()
  {
    return hora;
  }
  public void setHora(String h)
  {
    hora = h;
  }


  public float getValor()
  {
    return valor;
  }
  public void setValor(float v)
  {
    valor = v;
  }


  public boolean getEncerrada()
  {
    return encerrada;
  }
  public void setEncerrada(boolean e)
  {
    encerrada = e;
  }


  public Sala getSala()
  {
    return sala;
  }
  public void setSala(Sala s)
  {
    sala = s;
  }


  public Filme getFilme()
  {
    return filme;
  }
  public void setFilme(Filme f)
  {
    filme = f;
  }








  
}