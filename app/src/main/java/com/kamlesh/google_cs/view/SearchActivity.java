package com.kamlesh.google_cs.view;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.kamlesh.google_cs.R;


public class SearchActivity extends AppCompatActivity {

    String query="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ((EditText)findViewById(R.id.tv_query)).setText("India");
    }

    public void Go(View view) {
        Intent intent=new Intent(SearchActivity.this,ImageListActivity.class);

        if(((EditText)findViewById(R.id.tv_query)).getText().toString().equals("")){
            Snackbar.make(findViewById(android.R.id.content),"please enter query to search",Snackbar.LENGTH_LONG).show();
            return;
        }
        query=((EditText)findViewById(R.id.tv_query)).getText().toString();
        intent.putExtra("query",query);
        startActivity(intent);
    }
}
