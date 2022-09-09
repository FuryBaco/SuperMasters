package com.SuperMasters.Ciclo3.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor @ToString
@Table(name = "empresa")
public class Empresa {

	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Getter @Setter
	@Column(name = "nombre", length = 50, nullable = false, unique = true)
	private String nombre;
	@Getter @Setter
	@Column(name = "direccion", length = 150, nullable = false)
	private String direccion;
	@Getter @Setter
	@Column(name = "telefono", length = 50, nullable = false)
	private String telefono;
	@Getter @Setter
	@Column(name = "nit", length = 50, nullable = false)
	private String nit;

	public Empresa(String nombre, String direccion, String telefono, String nit) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nit = nit;
	}

}
