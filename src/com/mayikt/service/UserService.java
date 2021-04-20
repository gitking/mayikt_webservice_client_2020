
package com.mayikt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://service.mayikt.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://service.mayikt.com/", className = "com.mayikt.service.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://service.mayikt.com/", className = "com.mayikt.service.GetUserResponse")
    @Action(input = "http://service.mayikt.com/UserService/getUserRequest", output = "http://service.mayikt.com/UserService/getUserResponse")
    public String getUser(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

}
