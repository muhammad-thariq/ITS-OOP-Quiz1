public class Q13ComputerAccount {
    
    // properties/fields
    private String realName;
    private String userName;
    private String password;

    // constructor
    public Q13ComputerAccount(String realName, String userName, String password) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }
    
    // getters
    private String getRealName() {
        return realName;
    }
    private String getUserName() {
        return userName;
    }   
    private String getPassword() {
        return password;
    }

    // setters
    private void setPassword(String password) {
        this.password = password;
    }

    // methods
    public void printRealName() {
        System.out.println("Real Name: " + getRealName());
    }
    public void printUserName() {
        System.out.println("User Name: " + getUserName());   
    }
    public void printPassword() {
        System.out.println("Password :" + getPassword());
    }

    public void changePassword(String newPassword) {
        setPassword(newPassword);
    }
}