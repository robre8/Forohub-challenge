package com.alurachallenge.forohub.domain.topico;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Table(name ="topicos")
@Entity(name= "Topico")
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título es obligatorio")
    private String titulo;

    @NotBlank(message = "El mensaje es obligatorio")
    private String mensaje;

    @CreatedDate
    private LocalDateTime fecha;

    @NotBlank(message = "El estado es obligatorio")
    private String status;

    @NotBlank(message = "El autor es obligatorio")
    private String autor;

    @NotBlank(message = "El curso es obligatorio")
    private String curso;

    public void setId(Long id) {
        this.id = id;
    }
}
