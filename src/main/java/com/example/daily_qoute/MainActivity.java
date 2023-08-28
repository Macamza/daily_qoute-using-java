package com.example.daily_qoute;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private String[] quotes = {
            "First, solve the problem. Then, write the code",
            "Usability’s strength is in identifying problems, while design’s strength is in identifying solutions",
            "Programming is just saying “I have a meeting in an hour so better not start on this yet” to yourself until you die",
            "Don’t compare yourself with anyone in this world…if you do so, you are insulting yourself",
            "We have to stop optimizing for programmers and start optimizing for users",
            "A language that doesn’t affect the way you think about programming is not worth knowing","In programming, if someone tells you “you’re overcomplicating it,” they’re either 10 steps behind you or 10 steps ahead of you.",
            "Measuring programming progress by lines of code is like measuring aircraft building progress by weight","There are only two kinds of languages: the ones people complain about and the ones nobody uses",
            "Linux is only free if your time has no value.","One bad programmer can easily create two new jobs a year","Without requirements or design, programming is the art of adding bugs to an empty text file"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);

        // Get today's quote based on the day of the year
        int dayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
        String quote = quotes[dayOfYear % quotes.length];
        quoteTextView.setText(quote);
    }
}
