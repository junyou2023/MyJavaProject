package basic.code;

public class Classmate {
       private String gender;
       private String account;
       private String password;
       private String name;

    public Classmate() {
    }

    public Classmate(String gender, String account, String password, String name) {
        this.gender = gender;
        this.account = account;
        this.password = password;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

