package catdelafuente.getcurriculum.curriculummanager.Service;

import catdelafuente.getcurriculum.curriculummanager.model.Curriculum;
import catdelafuente.getcurriculum.curriculummanager.repository.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurriculumService {

    private final CurriculumRepository curriculumrepository;

    @Autowired
    public CurriculumService(CurriculumRepository curriculumrepository) {
        this.curriculumrepository = curriculumrepository;
    }


}
