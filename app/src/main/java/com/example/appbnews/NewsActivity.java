package com.example.appbnews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        RecyclerView recyclerView = findViewById(R.id.recycler_items);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new Adapter());


    }

    class ViewHolderItem extends RecyclerView.ViewHolder{

        TextView name,desc;

        public ViewHolderItem(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_name);
            desc = itemView.findViewById(R.id.item_desc);
        }
    }

    class Adapter extends RecyclerView.Adapter<ViewHolderItem>{

        @NonNull
        @Override
        public ViewHolderItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_item,parent,false);
            return new ViewHolderItem(layout);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderItem holder, int position) {
            Equipo equipo = Dataset.equipoList.get(position);

            holder.name.setText(equipo.name);
            holder.desc.setText(equipo.desc);

        }

        @Override
        public int getItemCount() {
            return Dataset.equipoList.size();
        }
    }
}