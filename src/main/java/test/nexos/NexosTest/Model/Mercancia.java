package test.nexos.NexosTest.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MERCANCIAS")
public class Mercancia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8008516405507883655L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nombre_producto")
	private String nombre_producto;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "fecha_ingreso")
	private Date fecha_ingreso;
	
	@Column(name = "fk_usuario_reg")
	private Long fk_usuario_reg;

	@Column(name = "fecha_mod")
	private Date fecha_mod;
	
	@Column(name = "fk_usuario_mod")
	private Long fk_usuario_mod;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Long getFk_usuario_reg() {
		return fk_usuario_reg;
	}

	public void setFk_usuario_reg(Long fk_usuario_reg) {
		this.fk_usuario_reg = fk_usuario_reg;
	}

	public Date getFecha_mod() {
		return fecha_mod;
	}

	public void setFecha_mod(Date fecha_mod) {
		this.fecha_mod = fecha_mod;
	}

	public Long getFk_usuario_mod() {
		return fk_usuario_mod;
	}

	public void setFk_usuario_mod(Long fk_usuario_mod) {
		this.fk_usuario_mod = fk_usuario_mod;
	}
	
	
}
