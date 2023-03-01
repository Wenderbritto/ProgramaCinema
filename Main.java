class Main {
  public static void main(String[] args) {

    Ator a1 = new Ator();
    a1.setNome("João");

    Ator a2 = new Ator();
    a2.setNome("Mario");

    Genero g1 = new Genero();
    g1.setDescricao("Ação");

    Filme f1 = new Filme();
    f1.setTitulo("Lightyear");
    f1.setDuracao("01:50");
    f1.setGenero(g1);

    Papel p1 = new Papel();
    p1.setNome("<<<Dados do Ingresso>>>");
    p1.setAtor(a1);
    p1.setFilme(f1);

    Papel p2 = new Papel();
    p2.setNome("<<<Dados do Ingresso>>>");
    p2.setAtor(a1);
    p2.setFilme(f1);

    Sala s1 = new Sala();
    s1.setCapacidade(100);
    s1.setNumero(5);

    Assento as1 = new Assento();
    as1.setCodigo("L10");
    as1.setOcupado(true);
    as1.setSala(s1);

    Sessao ss1 = new Sessao();
    ss1.setData("2022-07-11");
    ss1.setHora("21:15");
    ss1.setValor(100);
    ss1.setEncerrada(true);
    ss1.setSala(s1);
    ss1.setFilme(f1);

    Ingresso i1 = new Ingresso();
    i1.setMeiaEntrada(true);
    i1.setSessao(ss1);
    i1.setAssento(as1);

    System.out.println("<<< Dados do Ingresso >>>");
    System.out.println("Filme: " + i1.getSessao().getFilme().getTitulo());
    System.out.println("Duração: " + i1.getSessao().getFilme().getDuracao());
    System.out.println("Gênero: " + i1.getSessao().getFilme().getGenero().getDescricao());
    System.out.println("Data da Sessão: " + i1.getSessao().getData());
    System.out.println("Hora da Sessão: " + i1.getSessao().getHora());

    if (i1.getMeiaEntrada())
    {
      System.out.println("Valor do Ingresso: " + i1.getSessao().getValor()/2);
    }
    else
    {
      System.out.println("Valor do Ingresso: " + i1.getSessao().getValor());
    }

    System.out.println("Meia Entrada: " + i1.getMeiaEntrada());
    System.out.println("Número da Sala: " + i1.getSessao().getSala().getNumero());
    System.out.println("Código de Assento: " + i1.getAssento().getCodigo());
    
  }
}