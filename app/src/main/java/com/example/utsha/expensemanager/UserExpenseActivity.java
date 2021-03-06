package com.example.utsha.expensemanager;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;

import sql.databasehelper;
import usermodel.User;

public class UserExpenseActivity extends AppCompatActivity {

    private databasehelper databaseHelper;

    private AppCompatTextView nameTextView;
    private AppCompatTextView incomeTextView;
    private AppCompatTextView savingTextView;
    private AppCompatTextView budgetTextView;
    private AppCompatTextView expenseTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_expense);

        this.nameTextView = (AppCompatTextView) findViewById(R.id.textViewName);
        this.incomeTextView = (AppCompatTextView) findViewById(R.id.textViewIncome);
        this.savingTextView = (AppCompatTextView) findViewById(R.id.textViewSaving);
        this.budgetTextView = (AppCompatTextView) findViewById(R.id.textViewBudget);
        this.expenseTextView = (AppCompatTextView) findViewById(R.id.textViewExpense);

        databaseHelper = new databasehelper(this);

        User user = databaseHelper.getUser(getIntent().getExtras().getString("EMAIL"),getIntent().getExtras().getString("PASSWORD"));

        nameTextView.setText(user.getName());
        incomeTextView.setText("Income: " + Long.toString(user.getIncome()));
        savingTextView.setText("Savings: " + Long.toString(user.getSavings()));
        budgetTextView.setText("Budget: " + Long.toString(user.getBudget()));
        expenseTextView.setText("Expense: " + Long.toString(user.getExpense()));
    }
}
