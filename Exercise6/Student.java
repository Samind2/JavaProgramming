
package Exercise6;
public class Student {
        int studentId;
        String name;
        String surename;
        String username;
        String password;
    
    
        public void register(int studentId, String name, String surname ,String username ,String password) {
            this.studentId = studentId;
            this.name = name;
            this.surename = surename;
            this.username = username;
            this.password = password;
        }
        public boolean login(String username, String password) {
            if(this.username.equals(username)&& this.password.equals(password)){
                return true;
            }else{
                return false;
            }
        }
        public void printStudent() {
            System.out.println("name"+this.name +""+ this.surename);
            System.out.println("Student Id"+this.studentId +""+ this.studentId);
            System.out.println("Username"+this.username);
        }

        public static void main(String[] args) {
            Student std1 = new Student();
            std1.printStudent();
            std1.register(12345, Supanee, Rungsirat, Samind2, 25460627);
            System.out.println("After register");
            std1.printStudent();
            if(std1.login(Samind2, 25460627)) {
                System.out.println("Login Successful");
            }else {
                System.out.println("Login Faild");
            }
        }
    }
    

