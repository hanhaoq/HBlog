package top.hhq.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hhq.entity.User;
import top.hhq.model.vo.Result;
import top.hhq.service.UserService;

/**
 * @Description: 账号后台管理
 * @Author: hhq
 * @Date: 2023-01-31
 */
@RestController
@RequestMapping("/admin")
public class AccountAdminController {
	@Autowired
	UserService userService;

	/**
	 * 账号密码修改
	 */
	@PostMapping("/account")
	public Result account(@RequestBody User user, @RequestHeader(value = "Authorization", defaultValue = "") String jwt) {
		boolean res = userService.changeAccount(user, jwt);
		return res ? Result.ok("修改成功") : Result.error("修改失败");
	}
}
