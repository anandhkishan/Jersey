package com.javaApp.Sample;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/humans")
public class HumanResources {
	
		humansRepository repo = new humansRepository();
	
		@GET
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public List<Humans> getHumans() {
			System.out.println("Hello Human");
			return repo.getHumans();
			
		}
		@GET
		@Path("/human/{id}")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Humans getHuman(@PathParam("id") int id) {
			return repo.getHuman(id);
		}
		@POST
		@Path("human")
		@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Humans createHuman(Humans a) {
			System.out.println(a);
			repo.create(a);
			return a;
		}

//		@PUT
//		@Path("human")
//		@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//		public Humans updateHuman(Humans a) {
//			System.out.println(a);
//			if(repo.getHuman(a.getId())==null)
//				repo.create(a);
//			else
//				repo.update(a);
//			return a;
//		}
		@DELETE
		@Path("/human/{id}")
		public Humans deleteHuman(@PathParam("id") int id) {
			Humans a = repo.getHuman(id);
			if(a.getId()!=0)
			repo.delete(id);
			
			return a;
		}
}

