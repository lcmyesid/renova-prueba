package co.com.telefonica.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.telefonica.ws.businesslogic.ParametroGeneral;

@Repository
public interface ParametroRepository extends JpaRepository<ParametroGeneral, String> {
	
	@Query(value = "{call PA_RN_APLI_RECUPERAR_PARAMETRO_GENERAL(:NomParametro)}", nativeQuery = true)
	String recuperarParametro(@Param("NomParametro") String NomParametro);

}
