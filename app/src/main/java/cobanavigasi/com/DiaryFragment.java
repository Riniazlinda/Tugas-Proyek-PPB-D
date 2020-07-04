package cobanavigasi.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class DiaryFragment extends Fragment {

    private DiaryViewModel diaryViewModel;
    private Button btn, btnCal;
    private LinearLayout addnote;



    public DiaryFragment() {

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.diary_fragment, container, false);
        btnCal = root.findViewById(R.id.btn_cal);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CalendarActivity.class);
                startActivity(intent);
            }
        });

        addnote = root.findViewById(R.id.add_note);
        addnote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent note = new Intent( getContext(), NoteActivity.class);
                startActivity(note);
            }
        });

        return root;

    }



}


