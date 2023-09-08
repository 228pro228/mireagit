package Task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("John", "johngosip1994@gmail.com", 'm');

        System.out.println("Name: " + a1.getName());
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Gender: " + a1.getGender());

        a1.setEmail("newemailforjohn@gmail.com");

        System.out.println("New email: " + a1.getEmail());

        System.out.println("Info: " + a1.toString());

    }
}
