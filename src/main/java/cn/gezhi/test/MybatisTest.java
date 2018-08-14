package cn.gezhi.test;

import cn.gezhi.mapper.UserMapper;
import cn.gezhi.po.Order;
import cn.gezhi.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MybatisTest {
    public static void main(String[] args) {

        //使用类路径下的资源文件进行SqlSessionFactory的构建
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        //使用合理描述参数和返回值的接口
        UserMapper mapper = session.getMapper(UserMapper.class);
        Logger logger =LogManager.getLogger(MybatisTest.class);
        ((Logger) logger).debug("开始操作");
//        int i = mapper.insertUser(new User(null, "杨二狗", 32, "女"));
        Order order = mapper.selectOrder(2);
        System.out.println(order);
               session.commit();
                session.close();
//        if (i>0){
//            System.out.println("新增成功");
//        }else{
//            System.out.println("新增失败");
//        }


        //调用接口的方法，进行集合的遍历，输出集合
//        List<User> list = mapper.getAll();
//        for (User user1 : list) {
//            System.out.println(user1);
//                                 }
//          //通过ID获取表单数据
//            User user= mapper.selectUserById(2);
//            System.out.println(user);
//        //通过ID删除表单数据
//        int del = mapper.del(7);
//           System.out.println("皮皮虾");
//        int i = mapper.insertUser(new User(null, "杨二狗", 32, "女"));
//        System.out.println(i);
//
//        session.commit();
//        session.close();
//        System.out.println("jifgyhdryhrdfyhderyhrdf");

        //通过id更新数据
//        int i1 = mapper.updateUser(new User(2, "李大海", 22, "男"));
//        System.out.println(i1);
//                session.commit();
//        session.close();
//        System.out.println("jifgyhdryhrdfyhderyhrdf");

    }
    }

