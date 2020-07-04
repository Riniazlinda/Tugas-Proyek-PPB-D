package cobanavigasi.com;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Note1Activity extends AppCompatActivity {

    ImageButton back;
    Button btn_addnote, plusneg, pluspos, plusdo;
    Button negatif[] = new Button[5];
    Button positif[] = new Button[5];
    Button aktivitas[] = new Button[5];
    Integer a = 0;
    Integer b = 0;
    Integer c = 0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note1);

        back = findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_addnote = findViewById(R.id.noteadd_btn);
        btn_addnote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Note1Activity.this,Note2Activity.class);
                startActivity(intent);
            }
        });

        negatif[0] = findViewById(R.id.neg1_btn);
        negatif[1] = findViewById(R.id.neg2_btn);
        negatif[2] = findViewById(R.id.neg3_btn);
        negatif[3] = findViewById(R.id.neg4_btn);
        negatif[4] = findViewById(R.id.neg5_btn);

        for (int i=0; i<negatif.length; i++) {
            final int x = i;
            negatif[x].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (a==0) {
                        negatif[x].setBackgroundResource(R.drawable.bgr_btn_plus1);
                        a = 1;
                    }
                    else if (a==1) {
                        negatif[x].setBackgroundResource(R.drawable.bgr_btn3);
                        a = 0;
                    }
                }
            });
        }

        plusneg = findViewById(R.id.plusneg);
        plusneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Note1Activity.this, AddFeelActivity.class);
                startActivity(intent);
            }
        });


        positif[0] = findViewById(R.id.pos1_btn);
        positif[1] = findViewById(R.id.pos2_btn);
        positif[2] = findViewById(R.id.pos3_btn);
        positif[3] = findViewById(R.id.pos4_btn);
        positif[4] = findViewById(R.id.pos5_btn);

        for (int i=0; i<positif.length; i++) {
            final int x = i;
            positif[x].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (b==0) {
                        positif[x].setBackgroundResource(R.drawable.bgr_btn_plus2);
                        b = 1;
                    }
                    else if (b==1) {
                        positif[x].setBackgroundResource(R.drawable.bgr_btn4);
                        b = 0;
                    }
                }
            });
        }

        pluspos = findViewById(R.id.pluspos);
        pluspos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Note1Activity.this, AddFeelActivity.class);
                startActivity(intent);
            }
        });

        aktivitas[0] = findViewById(R.id.do1_btn);
        aktivitas[1] = findViewById(R.id.do2_btn);
        aktivitas[2] = findViewById(R.id.do3_btn);
        aktivitas[3] = findViewById(R.id.do4_btn);
        aktivitas[4] = findViewById(R.id.do5_btn);

        for (int i=0; i<aktivitas.length; i++) {
            final int x = i;
            aktivitas[x].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (c==0) {
                        aktivitas[x].setBackgroundResource(R.drawable.bgr_btn_plus3);
                        c = 1;
                    }
                    else if (c==1) {
                        aktivitas[x].setBackgroundResource(R.drawable.bgr_btn5);
                        c = 0;
                    }
                }
            });
        }

        plusdo = findViewById(R.id.plusdo);
        plusdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Note1Activity.this, DoingActivity.class);
                startActivity(intent);
            }
        });

    }
}