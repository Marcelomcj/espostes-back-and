package br.edu.usj.pw.agendabackend;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContatoRepository extends CrudRepository<Contato, Long>{
    List<Contato> findAll();
    
    
}
