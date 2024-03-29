package com.registro.usuarios.apirestinstructordetalle.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instructor_detalle")
public class InstructorDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "canal_youtube")
    private String canalYoutube;

    @Column(name = "pasa_tiempo")
    private String pasaTiempo;
}
