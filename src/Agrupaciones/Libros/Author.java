package Agrupaciones.Libros;

public class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}



