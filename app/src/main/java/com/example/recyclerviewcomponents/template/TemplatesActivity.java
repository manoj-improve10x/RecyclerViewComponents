package com.example.recyclerviewcomponents.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewcomponents.R;

import java.util.ArrayList;

public class TemplatesActivity extends AppCompatActivity {

    public ArrayList<Template> messages;
    public RecyclerView templateRv;
    public TemplateAdapter templateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        getSupportActionBar().setTitle("Templates");
        setupData();
        setupTemplateRv();
    }

    public void setupData() {
        messages = new ArrayList<>();

        Template message1 = new Template();
        message1.templateId = 1;
        message1.messageText = "Hi,\nWelcome to Improve 10x";
        messages.add(message1);

        Template message2 = new Template();
        message2.templateId = 2;
        message2.messageText = "Hi, I'm busy. I'll call you later";
        messages.add(message2);

        Template message3 = new Template();
        message3.templateId = 3;
        message3.messageText = "Hi,\ncall me when you see the message";
        messages.add(message3);

        Template message4 = new Template();
        message4.templateId = 4;
        message4.messageText = "-Hi, Please find my contact details \n Name: Viswanath Kumar Sandu \n Company: Improve 10x \n Moblile: +919000540052";
        messages.add(message4);
    }

    public void setupTemplateRv() {
        templateRv = findViewById(R.id.template_rv);
        templateRv.setLayoutManager(new LinearLayoutManager(this));
        templateAdapter  = new TemplateAdapter();
        templateAdapter.setData(messages);
        templateRv.setAdapter(templateAdapter);
    }
}