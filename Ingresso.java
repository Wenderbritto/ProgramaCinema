public class Ingresso{
  private boolean meiaEntrada;
  private Sessao sessao;
  private Assento assento;

  public boolean getMeiaEntrada()
  {
    return meiaEntrada;
  }
  public void setMeiaEntrada(boolean m)
  {
    meiaEntrada = m;
  }


  public Sessao getSessao()
  {
    return sessao;
  }
  public void setSessao(Sessao s)
  {
    sessao = s;
  }


  public Assento getAssento()
  {
    return assento;
  }
  public void setAssento(Assento a)
  {
    assento = a;
  }
}