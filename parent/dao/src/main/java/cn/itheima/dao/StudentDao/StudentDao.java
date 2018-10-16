package cn.itheima.dao.StudentDao;

import com.itheima.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface StudentDao {

@Select("select * from student")
    List<Student> findAll();
}
