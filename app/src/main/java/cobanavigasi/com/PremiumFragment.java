package cobanavigasi.com;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class PremiumFragment extends Fragment {

    private PremiumViewModel premiumViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        premiumViewModel =
                ViewModelProviders.of(this).get(PremiumViewModel.class);
        View root = inflater.inflate(R.layout.fragment_premium, container, false);
        final TextView textView = root.findViewById(R.id.text_premium);
        premiumViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
    }




