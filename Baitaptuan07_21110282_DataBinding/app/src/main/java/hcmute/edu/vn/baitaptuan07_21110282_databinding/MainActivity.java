package hcmute.edu.vn.baitaptuan07_21110282_databinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import hcmute.edu.vn.baitaptuan07_21110282_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private UserModel userModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        userModel = new UserModel("Khanh", "Quy");
        binding.setUser(userModel);
        // thêm để cập nhật
        userModel.setFirstName("Vinh");
        userModel.setLastName("Hoang");
    }
}