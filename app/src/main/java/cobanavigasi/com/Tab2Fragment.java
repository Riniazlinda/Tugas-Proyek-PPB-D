package cobanavigasi.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Tab2Fragment extends Fragment {

    Button positive[] = new Button[12];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tab2, container, false);

        positive[0] = root.findViewById(R.id.pluspos2);
        positive[1] = root.findViewById(R.id.post1_btn);
        positive[2] = root.findViewById(R.id.post2_btn);
        positive[3] = root.findViewById(R.id.post3_btn);
        positive[4] = root.findViewById(R.id.post4_btn);
        positive[5] = root.findViewById(R.id.post5_btn);
        positive[6] = root.findViewById(R.id.post6_btn);
        positive[7] = root.findViewById(R.id.post7_btn);
        positive[8] = root.findViewById(R.id.post8_btn);
        positive[9] = root.findViewById(R.id.post9_btn);
        positive[10] = root.findViewById(R.id.post10_btn);
        positive[11] = root.findViewById(R.id.post11_btn);

        for (int i=0; i<positive.length; i++) {
            final int n = i;
            positive[n].setOnClickListener(new View.OnClickListener() {
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