package com.cg.tca_application.services;
import com.cg.tca_application.entities.TimecardDetails;
import com.cg.tca_application.repository.TimecardDetailsRepository;
import java.util.List;

public class TimecardDetailsService implements ITimecardDetailsService{
	private TimecardDetailsRepository repo;
	public TimecardDetailsService() {
		repo=new TimecardDetailsRepository();
	}
	@Override
	public void addTimecardDetails(TimecardDetails timecard) {
		repo.addTimecardDetails(timecard);		
	}

	@Override
	public void updateTimecardStatus(TimecardDetails timecard, String timecardStatus) {
		repo.updateTimecardStatus(timecard, timecardStatus);		
	}
}