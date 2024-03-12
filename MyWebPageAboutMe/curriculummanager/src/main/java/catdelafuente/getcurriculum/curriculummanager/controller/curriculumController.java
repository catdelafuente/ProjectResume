package catdelafuente.getcurriculum.curriculummanager.controller;


import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class curriculumController {

    @RequestMapping("/")
    public String mainPage(){
        return "Hi";
    }

~~
}
