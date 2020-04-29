import com.lagou.edu.controller.ResumeController;
import com.lagou.edu.mapper.ResumeMapper;
import com.lagou.edu.service.ResumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestJpa {

    @Autowired
    private ResumeService resumeService;

    @Autowired
    private ResumeController resumeController;

//    @Test
//    public void  test(){
//        System.out.println(resumeController.login("张三"));
//    }
}
