package cn.itheima.Controller;

import com.itheima.Student;
import com.itheima.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class studentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(path = "student")
    public String findAll(Model model){
        System.out.println("11111111");
        List<Student> list = studentService.findAll();
        model.addAttribute("list",list);
        System.out.println(list);
        return "list";
    }
}
