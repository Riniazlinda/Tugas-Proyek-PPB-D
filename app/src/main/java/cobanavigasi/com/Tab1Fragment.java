package cobanavigasi.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Tab1Fragment extends Fragment {

    Button negative[] = new Button[12];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_tab1, container, false);

        negative[0] = root.findViewById(R.id.plusneg1);
        negative[1] = root.findViewById(R.id.nega1_btn);
        negative[2] = root.findViewById(R.id.nega2_btn);
        negative[3] = root.findViewById(R.id.nega3_btn);
        negative[4] = root.findViewById(R.id.nega4_btn);
        negative[5] = root.findViewById(R.id.nega5_btn);
        negative[6] = root.findViewById(R.id.nega6_btn);
        negative[7] = root.findViewById(R.id.nega7_btn);
        negative[8] = root.findViewById(R.id.nega8_btn);
        negative[9] = root.findViewById(R.id.nega9_btn);
        negative[10] = root.findViewById(R.id.nega10_btn);
        negative[11] = root.findViewById(R.id.nega11_btn);

        for (int i=0; i<negative.length; i++) {
            final int n = i;
            negative[n].setOnClickListener(new View.OnClickListener() {
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