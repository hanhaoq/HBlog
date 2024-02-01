package top.hhq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.hhq.entity.CityVisitor;

import java.util.List;

/**
 * @Description: 城市访客数量统计持久层接口
 * @Author: hhq
 * @Date: 2021-02-26
 */
@Mapper
@Repository
public interface CityVisitorMapper {
	List<CityVisitor> getCityVisitorList();

	int saveCityVisitor(CityVisitor cityVisitor);
}
