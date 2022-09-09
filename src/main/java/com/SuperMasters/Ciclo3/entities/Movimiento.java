package com.SuperMasters.Ciclo3.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "movimiento")
@NoArgsConstructor @ToString
public class Movimiento {

	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Getter @Setter
	@Column(name = "monto", length = 50, nullable = false)
	private float monto;

	@Getter @Setter
	@Column(name = "concepto", length = 50, nullable = false)
	private String concepto;

	@Getter @Setter
	@ManyToOne
	@JoinColumn(name = "empleado_id")
	private Empleado empleado;

	public Movimiento(float monto, String concepto, Empleado empleado) {
		this.monto = monto;
		this.concepto = concepto;
		this.empleado = empleado;
	}
}
