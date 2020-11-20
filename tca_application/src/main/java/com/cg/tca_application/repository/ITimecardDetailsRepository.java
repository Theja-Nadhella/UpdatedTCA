package com.cg.tca_application.repository;
import java.util.List;
import com.cg.tca_application.entities.TimecardDetails;

public interface ITimecardDetailsRepository {
	public TimecardDetails findTimecardDetailsById(int projectId);
	public void addTimecardDetails(TimecardDetails timecard);
	public  List<TimecardDetails> findTimecardDetailsByEmployeeId(long employeeId);
	public  void updateTimecardStatus(TimecardDetails timecard,String timecardStatus);
	public void beginTransaction();
	public void commitTransaction();
}
