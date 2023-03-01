class Main {
  public static void main(String[] args) {

    Ator a1 = new Ator();
    a1.setNome("Brain");

    Ator a2 = new Ator();
    a2.setNome("Toretto");

    Genero g1 = new Genero();
    g1.setDescricao("Ação");

    Filme f1 = new Filme();
    f1.setTitulo("Velozes & Furiosos");
    f1.setDuracao(1);
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
    as1.setCodigo(1);
    as1.setOcupado(true);
    as1.setSala(s1);

    Sessao ss1 = new Sessao();
    ss1.setData(01/03/2023);
    ss1.setHora(20);
    ss1.setValor(18.20f);
    ss1.setEncerrada(true);
    ss1.setSala(s1);
    ss1.setFilme(f1);

    Ingresso i1 = new Ingresso();
    i1.setMeiaEntrada(true);
    i1.setSessao(ss1);
    i1.setAssento(as1);

    System.out.println(i1);
    
  }
}