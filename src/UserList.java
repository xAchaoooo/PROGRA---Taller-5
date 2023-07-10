public class UserList {
    private User head;

    public UserList(){
        this.head = null;
    }

    public void addUser(User newUser){
        if (newUser != null){
            if (this.head == null){
                this.head = newUser;
            } else if (this.head.getNextUser() == null){
                this.head.setNextUser(newUser);
            } else {
                User aux = this.head;
                while (aux.getNextUser() != null){
                    aux = aux.getNextUser();
                }
                aux.setNextUser(newUser);
            }
        }
    }

    public User checkUser(String rut){
        User aux = this.head;
        while (aux != null){
            if (aux.getRut().equalsIgnoreCase(rut)){
                return aux;
            }
            aux = aux.getNextUser();
        }
        return null;
    }

    public boolean checkPassword(User user, String password){
        return user.getPassword().equals(password);
    }

    public void userToString(){
        User aux = this.head;
        while (aux.getNextUser() != null){
            System.out.println(aux.getRut());
            aux = aux.getNextUser();
        }
        System.out.println(aux.getRut());
    }


}
