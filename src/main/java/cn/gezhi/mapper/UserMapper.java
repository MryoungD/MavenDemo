package cn.gezhi.mapper;

import cn.gezhi.po.Order;
import cn.gezhi.po.User;

import java.util.List;

public interface UserMapper {
    //定义接口方法
    List<User> getAll();
    User selectUserById(int id);
    int del(int id);
    int insertUser(User user);
    int updateUser(User user);
    Order selectOrder(int id);
}
