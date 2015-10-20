package api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.hft.jfs.jobportal.model.JobOffer;

@Path("/")
public class JobOfferRest {

	@GET
	@Path("/jobOffer")
	@Produces("application/json")
	public List<JobOffer> getAllJobOffers() {
		List<JobOffer> offers = new ArrayList<JobOffer>();

		JobOffer offer1 = new JobOffer();
		offer1.setTitle("Bachelor Thesis at Bosch");
		offer1.setDescription("Write your Bachelor Thesis in the engineering department of Bosch.");
		offers.add(offer1);

		JobOffer offer2 = new JobOffer();
		offer2.setTitle("Master Thesis at Porsche");
		offer2.setDescription("Write your Master Thesis in the development department of Porsche.");
		offers.add(offer2);

		JobOffer offer3 = new JobOffer();
		offer3.setTitle("Summer job");
		offer3.setDescription("Earn money!");
		offers.add(offer3);

		return offers;
    }
}