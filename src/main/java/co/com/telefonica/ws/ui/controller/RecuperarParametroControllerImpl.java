package co.com.telefonica.ws.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import co.com.telefonica.ws.dto.ParametroDTO;
import co.com.telefonica.ws.dto.ResponseDTO;
import co.com.telefonica.ws.exception.SiecaException;
import co.com.telefonica.ws.service.RecuperarParametroService;

@RestController
public class RecuperarParametroControllerImpl implements RecuperarParametroController {
	
	@Autowired
	RecuperarParametroService recuperarParametroService;

	@Override
	public ResponseEntity<ResponseDTO> recuperarParametro(String descripcion) throws SiecaException {
		ParametroDTO parametro = recuperarParametroService.recuperarParametro(descripcion);
		ResponseDTO responseDTO = new ResponseDTO();
		if (parametro != null && parametro.getParametro() != null) {
			responseDTO.setResponse(parametro);
			responseDTO.getServiceException().setMessageId("200");
			responseDTO.getServiceException().setText("La operación fue exitosa.");
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
		} else {
			responseDTO.setResponse(null);
			responseDTO.getServiceException().setMessageId("400");
			responseDTO.getServiceException().setText("Fallo en la operación.");
			responseDTO.getServiceException().setVariables("No existen parámetros para la descripción enviada.");
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
		}
	}

}
