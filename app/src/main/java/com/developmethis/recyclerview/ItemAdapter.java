package com.developmethis.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Faizan Ejaz on 2/5/2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<item> itemList;
    Context mContext;
    public ItemAdapter(List<item> itemList, Context mContext) {
        this.itemList = itemList;
        this.mContext = mContext;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcard,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        item tempitem = itemList.get(position);
        holder.tvprice.setText(String.valueOf(tempitem.getIprice()));
        holder.tvno.setText(String.valueOf(tempitem.getIno()));
        holder.tvsize.setText(tempitem.getIsize());
        holder.tvdesc.setText(tempitem.getIdesc());
        holder.tvname.setText(tempitem.getIname());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    // View holder class

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvname,tvno,tvdesc,tvprice,tvsize;
        public ViewHolder(View itemView) {
            super(itemView);

            tvname=(TextView)itemView.findViewById(R.id.itemname);
            tvno=(TextView)itemView.findViewById(R.id.itemnumber);
            tvdesc=(TextView)itemView.findViewById(R.id.itemdesc);
            tvprice=(TextView)itemView.findViewById(R.id.itemprice);
            tvsize=(TextView)itemView.findViewById(R.id.itemsize);
        }
    }

}
