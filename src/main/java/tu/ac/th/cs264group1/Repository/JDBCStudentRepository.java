package tu.ac.th.cs264group1.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tu.ac.th.cs264group1.Model.Student;

import java.util.List;

@Repository
public class JDBCStudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save (Student user){
        String sql = "INSERT INTO studentinfo (date,nameTitle ,studentFirstname,studentLastname,studentId,studentYear," +
                "studentField,addressNumber,moo,tumbol,amphur,province,postalCode,mobilePhone,phone,advisor,subject,teacher,center,cause)" +
                " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql ,user.getDate(),user.getNameTitle(),user.getStudentFirstName(),user.getStudentLastName(),user.getStudentId(),
        user.getStudentYear(),user.getStudentField(),user.getAddressNumber(),user.getMoo(),user.getTumbol(),user.getAmphur(),user.getProvince(),
        user.getPostalCode(),user.getMobilePhone(),user.getPhone(),user.getAdvisor(),user.getSubject(),user.getTeacher(),user.getCenter(),user.getCause());
    }

    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM studentinfo";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}
