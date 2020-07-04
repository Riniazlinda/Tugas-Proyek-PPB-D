package cobanavigasi.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Tab3Fragment extends Fragment {

    Button doing[] = new Button[12];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tab3, container, false);

        doing[0] = root.findViewById(R.id.plusdo1);
        doing[1] = root.findViewById(R.id.doi1_btn);
        doing[2] = root.findViewById(R.id.doi2_btn);
        doing[3] = root.findViewById(R.id.doi3_btn);
        doing[4] = root.findViewById(R.id.doi4_btn);
        doing[5] = root.findViewById(R.id.doi5_btn);
        doing[6] = root.findViewById(R.id.doi6_btn);
        doing[7] = root.findViewById(R.id.doi7_btn);
        doing[8] = root.findViewById(R.id.doi8_btn);
        doing[9] = root.findViewById(R.id.doi9_btn);
        doing[10] = root.findViewById(R.id.doi10_btn);
        doing[11] = root.findViewById(R.id.doi11_btn);

        for (int i=0; i<doing.length; i++) {
            final int n = i;
            doing[n].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getContext(), PremiumActivity.class);
                    startActivity(intent);
                }
            });
        }

        return root;



    }
}