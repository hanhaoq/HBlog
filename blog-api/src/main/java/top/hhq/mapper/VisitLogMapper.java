package top.hhq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.hhq.entity.VisitLog;
import top.hhq.model.dto.VisitLogUuidTime;

import java.util.List;

/**
 * @Description: 访问日志持久层接口
 * @Author: hhq
 * @Date: 2020-12-04
 */
@Mapper
@Repository
public interface VisitLogMapper {
	List<VisitLog> getVisitLogListByUUIDAndDate(String uuid, String startDate, String endDate);

	List<VisitLogUuidTime> getUUIDAndCreateTimeByYesterday();

	int saveVisitLog(VisitLog log);

	int deleteVisitLogById(Long id);

	int countVisitLogByToday();
}
