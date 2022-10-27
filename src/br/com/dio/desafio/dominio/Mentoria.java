package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
  // #region "Atributos"
  private String titulo;

  private String descricao;

  private LocalDate data;

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

  public LocalDate getdata() {
    return data;
  }

  public void setdata(LocalDate data) {
    this.data = data;
  }
  // #endregion

  // #region "Sobrescrita"
  @Override
  public String toString() {
    return "Mentoria{" +
        "título= '" + titulo + '\'' +
        ", descrição= '" + descricao + '\'' +
        ", data=" + data +
        "}";
  }
  // #endregion

}
