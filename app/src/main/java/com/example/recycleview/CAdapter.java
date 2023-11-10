package com.example.recycleview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CAdapter extends RecyclerView.Adapter<CAdapter.CViewHolder> {
    private final LayoutInflater mInflater;
    private List<CModel> itemc;
    private LayoutInflater layoutInflater;
    private Context context;
    final CAdapter.OnItemClickListener listener;

    public CAdapter(List<CModel> itemc, Context context, OnItemClickListener listener) {
        this.mInflater = LayoutInflater.from(context);
        this.itemc = itemc;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CAdapter.CViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.itemc, null);
        return new CAdapter.CViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CViewHolder holder, int position) {
        holder.bindData(itemc.get(position));
    }

    @Override
    public int getItemCount() {
        return itemc.size();
    }

    public void setItems(List<CModel> items){
        itemc = items;
    }

    public interface OnItemClickListener {
        void onItemClick(CModel item);
    }

    public class CViewHolder extends RecyclerView.ViewHolder {
        TextView Cnama, Chp, Cstatus;
        ImageView Avc;
        public CViewHolder(@NonNull View itemview) {
            super(itemview);
            Avc = itemview.findViewById(R.id.Avc);
            Cnama = itemview.findViewById(R.id.Cnama);
            Chp = itemview.findViewById(R.id.Chp);
            Cstatus = itemview.findViewById(R.id.Cstatus);
        }

        public void bindData(final CModel item) {
            Avc.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            Cnama.setText(item.getNama());
            Chp.setText(item.getHp());
            Cstatus.setText(item.getStatus());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
