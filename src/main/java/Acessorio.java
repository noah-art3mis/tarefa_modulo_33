package main.java;

import javax.persistence.*;

@Entity
@Table(name = "tb_acessorio")
public class Acessorio {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "acessorio_seq"
  )
  @SequenceGenerator(
    name = "acessorio_seq",
    sequenceName = "sq_acessorio",
    initialValue = 1,
    allocationSize = 1
  )
  private Long id_acessorio;

  @Column(name = "nome")
  private String nome;

@ManyToOne
@JoinColumn(name = "id_acessorio")
  private String marca;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public Long getId_acessorio() {
    return id_acessorio;
}

public void setId_acessorio(Long id_acessorio) {
    this.id_acessorio = id_acessorio;
}
}
