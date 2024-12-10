public class Registration {
    //Create Registration Class in which you would have variables such as email,
    // userName and password that have an access scope only within its own class.
    // After creating an object of the class, the user should be able to call methods
    // and in each method separately pass values to set users email, username and password.

    //Requirements:
    //Valid email consider to be only yahoo
    //Valid userName and password cannot be empty and should be of length larger than 6 characters.
    // Also valid passwords cannot contain userName.

    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")){
            this.email = email;
        }else {
            System.out.println("***ERROR***");
            System.out.println("Ensure email is yahoo. Please try again.");
        }
    }

    public void setUserName(String userName) {
        if (userName.isEmpty() || userName.length() <= 6) {
            System.out.println("***ERROR***");
            System.out.println("Valid Username cannot be empty and should be of length larger than 6 characters. Please try again.");
        }else {
            this.userName = userName;
        }
    }

    public void setPassword(String password) {
        if (password.isEmpty() || password.length() <= 6 || this.userName != null && password.contains(this.userName)) {
            System.out.println("***ERROR***" );
            System.out.println("Valid Password cannot be empty, should be of length larger than 6 characters, and cannot contain UserName. Please try again.");
        }else {
            this.password = password;
        }

    }


    public void printInfo() {
        System.out.println();
        System.out.println("Email: "+ email);
        System.out.println("Username: "+ userName);
        System.out.println("Password: "+ password);
    }
}

class RegistrationTester{
    public static void main(String[] args) {
        Registration registration = new Registration();

        registration.setEmail("email@yahoo");
        registration.setUserName("password");
        registration.setPassword("password");

        registration.printInfo();


    }
}
