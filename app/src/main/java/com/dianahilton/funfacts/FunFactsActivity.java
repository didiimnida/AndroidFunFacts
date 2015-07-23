package com.dianahilton.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class FunFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our View variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.complimentTextView);
        Button showFactButton = (Button) findViewById(R.id.nextButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String compliment = mFactBook.getCompliment();
                //Update the label with our dynamic compliment
                factLabel.setText(compliment);

            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
