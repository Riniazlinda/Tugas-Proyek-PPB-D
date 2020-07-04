package cobanavigasi.com.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cobanavigasi.com.CalendarActivity;
import cobanavigasi.com.R;
import cobanavigasi.com.RecyclerViewAdapter;
import cobanavigasi.com.itemQuest;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button btnCal;

    private RecyclerView myrecylerview;
    private List<itemQuest> lstQuest;


    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        btnCal = root.findViewById(R.id.btn_cal);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CalendarActivity.class);
                startActivity(intent);
            }
        });

        myrecylerview = (RecyclerView) root.findViewById(R.id.quest_recycler);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstQuest);
        myrecylerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecylerview.setAdapter(recyclerAdapter);

        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstQuest = new ArrayList<>();
        lstQuest.add(new itemQuest("25","mar","who is your role model?","yas"));
        lstQuest.add(new itemQuest("26","mar","what is the meaning of life?","yas"));
        lstQuest.add(new itemQuest("27","mar","would you be able to love one person for life?", "yas"));
        lstQuest.add(new itemQuest("28","mar","what can you do to be happier every day?","yas"));
        lstQuest.add(new itemQuest("29","mar","do you have any phobias?","yas"));
        lstQuest.add(new itemQuest("30","mar","what can you do to grow professionally?","yas"));
        lstQuest.add(new itemQuest("31","mar","how do you like to spend your weekends?","yas"));
        lstQuest.add(new itemQuest("01","mar","how do you face difficulties?","yas"));
        lstQuest.add(new itemQuest("02","mar","I am grateful to...","yas"));
        lstQuest.add(new itemQuest("03","mar","do you like your hometown? why?","yas"));
        lstQuest.add(new itemQuest("04","mar","what can cheer you up?","yas"));
        lstQuest.add(new itemQuest("05","mar","are you responsible person?","yas"));

    }
}
