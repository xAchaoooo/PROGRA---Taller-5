public class User {
    private String rut;
    private String name;
    private String lastName;
    private String password;
    private User nextUser;

    public User(String rut, String name, String lastName, String password){
        this.lastName = lastName;
        this.name = name;
        this.rut = rut;
        this.password = password;
        this.nextUser = null;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getNextUser(){
        return this.nextUser;
    }

    public void setNextUser(User next){
        this.nextUser = next;
    }
}
