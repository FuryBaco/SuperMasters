package com.SuperMasters.Ciclo3.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimiento")
@NoArgsConstructor @ToString
public class Movimiento {

	@Id
	@Getter
	private Long id;

	@Getter @Setter
	@Column(name = "monto", length = 50, nullable = false)
	private float monto;

	@Getter @Setter
	@Column(name = "concepto", length = 50, nullable = false)
	private String concepto;
}
