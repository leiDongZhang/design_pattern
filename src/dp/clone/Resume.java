package dp.clone;

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public void setWorkExperience(String workDate,String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public Resume(String name) {
        this.name = name;
        workExperience=new WorkExperience();
    }


    public Resume(WorkExperience workExperience) {
        try {
            this.workExperience =(WorkExperience) workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    public void setPersionInfo(String sex, String age){
        this.sex=sex;
        this.age=age;
    }

    public void dispaly(){
        System.out.println(name+sex+age);
        System.out.println("工作经历"+workExperience.getWorkDate()+workExperience.getCompany());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume obj=new Resume(this.workExperience);
        obj.name=this.name;
        obj.sex=this.sex;
        obj.age=this.age;
        return obj;
    }
}
