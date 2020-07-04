package cobanavigasi.com;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Note2Activity extends AppCompatActivity {
    private ImageButton back;
    private Button bold, italic, music, image, notesave;
    private DatabaseReference database;
    private EditText headline, edit_note, tags;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note2);

        database = FirebaseDatabase.getInstance().getReference();

        back = findViewById(R.id.back1_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bold = findViewById(R.id.bold);
        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Note2Activity.this, PremiumActivity.class);
                startActivity(intent);
            }
        });

        italic = findViewById(R.id.italic);
        italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Note2Activity.this, PremiumActivity.class);
                startActivity(intent);
            }
        });

        music = findViewById(R.id.music_btn);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Note2Activity.this, PremiumActivity.class);
                startActivity(intent);
            }
        });

        headline = findViewById(R.id.headline);
        edit_note = findViewById(R.id.editnote);
        tags = findViewById(R.id.edittag);

        notesave = findViewById(R.id.savenote_btn);
        notesave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String head = headline.getText().toString();
                String note = edit_note.getText().toString();
                String tag = tags.getText().toString();

                submitNote(new Notes(head.toLowerCase(),note.toLowerCase(),tag.toLowerCase()));

            }
        });
    }
    private void submitNote(Notes note){
        database.child("note").push().setValue(note);
    }
}