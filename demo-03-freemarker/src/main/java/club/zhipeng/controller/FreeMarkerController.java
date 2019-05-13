package club.zhipeng.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import club.zhipeng.bean.User;

@Controller
@RequestMapping("/home")
public class FreeMarkerController {

    @RequestMapping("index1")
    public ModelAndView Add(HttpServletRequest request, HttpServletResponse response) {
        
        User user = new User();
        user.setUsername("<h2>小明=========================================================></h2>");
        user.setPassword("<a href='https://www.hao123.com/'>百度</a>");
        User user2 = new User();
        user2.setUsername("lucian");
        user2.setPassword("123");
        
        List<User> userList = new ArrayList<User>();
        userList.add(user);
        userList.add(user2);
        ModelAndView mav = new ModelAndView("wel");
        mav.addObject("userList", userList);
        return mav;
    }

    @RequestMapping("index2")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("title", "网站标题");
        //说明：在这里可以控制不生成静态htm
        mav.addObject("CREATE_HTML", false);
        return mav;
    }
}