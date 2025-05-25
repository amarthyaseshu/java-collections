import java.util.HashSet;
import java.util.Set;

public class DoubleBraceInit {

    public static void main(String[] args) {
        // dONT USE In prod, use only for testing
        Set<String> userRoles=new HashSet<>(){

            {
                add("Admin");
                add("User");

            }
        };
        System.out.println(userRoles);
    }
}
