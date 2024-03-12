package catdelafuente.getcurriculum.curriculummanager.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;

@Entity
public class Curriculum implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    private String imageUrl;
    private String videoUrl;
    private String name;
    private String surname;
    private String lastName;
    private String birthDate;
    private String email;
    private String address;
    private String phone;
    private String linkedinUrl;
    private String gitHubUrl;
    private String hobbies;
    private String resume;
    private String softSkills;
    private String hardSkills;
    private String whatAmIdoingNow;
    private String whatAmIStudyNow;

    public Curriculum(){}

    public Curriculum(long id, String imageUrl, String videoUrl, String name, String surname, String lastName, String birthDate, String email, String address, String phone, String linkedinUrl, String gitHubUrl, String hobbies, String resume, String softSkills, String hardSkills, String whatAmIdoingNow, String whatAmIStudyNow) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.linkedinUrl = linkedinUrl;
        this.gitHubUrl = gitHubUrl;
        this.hobbies = hobbies;
        this.resume = resume;
        this.softSkills = softSkills;
        this.hardSkills = hardSkills;
        this.whatAmIdoingNow = whatAmIdoingNow;
        this.whatAmIStudyNow = whatAmIStudyNow;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public String getGitHubUrl() {
        return gitHubUrl;
    }

    public void setGitHubUrl(String gitHubUrl) {
        this.gitHubUrl = gitHubUrl;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    public String getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(String hardSkills) {
        this.hardSkills = hardSkills;
    }

    public String getWhatAmIdoingNow() {
        return whatAmIdoingNow;
    }

    public void setWhatAmIdoingNow(String whatAmIdoingNow) {
        this.whatAmIdoingNow = whatAmIdoingNow;
    }

    public String getWhatAmIStudyNow() {
        return whatAmIStudyNow;
    }

    public void setWhatAmIStudyNow(String whatAmIStudyNow) {
        this.whatAmIStudyNow = whatAmIStudyNow;
    }
}
