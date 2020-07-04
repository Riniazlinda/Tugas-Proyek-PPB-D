package cobanavigasi.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;


public class ThemesFragment extends Fragment {
    Button cek;
    ConstraintLayout layout;
    Button theme[] = new Button[4];

    private ThemesViewModel themesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_themes, container, false);
        layout = root.findViewById(R.id.layout);




        theme[0] = root.findViewById(R.id.buttonSet1);

        theme[1] = root.findViewById(R.id.buttonSet2);

        theme[2] = root.findViewById(R.id.buttonSet3);

        theme[3] = root.findViewById(R.id.buttonSet4);

        cek = root.findViewById(R.id.centang);
        cek.setVisibility(View.INVISIBLE);
        for (int i=0; i<theme.length; i++) {
            final int a = i;
            theme[a].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (theme[a].getText().equals("REFLEXIO DEFAULT")) {
                        layout.setBackgroundResource(R.drawable.backgrthemes);

                    }
                    else if (theme[a].getText().equals("NIGHT SKY")) {
                        layout.setBackgroundResource(R.drawable.theme1);
                        cek.setVisibility(View.VISIBLE);

                    }
                    else if (theme[a].getText().equals("PACIFIC FOREST")) {
                        layout.setBackgroundResource(R.drawable.theme2);
                        cek.setVisibility(View.VISIBLE);

                    }
                    else if (theme[a].getText().equals("CHOCO AUTUMN")) {
                        layout.setBackgroundResource(R.drawable.theme3);
                        cek.setVisibility(View.VISIBLE);
                    }

                }
            });
            cek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), PremiumActivity.class);
                    startActivity(intent);
                }
            });
        }


        return root;
    }





}
