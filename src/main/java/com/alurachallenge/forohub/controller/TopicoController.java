package com.alurachallenge.forohub.controller;
import com.alurachallenge.forohub.domain.topico.Topico;
import com.alurachallenge.forohub.domain.topico.TopicoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/topicos")
@Validated
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    @Operation(summary = "Crea un nuevo topico",
            description = "",
            tags = { "topico" })
    public ResponseEntity<Topico> crearTopico(@Valid @RequestBody Topico topico) {
        try {
            Topico crearTopico = topicoService.crearTopico(topico);
            return ResponseEntity.status(HttpStatus.CREATED).body(crearTopico);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping
    @Operation(summary = "Obtiene el listado de topicos activos",
            description = "",
            tags = { "topico" })
    public List<Topico> obtenerTodosLosTopicos() {
        return topicoService.listarTopicos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtiene los datos de un topico por id",
            description = "",
            tags = { "topico" })
    public ResponseEntity<Topico> obtenerTopicoById(@PathVariable Long id) {
        return topicoService.obtenerTopicoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualiza los datos de un topico por id",
            description = "",
            tags = { "topico" })
    public ResponseEntity<Topico> actualizarTopico(@PathVariable Long id, @Valid @RequestBody Topico topico) {
        Topico actualizaTopico = topicoService.actualizarTopico(id, topico);
        return ResponseEntity.ok(actualizaTopico);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Borra los datos de un topico por id",
            description = "",
            tags = { "topico" })
    public ResponseEntity<Void> borraTopico(@PathVariable Long id) {
        topicoService.borrarTopico(id);
        return ResponseEntity.noContent().build();
    }
}
