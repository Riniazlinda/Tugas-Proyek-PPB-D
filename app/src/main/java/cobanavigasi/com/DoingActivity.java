package cobanavigasi.com;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class DoingActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Button back_btn, notsave_btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doing);

        viewPager = findViewById(R.id.viewPager1);
        tabLayout = findViewById(R.id.tablayout1);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab3Fragment(), "Activities");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        back_btn = findViewById(R.id.noteclose);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        notsave_btn = findViewById(R.id.notsave);
        notsave_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
