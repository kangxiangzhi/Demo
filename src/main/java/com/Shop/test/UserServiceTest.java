package com.Shop.test;

import com.Shop.Controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Created by Administrator on 2016/3/21 0021.
 */
public class UserServiceTest {
    @Test
    public void test() {
        ApplicationContext ctx = new FileSystemXmlApplicationContext(
                "src/main/webapp/WEB-INF/applicationContext.xml");
        UserController controller = ctx.getBean(UserController.class);
        controller.registe();
    }
}
