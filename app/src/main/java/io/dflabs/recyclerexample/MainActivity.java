package io.dflabs.recyclerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import io.dflabs.recyclerexample.adapters.LanguagesAdapter;
import io.dflabs.recyclerexample.models.DataBase;
import io.dflabs.recyclerexample.models.Language;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.act_main_recycler);
        // To make recycler a vertical list, can be Horizontal, Vertical, even a Grid
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // To add a default animation
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // I don't know why this, but I will search :v
        mRecyclerView.setHasFixedSize(true);

        // Load programming languages
        ArrayList<Language> languages = DataBase.languages();

        // Create the adapter with onClickListener interface and assign it to recycler view
        LanguagesAdapter mLanguagesAdapter = new LanguagesAdapter(languages, this);
        mRecyclerView.setAdapter(mLanguagesAdapter);
    }

    @Override
    public void onClick(View view) {
        // We assign the language object in the adapter
        Language language = (Language) view.getTag();
        Toast.makeText(this, language.getName(), Toast.LENGTH_LONG).show();
    }
}
