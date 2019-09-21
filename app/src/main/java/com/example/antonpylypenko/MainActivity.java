package com.example.antonpylypenko;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private EditText pass;
    private Button btn;

    private String[] gairaigoWords = {
        "アベック",
        "アフターサービス",
        "アイドル",
        "アイス",
        "アイスクリーム",
        "アイゼン",
        "アメフト",
        "アメリカンドッグ",
        "アニメ",
        "アニソン",
        "アンケート",
        "アンニュイ",
        "アンサー",
        "アンチ",
        "アパート"};

    private String[] garaigoTranslation = {
        "romantic couple",
        "after service",
        "(teen) idol, pop star",
        "ice, also used as a shortened form of ice cream",
        "ice cream",
        "crampons",
        "American football",
        "corn dog",
        "animation, animated cartoons or films",
        "an anime song, most often the theme",
        "questionnaire, survey",
        "ennui, boredom",
        "reply to a question, solution to a problem",
        "hater, anti-fan",
        "apartment (US), flat (UK), though apāto are usually in small two-story wood-structure buildings, not multistory complexes as in the US usage",

    };

    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, gairaigoWords);
        setListAdapter(mAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getApplicationContext(),
                "Translation " + garaigoTranslation[position], Toast.LENGTH_SHORT).show();
    }


}
