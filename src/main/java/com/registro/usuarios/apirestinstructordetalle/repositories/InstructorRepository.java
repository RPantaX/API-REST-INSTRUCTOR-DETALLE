package com.registro.usuarios.apirestinstructordetalle.repositories;

import com.registro.usuarios.apirestinstructordetalle.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
