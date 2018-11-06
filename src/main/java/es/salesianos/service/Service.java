package es.salesianos.service;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.model.Owner;
import es.salesianos.model.assembler.OwnerAssembler;
import es.salesianos.repository.Repository;
import es.salesianos.utils.DateConverter;

public class Service {
	private Repository repository = new Repository();
	private DateConverter converter = new DateConverter();

	public Owner assembleOwnerFromRequest(HttpServletRequest req) {
		return OwnerAssembler.assembleOwnerFrom(req);
	}

	public void insertOrUpdate(Owner user) {
		// TODO Auto-generated method stub
		
	}

}
