package com.SuperMasters.Ciclo3.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor @ToString
@Table(name = "empleado")
public class Empleado {

	@Id
	@Getter
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
}
