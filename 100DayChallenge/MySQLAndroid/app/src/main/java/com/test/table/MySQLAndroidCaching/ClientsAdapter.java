package com.test.table.MySQLAndroidCaching;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//import com.androiddeft.jsonretrofit.beans.Employee;

import com.test.table.MySQLAndroidCaching.pojo.Client;

import java.util.List;

/**
 * Created by Abhi on 23 Sep 2017 023.
 */

public class ClientsAdapter extends RecyclerView.Adapter<ClientsAdapter.CustomViewHolder> {
    private List<Client> clients;

    public ClientsAdapter(List<Client> clients) {
        this.clients = clients;
        //notifyDataSetChanged();
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.client_list, parent, false);


        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Client client = clients.get(position);
        //holder.id.setText(String.format ("%d", client.getId()));
        //holder.id.setText((Integer.toString(client.getId())));
        String id=Integer.toString(client.getId());
        holder.id.setText(id);
        holder.firstName.setText(client.getFirstName());
        holder.lastName.setText(client.getLastName());
        holder.address.setText(client.getAddress());
        holder.phone.setText(client.getPhone());
    }

    @Override
    public int getItemCount() {
        return clients == null ? 0 : clients.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView id, firstName, lastName, address, phone;

        public CustomViewHolder(View view) {
            super(view);
            id = (TextView) view.findViewById(R.id.id);
            firstName = (TextView) view.findViewById(R.id.firstName);
            lastName = (TextView) view.findViewById(R.id.lastName);
            address = (TextView) view.findViewById(R.id.address);
            phone = (TextView) view.findViewById(R.id.phone);
        }
    }

}
