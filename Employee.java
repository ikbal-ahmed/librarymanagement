package coulibrary.project;

public class Employee {

    public Employee(String id, String name, String sex, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address=address;
        this.phone=phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress(){
        return address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    @Override
    public String toString() {
        return new String(id+ name  + sex + email );
    }

    String id;
    String name, sex, address, phone, email;
    int count;
}
