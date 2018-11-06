package es.salesianos.model.assembler;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.model.Owner;

public class OwnerAssembler {

	public static Owner assembleOwnerFrom(HttpServletRequest req) {
		Owner owner = new Owner();
		String name = req.getParameter("nombre");
		String lastName = req.getParameter("apellido");
		owner.setName(name);
		owner.setLastName(lastName);
		return owner;
	}

}
