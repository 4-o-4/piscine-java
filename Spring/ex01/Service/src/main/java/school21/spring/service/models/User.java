package school21.spring.service.models;

public class User {
    private int id;
    private String email;

    public User() {
    }

    public User(String email) {
        this.email = email;
    }

    public User(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User {id: " + id + " email: '" + email + "'}";
    }
}
