package catdelafuente.getcurriculum.curriculummanager.repository;


import catdelafuente.getcurriculum.curriculummanager.model.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CurriculumRepository extends CrudRepository<Curriculum, Long>{



}
