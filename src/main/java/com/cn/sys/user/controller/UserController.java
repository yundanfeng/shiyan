package com.cn.sys.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.sys.user.pojo.User;
import com.cn.sys.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
  @Resource
  private UserService userService;

  @RequestMapping("/showUser")
  public String toIndex(HttpServletRequest request,Model model){
      int userId = Integer.parseInt(request.getParameter("id"));
      User user = this.userService.getUserById(userId);
      model.addAttribute("user", user);
      return "showUser";
  }
}  