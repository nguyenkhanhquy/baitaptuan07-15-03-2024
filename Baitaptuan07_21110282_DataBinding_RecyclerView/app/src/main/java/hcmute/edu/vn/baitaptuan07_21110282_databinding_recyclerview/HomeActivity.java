package hcmute.edu.vn.baitaptuan07_21110282_databinding_recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import hcmute.edu.vn.baitaptuan07_21110282_databinding_recyclerview.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity implements ListUserAdapter.OnItemClickListener {
    public ObservableField<String> title = new ObservableField<>();
    private ListUserAdapter listUserAdapter;
    private ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        title.set("Ví dụ về DataBinding cho RecyclerView");
        binding.setHome(this);
        setData();
        binding.rcView.setLayoutManager(new LinearLayoutManager(this));
        binding.rcView.setAdapter(listUserAdapter);

        listUserAdapter.setOnItemClickListener(this);
    }
    private void setData() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            User user = new User();
            user.setFirstName("Quy " + i);
            user.setLastName("Nguyễn " + i);
            userList.add(user);
        }
        listUserAdapter = new ListUserAdapter(userList);
    }

    public void itemClick(User user) {
        Toast.makeText(this, "bạn vừa click", Toast.LENGTH_SHORT).show();
    }
}