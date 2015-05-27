
package th.co.geniustree.configdatabase.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class dt_Crew implements Serializable{
    @Id
    private Integer id;
    private int pid;
    private String firstname_thai;
    private String firstname_eng;
    private String lastname_thai;
    private String lastname_eng;
    private Date birthday;
    private int age;
    private String sex;
    private String boold;
    private String department;
    private int salary_moth;
    private int salary_day;
    private String status_soilder;
    private String status_married;
    private String status_work;
    private String nationality;
    private String origin;
    private String  phone;
    private String phone_mobile;
    private Date startwork;
    private Date endwork;
    private String picture;
    private String linefigger;
    private String accountbank;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final dt_Crew other = (dt_Crew) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getFirstname_thai() {
        return firstname_thai;
    }

    public void setFirstname_thai(String firstname_thai) {
        this.firstname_thai = firstname_thai;
    }

    public String getFirstname_eng() {
        return firstname_eng;
    }

    public void setFirstname_eng(String firstname_eng) {
        this.firstname_eng = firstname_eng;
    }

    public String getLastname_thai() {
        return lastname_thai;
    }

    public void setLastname_thai(String lastname_thai) {
        this.lastname_thai = lastname_thai;
    }

    public String getLastname_eng() {
        return lastname_eng;
    }

    public void setLastname_eng(String lastname_eng) {
        this.lastname_eng = lastname_eng;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBoold() {
        return boold;
    }

    public void setBoold(String boold) {
        this.boold = boold;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary_moth() {
        return salary_moth;
    }

    public void setSalary_moth(int salary_moth) {
        this.salary_moth = salary_moth;
    }

    public int getSalary_day() {
        return salary_day;
    }

    public void setSalary_day(int salary_day) {
        this.salary_day = salary_day;
    }

    public String getStatus_soilder() {
        return status_soilder;
    }

    public void setStatus_soilder(String status_soilder) {
        this.status_soilder = status_soilder;
    }

    public String getStatus_married() {
        return status_married;
    }

    public void setStatus_married(String status_married) {
        this.status_married = status_married;
    }

    public String getStatus_work() {
        return status_work;
    }

    public void setStatus_work(String status_work) {
        this.status_work = status_work;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone_mobile() {
        return phone_mobile;
    }

    public void setPhone_mobile(String phone_mobile) {
        this.phone_mobile = phone_mobile;
    }

    public Date getStartwork() {
        return startwork;
    }

    public void setStartwork(Date startwork) {
        this.startwork = startwork;
    }

    public Date getEndwork() {
        return endwork;
    }

    public void setEndwork(Date endwork) {
        this.endwork = endwork;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLinefigger() {
        return linefigger;
    }

    public void setLinefigger(String linefigger) {
        this.linefigger = linefigger;
    }

    public String getAccountbank() {
        return accountbank;
    }

    public void setAccountbank(String accountbank) {
        this.accountbank = accountbank;
    }
    
}
