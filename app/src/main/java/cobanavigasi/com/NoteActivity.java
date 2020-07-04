package cobanavigasi.com;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NoteActivity extends AppCompatActivity {

    Button skip, close, calen;
    Button mood[] = new Button[5];
    Integer x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        close = findViewById(R.id.noteclose);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        calen = findViewById(R.id.ubahdate);
        calen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new DatePickerFragment();
                newFragment.show(getFragmentManager(),"Date Picker");
            }
        });

        skip = findViewById(R.id.skipnote);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NoteActivity.this, Note1Activity.class);
                startActivity(intent);
            }
        });

        mood[0] = findViewById(R.id.happy_btn);
        mood[1] = findViewById(R.id.good_btn);
        mood[2] = findViewById(R.id.neutral_btn);
        mood[3] = findViewById(R.id.bad_btn);
        mood[4] = findViewById(R.id.awful_btn);

        for (int i=0; i<mood.length; i++) {
            final int a = i;
            mood[a].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mood[a].getText().equals("Happy") && x==0) {
                        mood[a].setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icmood1a,0, 0);
                    }
                    else if (mood[a].getText().equals("Good")) {
                        mood[a].setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icmood2a, 0, 0);
                    }
                    else if (mood[a].getText().equals("Neutral")) {
                        mood[a].setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icmood3a, 0, 0);
                    }
                    else if (mood[a].getText().equals("Bad")) {
                        mood[a].setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icmood4a, 0, 0);
                    }
                    else if (mood[a].getText().equals("Awful")) {
                        mood[a].setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.icmood5a, 0, 0);
                    }

                    Intent intent = new Intent(NoteActivity.this, Note1Activity.class);
                    startActivity(intent);
                }
            });
        }

    }
}
