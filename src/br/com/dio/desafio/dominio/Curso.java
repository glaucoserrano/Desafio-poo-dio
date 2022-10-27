package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
  // #region "Atributos"

  private int cargaHoraria;

  // #endregion
  // #region "Constructor"
  public Curso() {
  }
  // #endregion

  // #region "Getter and Setter"
  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }
  // #endregion

  // #region "Sobrescrita"

  @Override
  public double calcularXP() {
    return XP_PADRAO * cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
        "título= '" + getTitulo() + '\'' +
        ", descrição= '" + getDescricao() + '\'' +
        ", cargaHoraria=" + cargaHoraria +
        "}";
  }
  // #endregion
}
