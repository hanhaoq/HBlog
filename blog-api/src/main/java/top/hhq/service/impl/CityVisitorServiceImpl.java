package top.hhq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.hhq.entity.CityVisitor;
import top.hhq.mapper.CityVisitorMapper;
import top.hhq.service.CityVisitorService;

/**
 * @Description: 城市访客数量统计业务层实现
 * @Author: hhq
 * @Date: 2021-02-26
 */
@Service
public class CityVisitorServiceImpl implements CityVisitorService {
	@Autowired
	CityVisitorMapper cityVisitorMapper;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void saveCityVisitor(CityVisitor cityVisitor) {
		cityVisitorMapper.saveCityVisitor(cityVisitor);
	}
}
