package sv.edu.ues.dsi.palasatenea.modelo;

// Generated 10-21-2014 12:32:13 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "palasatenea")
public class Usuario implements java.io.Serializable {

	private String ucarnetusuario;
	private String ucontrasena;
	private Set<Docente> docentes = new HashSet<Docente>(0);
	private Set<Estudiante> estudiantes = new HashSet<Estudiante>(0);
	private Set<Administrador> administradors = new HashSet<Administrador>(0);
	private Set<Padrefamilia> padrefamilias = new HashSet<Padrefamilia>(0);

	public Usuario() {
	}

	public Usuario(String ucarnetusuario, String ucontrasena) {
		this.ucarnetusuario = ucarnetusuario;
		this.ucontrasena = ucontrasena;
	}

	public Usuario(String ucarnetusuario, String ucontrasena,
			Set<Docente> docentes, Set<Estudiante> estudiantes,
			Set<Administrador> administradors, Set<Padrefamilia> padrefamilias) {
		this.ucarnetusuario = ucarnetusuario;
		this.ucontrasena = ucontrasena;
		this.docentes = docentes;
		this.estudiantes = estudiantes;
		this.administradors = administradors;
		this.padrefamilias = padrefamilias;
	}

	@Id
	@Column(name = "UCARNETUSUARIO", unique = true, nullable = false, length = 8)
	public String getUcarnetusuario() {
		return this.ucarnetusuario;
	}

	public void setUcarnetusuario(String ucarnetusuario) {
		this.ucarnetusuario = ucarnetusuario;
	}

	@Column(name = "UCONTRASENA", nullable = false, length = 20)
	public String getUcontrasena() {
		return this.ucontrasena;
	}

	public void setUcontrasena(String ucontrasena) {
		this.ucontrasena = ucontrasena;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Docente> getDocentes() {
		return this.docentes;
	}

	public void setDocentes(Set<Docente> docentes) {
		this.docentes = docentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Estudiante> getEstudiantes() {
		return this.estudiantes;
	}

	public void setEstudiantes(Set<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Administrador> getAdministradors() {
		return this.administradors;
	}

	public void setAdministradors(Set<Administrador> administradors) {
		this.administradors = administradors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Padrefamilia> getPadrefamilias() {
		return this.padrefamilias;
	}

	public void setPadrefamilias(Set<Padrefamilia> padrefamilias) {
		this.padrefamilias = padrefamilias;
	}

}
