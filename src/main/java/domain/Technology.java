package domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "technology")
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "technology")
    private transient List<Employee> employeeList;

    public Technology(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Technology() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
