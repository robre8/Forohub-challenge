package com.alurachallenge.forohub.domain.topico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> listarTopicos() {
        return topicoRepository.findAll();
    }

    public Optional<Topico> obtenerTopicoById(Long id) {
        return topicoRepository.findById(id);
    }

    public Topico crearTopico(Topico topico) {
        return topicoRepository.save(topico);
    }

    public Topico actualizarTopico(Long id, Topico topico) {
        topico.setId(id);
        return topicoRepository.save(topico);
    }

    public void borrarTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}
