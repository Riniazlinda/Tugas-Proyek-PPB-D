package cobanavigasi.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {

    ImageButton imageButton;
    Button btn_answer, btn_note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        imageButton = findViewById(R.id.back_btn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://stackoverflow.com/questions/4038479/android-go-back-to-previous-activity
                finish();

            }
        });

        btn_answer = findViewById(R.id.btncal1);
        btn_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalendarActivity.this, DayquestActivity.class);
                startActivity(intent);
            }
        });

        btn_note = findViewById(R.id.btncal2);
        btn_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalendarActivity.this, ReadnoteActivity.class);
                startActivity(intent);
            }
        });

    }

}
