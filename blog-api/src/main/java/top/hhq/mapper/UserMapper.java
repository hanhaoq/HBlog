package top.hhq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.hhq.entity.User;

/**
 * @Description: 用户持久层接口
 * @Author: hhq
 * @Date: 2020-07-19
 */
@Mapper
@Repository
public interface UserMapper {
	User findByUsername(String username);

	User findById(Long id);

	int updateUserByUsername(String username, User user);
}
