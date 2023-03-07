package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Long save (@RequestBody StudentDTO dto){
        LOGGER.debug("Start Methode Save dto : {}", dto);
        return studentService.save(dto);
    }

    @PutMapping
    public Long update (@RequestBody StudentDTO dto){
        LOGGER.debug("Start Methode update dto : {}", dto);
        return studentService.update(dto);
    }

    @DeleteMapping("/{ids}")
    public Boolean delete (@PathVariable("ids") Long id){
        LOGGER.debug("Start Methode delete id : {}", id);
        return studentService.delete(id);
    }

    @GetMapping
    public List<StudentDTO> selectAll (){
        LOGGER.info("Start Methode selectAll");
        return studentService.selectAll();
    }
}
