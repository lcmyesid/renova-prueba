package co.com.telefonica.ws.ui.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.com.telefonica.ws.dto.ResponseDTO;
import co.com.telefonica.ws.exception.SiecaException;


@RequestMapping("/telefonica/v1/recovery-general-parameters")
public interface RecuperarParametroController {
	
	@GetMapping("/parametro")
	public ResponseEntity<ResponseDTO> recuperarParametro(@RequestParam(required = true) String descripcion) throws SiecaException;

}
