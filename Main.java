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
    
  }
}