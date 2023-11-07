package main.java;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tb_marca")
public class Marca {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
  @SequenceGenerator(
    name = "marca_seq",
    sequenceName = "sq_marca",
    initialValue = 1,
    allocationSize = 1
  )
  private Long id_marca;

  @Column(name = "marca")
  private String marca;

  @OneToMany(mappedBy = "id_marca")
  private List<Carro> carros;

  @OneToMany(mappedBy = "id_marca")
  private List<Acessorio> acessorios;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public List<Carro> getCarros() {
    return carros;
  }

  public void setCarros(List<Carro> carros) {
    this.carros = carros;
  }

  public List<Acessorio> getAcessorios() {
    return acessorios;
  }

  public void setAcessorios(List<Acessorio> acessorios) {
    this.acessorios = acessorios;
  }

  public Long getId_marca() {
    return id_marca;
  }

  public void setId_marca(Long id_marca) {
    this.id_marca = id_marca;
  }
}
