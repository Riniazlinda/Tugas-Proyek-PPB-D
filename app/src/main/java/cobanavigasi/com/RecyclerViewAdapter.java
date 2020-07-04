package cobanavigasi.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<itemQuest> mData;

    public RecyclerViewAdapter(Context mContext, List<itemQuest> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_quest,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_tanggal.setText(mData.get(position).getTanggal());
        holder.tv_bulan.setText(mData.get(position).getBulan());
        holder.tv_pertanyaan.setText(mData.get(position).getPertanyaan());
        holder.tv_jawaban.setText(mData.get(position).getJawaban());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_pertanyaan;
        private TextView tv_jawaban;
        private TextView tv_tanggal;
        private TextView tv_bulan;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_tanggal = (TextView) itemView.findViewById(R.id.tanggal);
            tv_bulan = (TextView) itemView.findViewById(R.id.bulan);
            tv_pertanyaan = (TextView) itemView.findViewById(R.id.questday);
            tv_jawaban = (TextView) itemView.findViewById(R.id.answer_quest);


        }
    }
}
