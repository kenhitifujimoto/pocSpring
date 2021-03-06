package br.tricard.poc.spring.endpoint;

import java.io.Serializable;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteResources implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() throws JSONException{		
		JSONObject json = new JSONObject();
		json.accumulate("name", "kenhiti");
		json.accumulate("idade", 32);	
		
		return ResponseEntity.ok(json.toString());
	}
	
}
