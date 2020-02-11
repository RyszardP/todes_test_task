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

    public Technology(String name) {
        this.name = name;
    }

    private Technology(TechnologyBuilder technologyBuilder) {
        this.id = technologyBuilder.getId();
        this.name = technologyBuilder.getName();
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

    public static class TechnologyBuilder {
        private Long id;
        private String name;

        public TechnologyBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public TechnologyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Technology build() {
            return new Technology(this);


        }
    }
}
