package com.LibrasTils.LibrasTils.models;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "interpretes")
public class Interprete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cpf;
    private String user;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String genero;
    private String telefone;
    private String email;
    private String senha;

    @Embedded
    private Endereco endereco;

    // Getters e Setters
}

