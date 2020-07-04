package cobanavigasi.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {

    private SettingsViewModel settingsViewModel;
    private LinearLayout set3;
    private LinearLayout tpicker1;

    public SettingsFragment() {

    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_settings, container, false);

        set3 = root.findViewById(R.id.sett3);
        set3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backup = new Intent(getContext(), BackupContent.class);
                startActivity(backup);
            }
        });

        tpicker1 = root.findViewById(R.id.sett2);
        tpicker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timepick = new Intent(getContext(), TimepickerContent.class);
                startActivity(timepick);
            }
        });

        return root;

    }
    }





