package com.cn.hnust.controller;

/**
 * Created by Eric on 2016/4/7.
 */
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.Gdline;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
   @Resource
   private IUserService userService;

    @RequestMapping("/index.jsp")
    public String toIndex(HttpServletRequest request,Model model){
       String line_name = request.getParameter("line_name");
       Gdline gdline = this.userService.getLineinfoById(line_name);
        model.addAttribute("gd_line", gdline);
      return "showUser";  }
}
