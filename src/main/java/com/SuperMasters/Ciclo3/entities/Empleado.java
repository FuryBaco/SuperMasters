package com.SuperMasters.Ciclo3.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor @ToString
@Table(name = "empleado")
public class Empleado {

	@Id
	@Getter @Setter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Getter @Setter
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

	@Getter @Setter
	@Column(name = "correo", length = 50, nullable = false, unique = true)
	private String correo;

	@Getter @Setter
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

	@Getter @Setter
	@Column(name = "rol", length = 50, nullable = false)
	private String rol;

	public Empleado(String nombre, String correo, Empresa empresa, String rol) {
		this.nombre = nombre;
		this.correo = correo;
		this.empresa = empresa;
		this.rol = rol;
	}

	@Getter
	@LastModifiedDate
	private Date updateAt = new Date();
	@Getter
	@CreatedDate
	private Date createdAt = new Date();
}
