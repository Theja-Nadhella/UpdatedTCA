package com.cg.tca_application.services;

import com.cg.tca_application.entities.TimecardDetails;
import java.util.List;

public interface ITimecardDetailsService {
	public void addTimecardDetails(TimecardDetails timecard);
	public  void updateTimecardStatus(TimecardDetails timecard,String timecardStatus);
	//public List<TimecardDetails> viewTimecardDetailsByEmployeeId(long employeeId);
}
