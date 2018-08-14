package cn.gezhi.hanlder;



import cn.gezhi.po.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class MyHandler implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<User> list=new ArrayList<User>();
//        list.add(new User("张三",20,'男'));
//        list.add(new User("楪祈",32,'女'));
        //创建md对象准备填充数据，设置视图；
        ModelAndView mav=new ModelAndView();
        //填充数据
        mav.addObject("userList",list);
        //设置跳转视图
        mav.setViewName("show");
        return  mav;
    }
}
