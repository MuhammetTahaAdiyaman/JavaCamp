public class UserManager {
    public void signIn(User user) {
        System.out.println(user.getFirstName() + user.getLastName() + " kaydoldu.");
    }

    public void logIn(User user) {
        System.out.println(user.getFirstName() + user.getLastName() + " giriş yaptı.");
    }

    public void logOut(User user) {
        System.out.println(user.getFirstName() + user.getLastName() + " çıkış yaptı.");
    }
}
