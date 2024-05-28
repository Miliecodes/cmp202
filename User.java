package cmp202;

public abstract class  User{
    String staffNo;

    void uploadResult(String course, float score) { // I used void because it doesn't  return anything
            
    }

    abstract String register();

    public static void main(String[] args) {
        User barka = new User() {
            @Override
            String register() {
                return "";
            }
        };
        barka.uploadResult("CMP202", 70);
        
    }

}