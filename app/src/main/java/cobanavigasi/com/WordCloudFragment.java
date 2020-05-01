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

public class WordCloudFragment extends Fragment {

    private WordCloudViewModel wordCloudViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {
        wordCloudViewModel=
                ViewModelProviders.of(this).get(WordCloudViewModel.class);
        View root= inflater.inflate(R.layout.fragment_wordcloud, container, false);
        final TextView textView = root.findViewById(R.id.text_wordcloud);
        wordCloudViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>(){
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
        }
    });
        return root;
    }

}
