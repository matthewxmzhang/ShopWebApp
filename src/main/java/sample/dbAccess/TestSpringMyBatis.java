package sample.dbAccess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.model.User;
import sample.service.FooService;

public class TestSpringMyBatis {


    public static void main(String[] args){

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring/datasource-config.xml","spring/mvc-core-config.xml");

       // SqlSessionFactory sqlfactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");

        //SqlSession session = sqlfactory.openSession();

        FooService fooService = (FooService)ctx.getBean("fooService");
        User user = fooService.doSomeBusinessStuff(1);
        System.out.println(user.getPassword());


//        try {
//            BlogMapper mapper = session.getMapper(BlogMapper.class);
//            Blog blog = mapper.selectBlog(101);
//        } finally {
//            session.close();
//        }close

    }


}