package umn.ac.id.uts_26656;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button Login;
    private EditText Username;
    private EditText Password;
    private EditText Announcement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        getSupportActionBar().hide();
        Login = (Button) findViewById(R.id.sign_in_button);
        Username = (EditText) findViewById(R.id.username_bar);
        Password = (EditText) findViewById(R.id.password_bar);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = Username.getText().toString();
                String password = Password.getText().toString();

                if (username.equals("uasmobile") && password.equals("uasmobilegenap")) {
                    Intent intent = new Intent(LoginActivity.this, Library.class);
                    startActivity(intent);
                } else {
                    Announcement.setText("ERROR!!!");
                }
            }
        });
    }
}