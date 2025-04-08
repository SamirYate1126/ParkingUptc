package co.edu.uptc.model;

public class User2 {

    private String identityDoc, name,lastName,address,phone,email;

    
    public User2(){
        
    }

    public User2(String identityDoc,String name, String lastName, String address, String phone, String email) {
        this.identityDoc=identityDoc;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public String getIdentityDoc() {
        return identityDoc;
    }

    public void setIdentityDoc(String identityDoc) {
        this.identityDoc = identityDoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User2 [name=" + name + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone
                + ", email=" + email + "]";
    }


}
