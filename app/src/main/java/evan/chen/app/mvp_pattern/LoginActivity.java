package evan.chen.app.mvp_pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements LoginContract.ILoginView  {
    private LoginPresenter presenter;

    private Button loginButton;
    private EditText loginId;
    private EditText password;
    private TextView loginResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new LoginPresenter(this);

        this.loginButton = (Button) this.findViewById(R.id.logn);
        this.loginId = (EditText) findViewById(R.id.login_id);
        this.password = (EditText) findViewById(R.id.password);
        this.loginResult = (TextView) findViewById(R.id.login_result);

        this.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login(loginId.getText().toString(), password.getText().toString());
            }
        });
    }

    // Override LoginContract.View method
    @Override
    public void onLoginSuccess(String message) {
        this.loginResult.setText(message);
    }

    @Override
    public void onLoginFail(String message) {
        this.loginResult.setText(message);
        this.password.setText("");
    }
}
