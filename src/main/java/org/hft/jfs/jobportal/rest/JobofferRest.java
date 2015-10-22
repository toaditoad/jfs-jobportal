package org.hft.jfs.jobportal.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.hft.jfs.jobportal.model.Joboffer;

@Path("/")
public class JobofferRest {

	@GET
	@Path("/joboffer")
	@Produces("application/json")
	public List<Joboffer> getAllJobOffers() {
		List<Joboffer> offers = new ArrayList<Joboffer>();

		Joboffer offer1 = new Joboffer();
		offer1.setTitle("Bachelor Thesis at Bosch");
		offer1.setDescription("Write your Bachelor Thesis in the engineering department of Bosch.");
		offers.add(offer1);

		Joboffer offer2 = new Joboffer();
		offer2.setTitle("Master Thesis at Porsche");
		offer2.setDescription("Write your Master Thesis in the development department of Porsche.");
		offers.add(offer2);

		return offers;
	}
}