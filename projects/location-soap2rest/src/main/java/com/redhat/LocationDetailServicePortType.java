package com.redhat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-26T04:12:39.809-04:00
 * Generated source version: 3.2.6
 *
 */
@WebService(targetNamespace = "http://redhat.com/", name = "LocationDetailServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface LocationDetailServicePortType {

    @WebMethod
    @RequestWrapper(localName = "phone", targetNamespace = "http://redhat.com/", className = "com.redhat.Phone")
    @ResponseWrapper(localName = "phoneResponse", targetNamespace = "http://redhat.com/", className = "com.redhat.PhoneResponse")
    @WebResult(name = "return", targetNamespace = "http://redhat.com/")
    public java.lang.String phone(
        @WebParam(name = "arg0", targetNamespace = "http://redhat.com/")
        java.lang.Integer arg0
    );
}
