package top.hhq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.hhq.entity.ScheduleJob;

import java.util.List;

/**
 * @Description: 定时任务持久层接口
 * @Author: hhq
 * @Date: 2020-11-01
 */
@Mapper
@Repository
public interface ScheduleJobMapper {
	List<ScheduleJob> getJobList();

	ScheduleJob getJobById(Long jobId);

	int saveJob(ScheduleJob scheduleJob);

	int updateJob(ScheduleJob scheduleJob);

	int deleteJobById(Long jobId);

	int updateJobStatusById(Long jobId, Boolean status);
}
