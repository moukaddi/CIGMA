package ma.pfe.dtos;


public class StudentIdDTO {
    private Long id;
    private String code;

    public StudentIdDTO(Long id, String code) {
        this.id = id;
        this.code = code;
    }

    public StudentIdDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
