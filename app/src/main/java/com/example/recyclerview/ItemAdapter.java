package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    static Context context;
    ArrayList<Item> listItem;



    public ItemAdapter(Context context, ArrayList<Item> listItem){
        this.context = context;
        this.listItem = listItem;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        //gán view
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        //Gán dữ liệu

        Item item = listItem.get(position);
        holder.txtTitle.setText(item.getTitle());
        holder.txtDescription.setText(item.getDescription());
        holder.imgAvatar.setImageResource(item.getImage());
        holder.txtCategory.setText(item.getCategory());
    }

    @Override
    public int getItemCount() {
        return listItem.size(); // trả item tại vị trí postion
    }

    public void deleteItem(int position) {
        listItem.remove(position);
        notifyItemRemoved(position);

    }

    public Context getContext() {
        return ItemAdapter.context;
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgAvatar;
        TextView txtTitle,txtDescription,txtCategory;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            //ánh xạ view
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtCategory = itemView.findViewById(R.id.txtCategory);

        }
    }
}
