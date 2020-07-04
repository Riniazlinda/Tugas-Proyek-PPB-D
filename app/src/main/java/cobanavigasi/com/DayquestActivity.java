package cobanavigasi.com;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import cobanavigasi.com.ui.home.HomeFragment;

public class DayquestActivity extends AppCompatActivity {

    Button btn_quest, mood;
    EditText jawaban;
    TextView tanggal, pertanyaan;
    DatabaseReference database;
    HomeFragment home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questday_activity);

        database = FirebaseDatabase.getInstance().getReference();

        tanggal = findViewById(R.id.tgl_quest);
        //tanggal.setText();
        pertanyaan = findViewById(R.id.quest);
        jawaban = findViewById(R.id.answerqu);
        mood = findViewById(R.id.mood_quest);
        btn_quest = findViewById(R.id.answer_btn);
        btn_quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                database.child("pertanyaan");
                String jawab = jawaban.getText().toString();
                database.setValue(jawab);

                //home = new HomeFragment();
                //loadFragment(home);
            }
        });


    }

    public void loadFragment(Fragment nmFragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, nmFragment);
        ft.addToBackStack(fm.toString());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }
}
