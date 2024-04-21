package top.jonakls.schoolapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity(name = "students")
@Table(name = "students")
public class StudentModel {

    @Id
    private String id;

    private String name;
    private String email;
    private String phone;

    public StudentModel(String id) {
        this.id = id;
    }

    public StudentModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
