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
@Table(name = "empresa")
public class Empresa {

	@Id
	@Getter @Setter
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

	@Getter
	@LastModifiedDate
	private Date updateAt = new Date();
	@Getter
	@CreatedDate
	private Date createdAt = new Date();

	public Empresa(String nombre, String direccion, String telefono, String nit) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nit = nit;
	}

}
