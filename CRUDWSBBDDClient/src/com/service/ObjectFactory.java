
package com.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUsuariosList_QNAME = new QName("http://service.com/", "getUsuariosList");
    private final static QName _UpdateUsuario_QNAME = new QName("http://service.com/", "updateUsuario");
    private final static QName _Respuesta_QNAME = new QName("http://service.com/", "Respuesta");
    private final static QName _GetUsuarioResponse_QNAME = new QName("http://service.com/", "getUsuarioResponse");
    private final static QName _IOException_QNAME = new QName("http://service.com/", "IOException");
    private final static QName _Usuario_QNAME = new QName("http://service.com/", "Usuario");
    private final static QName _DeleteUsuario_QNAME = new QName("http://service.com/", "deleteUsuario");
    private final static QName _CheckCallWSResponse_QNAME = new QName("http://service.com/", "checkCallWSResponse");
    private final static QName _AddUsuario_QNAME = new QName("http://service.com/", "addUsuario");
    private final static QName _SetUsuariosListResponse_QNAME = new QName("http://service.com/", "setUsuariosListResponse");
    private final static QName _SetUsuariosList_QNAME = new QName("http://service.com/", "setUsuariosList");
    private final static QName _GetUsuario_QNAME = new QName("http://service.com/", "getUsuario");
    private final static QName _DeleteUsuarioResponse_QNAME = new QName("http://service.com/", "deleteUsuarioResponse");
    private final static QName _UpdateUsuarioResponse_QNAME = new QName("http://service.com/", "updateUsuarioResponse");
    private final static QName _CheckCallWS_QNAME = new QName("http://service.com/", "checkCallWS");
    private final static QName _GetUsuariosListResponse_QNAME = new QName("http://service.com/", "getUsuariosListResponse");
    private final static QName _AddUsuarioResponse_QNAME = new QName("http://service.com/", "addUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link DeleteUsuario }
     * 
     */
    public DeleteUsuario createDeleteUsuario() {
        return new DeleteUsuario();
    }

    /**
     * Create an instance of {@link GetUsuarioResponse }
     * 
     */
    public GetUsuarioResponse createGetUsuarioResponse() {
        return new GetUsuarioResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link GetUsuariosList }
     * 
     */
    public GetUsuariosList createGetUsuariosList() {
        return new GetUsuariosList();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link UpdateUsuario }
     * 
     */
    public UpdateUsuario createUpdateUsuario() {
        return new UpdateUsuario();
    }

    /**
     * Create an instance of {@link AddUsuarioResponse }
     * 
     */
    public AddUsuarioResponse createAddUsuarioResponse() {
        return new AddUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosListResponse }
     * 
     */
    public GetUsuariosListResponse createGetUsuariosListResponse() {
        return new GetUsuariosListResponse();
    }

    /**
     * Create an instance of {@link DeleteUsuarioResponse }
     * 
     */
    public DeleteUsuarioResponse createDeleteUsuarioResponse() {
        return new DeleteUsuarioResponse();
    }

    /**
     * Create an instance of {@link UpdateUsuarioResponse }
     * 
     */
    public UpdateUsuarioResponse createUpdateUsuarioResponse() {
        return new UpdateUsuarioResponse();
    }

    /**
     * Create an instance of {@link CheckCallWS }
     * 
     */
    public CheckCallWS createCheckCallWS() {
        return new CheckCallWS();
    }

    /**
     * Create an instance of {@link SetUsuariosListResponse }
     * 
     */
    public SetUsuariosListResponse createSetUsuariosListResponse() {
        return new SetUsuariosListResponse();
    }

    /**
     * Create an instance of {@link GetUsuario }
     * 
     */
    public GetUsuario createGetUsuario() {
        return new GetUsuario();
    }

    /**
     * Create an instance of {@link SetUsuariosList }
     * 
     */
    public SetUsuariosList createSetUsuariosList() {
        return new SetUsuariosList();
    }

    /**
     * Create an instance of {@link CheckCallWSResponse }
     * 
     */
    public CheckCallWSResponse createCheckCallWSResponse() {
        return new CheckCallWSResponse();
    }

    /**
     * Create an instance of {@link AddUsuario }
     * 
     */
    public AddUsuario createAddUsuario() {
        return new AddUsuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getUsuariosList")
    public JAXBElement<GetUsuariosList> createGetUsuariosList(GetUsuariosList value) {
        return new JAXBElement<GetUsuariosList>(_GetUsuariosList_QNAME, GetUsuariosList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "updateUsuario")
    public JAXBElement<UpdateUsuario> createUpdateUsuario(UpdateUsuario value) {
        return new JAXBElement<UpdateUsuario>(_UpdateUsuario_QNAME, UpdateUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respuesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "Respuesta")
    public JAXBElement<Respuesta> createRespuesta(Respuesta value) {
        return new JAXBElement<Respuesta>(_Respuesta_QNAME, Respuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getUsuarioResponse")
    public JAXBElement<GetUsuarioResponse> createGetUsuarioResponse(GetUsuarioResponse value) {
        return new JAXBElement<GetUsuarioResponse>(_GetUsuarioResponse_QNAME, GetUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "Usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "deleteUsuario")
    public JAXBElement<DeleteUsuario> createDeleteUsuario(DeleteUsuario value) {
        return new JAXBElement<DeleteUsuario>(_DeleteUsuario_QNAME, DeleteUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCallWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "checkCallWSResponse")
    public JAXBElement<CheckCallWSResponse> createCheckCallWSResponse(CheckCallWSResponse value) {
        return new JAXBElement<CheckCallWSResponse>(_CheckCallWSResponse_QNAME, CheckCallWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "addUsuario")
    public JAXBElement<AddUsuario> createAddUsuario(AddUsuario value) {
        return new JAXBElement<AddUsuario>(_AddUsuario_QNAME, AddUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUsuariosListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "setUsuariosListResponse")
    public JAXBElement<SetUsuariosListResponse> createSetUsuariosListResponse(SetUsuariosListResponse value) {
        return new JAXBElement<SetUsuariosListResponse>(_SetUsuariosListResponse_QNAME, SetUsuariosListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUsuariosList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "setUsuariosList")
    public JAXBElement<SetUsuariosList> createSetUsuariosList(SetUsuariosList value) {
        return new JAXBElement<SetUsuariosList>(_SetUsuariosList_QNAME, SetUsuariosList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getUsuario")
    public JAXBElement<GetUsuario> createGetUsuario(GetUsuario value) {
        return new JAXBElement<GetUsuario>(_GetUsuario_QNAME, GetUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "deleteUsuarioResponse")
    public JAXBElement<DeleteUsuarioResponse> createDeleteUsuarioResponse(DeleteUsuarioResponse value) {
        return new JAXBElement<DeleteUsuarioResponse>(_DeleteUsuarioResponse_QNAME, DeleteUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "updateUsuarioResponse")
    public JAXBElement<UpdateUsuarioResponse> createUpdateUsuarioResponse(UpdateUsuarioResponse value) {
        return new JAXBElement<UpdateUsuarioResponse>(_UpdateUsuarioResponse_QNAME, UpdateUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCallWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "checkCallWS")
    public JAXBElement<CheckCallWS> createCheckCallWS(CheckCallWS value) {
        return new JAXBElement<CheckCallWS>(_CheckCallWS_QNAME, CheckCallWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getUsuariosListResponse")
    public JAXBElement<GetUsuariosListResponse> createGetUsuariosListResponse(GetUsuariosListResponse value) {
        return new JAXBElement<GetUsuariosListResponse>(_GetUsuariosListResponse_QNAME, GetUsuariosListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "addUsuarioResponse")
    public JAXBElement<AddUsuarioResponse> createAddUsuarioResponse(AddUsuarioResponse value) {
        return new JAXBElement<AddUsuarioResponse>(_AddUsuarioResponse_QNAME, AddUsuarioResponse.class, null, value);
    }

}
