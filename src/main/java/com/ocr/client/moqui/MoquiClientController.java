package com.ocr.client.moqui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ocr.client.moqui.model.MoquiClientModel;

@RestController
public class MoquiClientController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MoquiClientController.class);

	@Autowired
	private MoquiClient moquiClient;

	@PostMapping(value = "/createClientCatalog", produces = MediaType.APPLICATION_JSON_VALUE)

	public void MoquiClientModelSave(@RequestBody MoquiClientModel moquiClientModel) {

		LOGGER.info("start process");

		moquiClient.MoquiClientModelSave(moquiClientModel);

	}

}
