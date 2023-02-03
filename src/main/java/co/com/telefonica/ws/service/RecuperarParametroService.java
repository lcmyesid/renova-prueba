package co.com.telefonica.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.telefonica.ws.dto.ParametroDTO;
import co.com.telefonica.ws.exception.SiecaException;
import co.com.telefonica.ws.repository.ParametroRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RecuperarParametroService {

	@Autowired
	ParametroRepository parametroRepository;

	public ParametroDTO recuperarParametro(String descripcion) throws SiecaException {
		ParametroDTO parametro = new ParametroDTO();
		parametro.setParametro(parametroRepository.recuperarParametro(descripcion));
		if (parametro != null && parametro.getParametro() != null && !parametro.getParametro().isEmpty()) {
			log.info("parametro encontrado: " + parametro);
			return parametro;
		} else {
			return null;
		}
	}

}
