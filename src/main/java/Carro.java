package main.java;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tb_carro")
public class Carro {

  //propriedades

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
  @SequenceGenerator(
    name = "carro_seq",
    sequenceName = "sq_carro",
    initialValue = 1,
    allocationSize = 1
  )
  private Long id_carro;

  @ManyToOne
  @JoinColumn(name = "id_carro")
  private Marca marca;

  //unidirectional
  @OneToMany
  @JoinColumn(name = "id_carro")
  private List<Acessorio> acessorios;

  // getters e setters

  public List<Acessorio> getAcessorios() {
    return acessorios;
  }

  public void setAcessorios(List<Acessorio> acessorios) {
    this.acessorios = acessorios;
  }

  public Marca getMarca() {
    return marca;
  }

  public void setMarca(Marca marca) {
    this.marca = marca;
  }

  public Long getId_carro() {
    return id_carro;
  }

  public void setId_carro(Long id_carro) {
    this.id_carro = id_carro;
  }
}
