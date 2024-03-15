package hcmute.edu.vn.baitaptuan07_21110282_sharedpreferences_vidu02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtEmail = (TextView) findViewById(R.id.emailHome);
        String email = getEmail();
        if (!email.isEmpty()) {
            txtEmail.setText("Email đăng nhập đã nhớ mật khẩu: " + email);
        }

        Button mEmailSignOutButton = (Button) findViewById(R.id.email_sign_out_button);
        mEmailSignOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLoginDetails();
                startMainActivity();
            }
        });
    }

    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private String getEmail() {
        return new PrefManager(this).getEmail();
    }

    private void clearLoginDetails() {
        new PrefManager(this).clearLoginDetails();
    }
}