package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
  // #region "Atributos"

  private LocalDate data;
  // #endregion

  // #region "Constructor"
  public Mentoria() {
  }

  // #endregion
  // #region "Getter and Setter"
  public LocalDate getdata() {
    return data;
  }

  public void setdata(LocalDate data) {
    this.data = data;
  }
  // #endregion

  // #region "Sobrescrita"
  @Override
  public double calcularXP() {
    return XP_PADRAO + 20d;
  }

  @Override
  public String toString() {
    return "Mentoria{" +
        "título= '" + getTitulo() + '\'' +
        ", descrição= '" + getDescricao() + '\'' +
        ", data=" + data +
        "}";
  }
  // #endregion

}
