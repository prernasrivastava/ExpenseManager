package com.example.utsha.expensemanager;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserExpense extends AppCompatActivity {
    Button mButton;
    EditText mEdit;
    private AppCompatTextView textViewName;
    private AppCompatTextView textViewName1;
    private AppCompatTextView textViewName2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String email= getIntent().getStringExtra("EMAIL");
        setContentView(R.layout.activity_user_expense);
        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit   = (EditText)findViewById(R.id.inputexpense);

    }


   // EditText mEdit;

   // TextView mText;
});
    }
    @SuppressLint("WrongViewCast")
    private void initViews() {
        textViewName = (AppCompatTextView) findViewById(R.id.savings);
        textViewName1 = (AppCompatTextView) findViewById(R.id.income);
        textViewName2 = (AppCompatTextView) findViewById(R.id.budget);
    }
    private void initObjects() {


        String savingsFromIntent = getIntent().getStringExtra("SAVINGS");
        textViewName.setText(savingsFromIntent);
        String savingsFromIntent1 = getIntent().getStringExtra("INCOME");
        textViewName1.setText(savingsFromIntent1);
        String savingsFromIntent2 = getIntent().getStringExtra("BUDGET");
        textViewName2.setText(savingsFromIntent2);

        //getDataFromSQLite();

    }

}