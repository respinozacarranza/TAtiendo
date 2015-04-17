
package pe.edu.upc.cliente;

import java.util.List;
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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CategoriaWs", targetNamespace = "http://ws.tatiendo.com.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CategoriaWs {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrar", targetNamespace = "http://ws.tatiendo.com.pe/", className = "pe.edu.upc.cliente.Registrar")
    @ResponseWrapper(localName = "registrarResponse", targetNamespace = "http://ws.tatiendo.com.pe/", className = "pe.edu.upc.cliente.RegistrarResponse")
    @Action(input = "http://ws.tatiendo.com.pe/CategoriaWs/registrarRequest", output = "http://ws.tatiendo.com.pe/CategoriaWs/registrarResponse")
    public String registrar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<pe.edu.upc.cliente.Categoria>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://ws.tatiendo.com.pe/", className = "pe.edu.upc.cliente.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://ws.tatiendo.com.pe/", className = "pe.edu.upc.cliente.ListarResponse")
    @Action(input = "http://ws.tatiendo.com.pe/CategoriaWs/listarRequest", output = "http://ws.tatiendo.com.pe/CategoriaWs/listarResponse")
    public List<Categoria> listar();

}
