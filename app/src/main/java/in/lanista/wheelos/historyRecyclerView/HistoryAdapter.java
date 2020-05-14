package in.lanista.wheelos.historyRecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import in.lanista.wheelos.HistoryActivity;
import in.lanista.wheelos.R;

import java.util.ArrayList;


public class HistoryAdapter extends RecyclerView.Adapter<HistoryViewHolders> {

    private ArrayList<HistoryObject> dataSetHistory;
    private Context context;


    public HistoryAdapter(ArrayList<HistoryObject> dataSetHistory, HistoryActivity context) {
        this.dataSetHistory=dataSetHistory;
        this.context=context;
    }


    @Override
    public HistoryViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        HistoryViewHolders rcv = new HistoryViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(HistoryViewHolders holder, final int position) {
        holder.rideId.setText(dataSetHistory.get(position).getRideId());
        if(dataSetHistory.get(position).getTime()!=null){
            holder.time.setText(dataSetHistory.get(position).getTime());
        }
    }
    @Override
    public int getItemCount() {
        return this.dataSetHistory.size();
    }

}