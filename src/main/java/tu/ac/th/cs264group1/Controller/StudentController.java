package tu.ac.th.cs264group1.Controller;
import tu.ac.th.cs264group1.Model.Student;
import tu.ac.th.cs264group1.Repository.JDBCStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value={"users"})
public class StudentController {
    @Autowired
    private JDBCStudentRepository studentDao;

    @RequestMapping
    public void addStudent(@RequestBody Student user) {

        studentDao.save(user);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

}
