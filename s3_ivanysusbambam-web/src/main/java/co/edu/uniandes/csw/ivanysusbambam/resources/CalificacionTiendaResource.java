/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.ivanysusbambam.resources;

import co.edu.uniandes.csw.ivanysusbambam.dtos.CalificacionTiendaDTO;
import co.edu.uniandes.csw.ivanysusbambam.dtos.CalificacionTiendaDetailDTO;
import co.edu.uniandes.csw.ivanysusbambam.exceptions.BusinessLogicException;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author if.garcia
 */
@Path("calificacionCarro")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class CalificacionTiendaResource {
    
     /**
     * GET api/clientes/(id)/calificacionTienda Retorna todas las calificaciones  
     * que un cliente ha puesto a una lista de tiendas
     * 
     * <pre>Busca y devuelve todas las calificaciones que un cliente ha dado.
     * 
     * Codigos de respuesta:
     * <code style="color: mediumseagreen; background-color: #eaffe0;">
     * 200 OK Devuelve todas las calificaciones del cliente.</code> 
     * </pre>
     * 
     * @param id identificador unico del cliente.
     * @return JSONArray  con la información de todas las calificaciones del cliente.
     * @throws BusinessLogicException si el cliente con el id dado no existe.
     */
    @GET
    public List<CalificacionTiendaDTO> getCalificacionesTienda(@PathParam("id") Long id) throws BusinessLogicException{
        return null;
    }
    
     /**
     * GET /api/clientes/(id)/calificacionesTienda/(pid): Obtiene una calificacion según su id.
     * <pre> 
     * Codigos de respuesta:
     * <code style="color: mediumseagreen; background-color: #eaffe0;">
     * 200 OK se encontró la calificacion.
     * </code> 
     * <code style="color: #c7254e; background-color: #f9f2f4;">
     * 404 Not Found No existe un un cliente o calificacion con los id dados.
     * </code> 
     * </pre>
     * @param id id del cliente.
     * @param pid id de la calificacion.
     * @return JSON la calificacion de tienda buscada.
     * @throws BusinessLogicException si no existe el cliente con el id dado o la calificacion con el id dado..
     */
    @GET
    @Path("{pid: \\d+}")
    public CalificacionTiendaDetailDTO getCalificacionTienda(@PathParam("id") Long id, @PathParam("pid") Long pid) throws BusinessLogicException{
        return null;
    }
    
    /**
     * PUT /api/clientes/(id)/calificacionesTienda/(pid): Obtiene una calificacion de una tienda según su id.
     * <pre> 
     * Codigos de respuesta:
     * <code style="color: mediumseagreen; background-color: #eaffe0;">
     * 200 OK se actualizó la calificacion.
     * </code> 
     * <code style="color: #c7254e; background-color: #f9f2f4;">
     * 404 Not Found no existe el cliente o prospecto de compra con el id dado.
     * </code> 
     * </pre>
     * @param id id del cliente.
     * @param pid id del prospecto de compra.
     * @return JSON el prospecto de compra actualizado.
     * @throws BusinessLogicException si no existe el cliente con el id dado o el prospecto con el id dado.
     *
    @PUT
    @Path("{pid: \\d+")
    public ProspectoCompraDetailDTO putProspectoCompra(@PathParam("id") int id, @PathParam("pid") int pid) throws BusinessLogicException{
        return null;
    }
    
    /**
     * POST /api/clientes/(id)/prospectosCompra: Crea un nuevo prospecto de compra.
     * <pre> 
     * Codigos de respuesta:
     * <code style="color: mediumseagreen; background-color: #eaffe0;">
     * 200 OK se creó el prospecto de compra.
     * </code> 
     * <code style="color: #c7254e; background-color: #f9f2f4;">
     * 404 Not Found no existe el cliente el id dado.
     * </code> 
     * </pre>
     * @param id id del cliente.
     * @param prospecto el prospecto de compra que se añadirá.
     * @return JSON el prospecto de compra creado con su id autoasignado.
     * @throws BusinessLogicException si no existe el cliente con el id dado.
     *
    @POST
    public ProspectoCompraDetailDTO postProspectoCompra(@PathParam("id") int id, ProspectoCompraDetailDTO prospecto)throws BusinessLogicException{
        return null;
    }
    /**
     * DELETE /api/clientes/(id)/prospectosCompra/(pid):elimina un prospecto de compra según su id.
     * <pre> 
     * Codigos de respuesta:
     * <code style="color: mediumseagreen; background-color: #eaffe0;">
     * 200 OK se eliminó el prospecto de compra.
     * </code> 
     * <code style="color: #c7254e; background-color: #f9f2f4;">
     * 404 Not Found no existe el cliente o prospecto de compra con el id dado.
     * </code> 
     * </pre>
     * @param id id del cliente.
     * @param pid id del prospecto de compra.
     * @return JSON el prospecto de compra actualizado.
     * @throws BusinessLogicException si no existe el cliente con el id dado o el prospecto con el id dado.
     *
    @DELETE
    @Path("{pid: \\d+}")
    public ProspectoCompraDetailDTO deleteProspectoCompra(@PathParam("id") int id, @PathParam("pid") int pid) throws BusinessLogicException{
        return null;
    }
    */
}