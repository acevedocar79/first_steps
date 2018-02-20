/*
 * Copyright (c) 2018 Anzen Soluciones S.A. de C.V.
 * Mexico D.F.
 * All rights reserved.
 *
 * THIS SOFTWARE IS  CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES.
 * THIS INFORMATION SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY ITSELF.
 */
package mx.com.anzen.port;

import org.springframework.stereotype.Component;

import mx.com.anzen.stubs.AccountPortType;
import mx.com.anzen.stubs.AllRequest;
import mx.com.anzen.stubs.AllResponse;
import mx.com.anzen.stubs.OneByIdRequest;
import mx.com.anzen.stubs.OneByIdResponse;
import mx.com.anzen.stubs.RegisterRequest;
import mx.com.anzen.stubs.RegisterResponse;
import mx.com.anzen.stubs.SoapComponentErrorMessage;

/**
 * <p>TODO [Add comments of the class]</p>
 * 
 * @author acevedito
 * @version first-steps-wsdl
 * @since first-steps-wsdl
 * @category
 */
@javax.jws.WebService(
		serviceName = "accountService", portName = "accountPort", 
		targetNamespace = "http://localhost/tuto/wsdl", 
		wsdlLocation = "classpath:wsdl/AccountService.wsdl", 
		endpointInterface = "mx.com.anzen.stubs.AccountPortType")
@Component("accountPortTypeImpl")
public class AccountPortTypeImpl implements AccountPortType {

	
	@Override
	public OneByIdResponse oneByIdPortTypeOperation(OneByIdRequest oneByIdRequestMessagePart)
			throws SoapComponentErrorMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisterResponse registerPortTypeOperation(RegisterRequest registerRequestMessagePart)
			throws SoapComponentErrorMessage {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AllResponse allPortTypeOperation(AllRequest allRequestMessagePart) throws SoapComponentErrorMessage {
		// TODO Auto-generated method stub
		return null;
	}

}
