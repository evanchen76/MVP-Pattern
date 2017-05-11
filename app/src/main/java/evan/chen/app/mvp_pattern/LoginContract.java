package evan.chen.app.mvp_pattern;

/**
 * Created by Evan on 2017/5/11.
 */

public interface LoginContract {
    interface ILoginView  {
        void onLoginSuccess(String message);

        void onLoginFail(String message);
    }

    interface ILoginPresenter {
        void login(String id, String password);
    }
}
