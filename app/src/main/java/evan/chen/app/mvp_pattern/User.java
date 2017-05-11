package evan.chen.app.mvp_pattern;

/**
 * Created by 3758 on 2017/5/11.
 */

public class User {
    public boolean login(String id, String password) {
        if ( id.equals("abc") && password.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
