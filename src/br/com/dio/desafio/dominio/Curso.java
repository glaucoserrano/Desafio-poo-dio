package br.com.dio.desafio.dominio;

public class Curso {
  // #region "Atributos"
  private String titulo;

  private String descricao;

  private int cargaHoraria;

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

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }
  // #endregion

  // #region "Sobrescrita"
  @Override
  public String toString() {
    return "Curso{" +
        "título= '" + titulo + '\'' +
        ", descrição= '" + descricao + '\'' +
        ", cargaHoraria=" + cargaHoraria +
        "}";
  }
  // #endregion
}
