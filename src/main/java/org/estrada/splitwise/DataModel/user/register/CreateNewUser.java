package org.estrada.splitwise.DataModel.user.register;

public class CreateNewUser {
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String confirmPassword;

    public CreateNewUser() {

    }
    public CreateNewUser(String username, String password, String confirmPassword) {
        this.username=username;
        this.password=password;
        this.confirmPassword=confirmPassword;
    }
    public CreateNewUser(String username, String email, String phoneNumber, String password, String confirmPassword) {
        this.username=username;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.password=password;
        this.confirmPassword=confirmPassword;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}

