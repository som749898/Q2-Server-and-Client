package com.jpos.spring.jpos.service;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.MUX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	private MUX mux;
	
	public String response() throws ISOException {
		ISOMsg m = new ISOMsg();
		m.setMTI("0100");
		m.set(2,"4160211510908933");
		m.set(3,"3000");
		m.set(7, "0223103040");
		m.set(11, "303804");
		m.set(70, "001");
		ISOMsg respMsg = mux.request(m,30000);
		return respMsg.toString();
	}
}
