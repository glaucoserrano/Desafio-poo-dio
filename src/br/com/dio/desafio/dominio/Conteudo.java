package br.com.dio.desafio.dominio;

public abstract class Conteudo {
  // #region "Atributos"
  protected static final double XP_PADRAO = 10d;

  private String titulo;

  private String descricao;
  // #endregion

  // #region "Getter and Setter"
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  // #endregion

  // #region "Metodos"
  public abstract double calcularXP();
  // #endregion
}
