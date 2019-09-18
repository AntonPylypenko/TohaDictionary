package com.example.antonpylypenko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pass;
    private Button btn;

    private String[] gairaigoWords = {
            "アベック - romantic couple",
            "アフターサービス - after service",
            "アイドル - (teen) idol, pop star",
            "アイス - ice, also used as a shortened form of ice cream",
            "アイスクリーム - ice cream",
            "アイゼン - crampons",
            "アメフト - American football",
            "アメリカンドッグ - corn dog",
            "アニメ - animation, animated cartoons or films",
            "アニソン - an anime song, most often the theme",
            "アンケート - questionnaire, survey",
            "アンニュイ - ennui, boredom",
            "アンサー - reply to a question, solution to a problem",
            "アンチ - hater, anti-fan",
            "アパート - apartment (US), flat (UK), though apāto are usually in small two-story wood-structure buildings, not multistory complexes as in the US usage"}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Create and set up adapter
    ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, players)
    setListAdapter(adapter);

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        android.widget.Toast.makeText(this, getListView().getItemAtPosition(position).toString());
    }


    public void addListenerOnButton(){
        pass = (EditText) findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override

        }
        );
    }

}
