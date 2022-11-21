package com.example.recyclerviewcomponents.message;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class MessagesActivity extends AppCompatActivity {

    public ArrayList<Message> messages;
    public RecyclerView messagesRv;
    public MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        getSupportActionBar().setTitle("Messages");
        setupData();
        setupMessageRvList();
    }

    public void setupData() {
        messages = new ArrayList<>();
        Message aravind = new Message();
        aravind.messageId = 1;
        aravind.name = "Aravind";
        aravind.phoneNumber = "+91 9000540052";
        aravind.messageText = "Hi,Welcome to improve 10X.";
        messages.add(aravind);

        Message ramesh = new Message();
        ramesh.messageId = 2;
        ramesh.name = "Ramesh";
        ramesh.phoneNumber = "+91 9999999999";
        ramesh.messageText = "Hi,Welcome to improve 10X";
        messages.add(ramesh);

        Message ramu = new Message();
        ramu.messageId = 3;
        ramu.name = "";
        ramu.phoneNumber = "+91 9999999991";
        ramu.messageText = "Hi,call me when you see the message";
        messages.add(ramu);

        Message kailash = new Message();
        kailash.messageId = 4;
        kailash.name = "Kailash";
        kailash.phoneNumber = "+91 9999999992";
        kailash.messageText = "-";
        messages.add(kailash);

        Message swiggy = new Message();
        swiggy.messageId = 5;
        swiggy.name = "Swiggy Delivery";
        swiggy.phoneNumber = "+91 99999999993";
        swiggy.messageText = "full address";
        messages.add(swiggy);

        Message delivery = new Message();
        delivery.messageId = 6;
        delivery.name = "Swiggy Delivery";
        delivery.phoneNumber = "+91 9999999993";
        delivery.messageText = "Are you available for this Sunday?\n\nWe can have a and discuss the movie";
        messages.add(delivery);
    }

    public void setupMessageRvList() {
        messagesRv = findViewById(R.id.messages_rv);
        messagesRv.setLayoutManager(new LinearLayoutManager(this));
        messageAdapter = new MessageAdapter();
        messageAdapter.setData(messages);
        messagesRv.setAdapter(messageAdapter);
    }
}