
public class Main {
    public static void main(String[] args) {
        LecturaArchivos l = new LecturaArchivos();
        UserList userList = l.leerArchivoUsuarios();
        UserLogin login = new UserLogin(userList);
    }
}
