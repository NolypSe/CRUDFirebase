package com.example.crudfirebase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel, MainAdapter.myViewHolder> {

    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options){
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel model) {
    holder.nombre.setText(model.getNombre());
    holder.apellido.setText(model.getApellido());
    holder.email.setText(model.getEmail());

    Glide.with(holder.img.getContext())
            .load(model.getImgUrl())
            .placeholder(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark)
            .circleCrop()
            .error(com.google.firebase.database.R.drawable.common_google_signin_btn_icon_dark_normal)
            .into(holder.img);
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item, parent, false );
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        CircleImageView img;
        TextView nombre, apellido, email;

        public myViewHolder(@NonNull View itemView){
            super(itemView);

            img = itemView.findViewById(R.id.img1);
            nombre = itemView.findViewById(R.id.txtNombre);
            apellido = itemView.findViewById(R.id.txtApellido);
            email = itemView.findViewById(R.id.emailText);
        }
    }
}
