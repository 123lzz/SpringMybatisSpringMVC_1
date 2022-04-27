package com.hand.ssm.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.dao.GoodsDao;
import com.hand.ssm.dao.UserDao;
import com.hand.ssm.dto.Goods;
import com.hand.ssm.dto.User;

@Controller
public class UserController {
    @Autowired
    UserDao userdao;

    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request, HttpServletResponse response){
        String login_id=request.getParameter("login_id");
        String login_pwd=request.getParameter("login_pwd");

//		List<User> users = userdao.selectAll();
//		model.addAttribute("user",users);
//		System.out.println("id="+users.get(0).getId());
//		for(int i = 0;i < users.size();i ++) {
//			if(users.get(i).getId() == login_id && users.get(i).getPwd() == login_pwd)
//				return "Success";
//			//else
//				//return "denglu1";
//		}
        //return "success";


//		User user = new User();
//		user.setId(login_id);
//		user.setPwd(login_pwd);
//
//		User result = userdao.selectByIdAndPwd(user);
//		System.out.println("id="+result.getId());
//		System.out.println("pwd="+result.getPwd());
//		if(result == null) {
//			System.out.println("*******");
//			model.addAttribute("msg","用户名或密码错误！");
//			return "success";
//		}
//		else {
//			model.addAttribute("msg","登陆成功！");
//			return "success";
//		}
//
        User user = userdao.selectById(login_id);
        System.out.println("id="+user.getId());
        System.out.println("pwd="+user.getPwd());
//
//		System.out.println("id="+login_id);
//		System.out.println("pwd="+login_pwd);
//

//		boolean loginType = userService.login(login_id,login_pwd);
//		System.out.println("type="+loginType);
//		if(loginType)
//			return "Success";
//		else
//			return "denglu1";

        //return "denglu1";




//		User user2 = userService.login(login_id, login_pwd);
//		//boolean u =  userService.login(login_id, login_pwd);
//		System.out.println(user2.getId());
//		if (user2 != null) {
//			model.addAttribute("msg", "登录成功");
//			//page = "login_success";
//			return "Success";
//		} else {
//			model.addAttribute("msg", "登录失败");
//			//page = "login_failure";
//			return "denglu1";
//		}


        return "success";



    }

}

