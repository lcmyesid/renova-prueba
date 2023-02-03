package co.com.telefonica.ws.businesslogic;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "RN_APLI_PARAM_GENERALES", schema = "dbo")
public class ParametroGeneral implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Descripcion")
	private String descripcion;

	@Column(name = "Valor")
	private String valor;

	@Column(name = "FechaActivacion")
	private Date fechaActivacion;

}
