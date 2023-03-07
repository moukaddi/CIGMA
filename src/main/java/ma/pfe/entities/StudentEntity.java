package ma.pfe.entities;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class StudentEntity {
    @Id
    @Column(name = "id_student")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name_student")
    private String name;

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
