
package org.donstu.async;

import java.util.List;
import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankService", targetNamespace = "https://donstu.org/bank")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<org.donstu.async.GetAvailableEmployersResponse>
     */
    @WebMethod(operationName = "getAvailableEmployers")
    @RequestWrapper(localName = "getAvailableEmployers", targetNamespace = "https://donstu.org/bank", className = "org.donstu.async.GetAvailableEmployers")
    @ResponseWrapper(localName = "getAvailableEmployersResponse", targetNamespace = "https://donstu.org/bank", className = "org.donstu.async.GetAvailableEmployersResponse")
    public Response<GetAvailableEmployersResponse> getAvailableEmployersAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getAvailableEmployers")
    @RequestWrapper(localName = "getAvailableEmployers", targetNamespace = "https://donstu.org/bank", className = "org.donstu.async.GetAvailableEmployers")
    @ResponseWrapper(localName = "getAvailableEmployersResponse", targetNamespace = "https://donstu.org/bank", className = "org.donstu.async.GetAvailableEmployersResponse")
    public Future<?> getAvailableEmployersAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetAvailableEmployersResponse> asyncHandler);

    /**
     * 
     * @return
     *     returns java.util.List<org.donstu.async.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAvailableEmployers", targetNamespace = "https://donstu.org/bank", className = "org.donstu.async.GetAvailableEmployers")
    @ResponseWrapper(localName = "getAvailableEmployersResponse", targetNamespace = "https://donstu.org/bank", className = "org.donstu.async.GetAvailableEmployersResponse")
    @Action(input = "https://donstu.org/bank/BankService/getAvailableEmployersRequest", output = "https://donstu.org/bank/BankService/getAvailableEmployersResponse")
    public List<Employee> getAvailableEmployers();

}
