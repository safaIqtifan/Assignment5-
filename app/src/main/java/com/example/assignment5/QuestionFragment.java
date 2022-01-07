package com.example.assignment5;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assignment5.Model.ContryModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionFragment extends Fragment {

    int position = 0;
    int countCorrect = 0;
    ArrayList<ContryModel> data;
    ArrayList<String> a;

    Button btn1, btn2, btn3;
    ImageView flagImag;
    TextView questionNum;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_question, container, false);

        btn1 = root.findViewById(R.id.btn1);
        btn2 = root.findViewById(R.id.btn2);
        btn3 = root.findViewById(R.id.btn3);
        questionNum = root.findViewById(R.id.questionNum);
        flagImag = root.findViewById(R.id.flagImage);

        data = new ArrayList<>();
        a = new ArrayList<String>();
        data.add(new ContryModel(1, R.drawable.a, "Saudi Arabia", "Somalia ", "Algeria"));
        data.add(new ContryModel(2, R.drawable.b, "Egypt", "Jordan", "Emirates"));
        data.add(new ContryModel(3, R.drawable.c,  "Emirates","Algeria", "Somalia"));
        data.add(new ContryModel(4, R.drawable.d,  "Libya", "Kuwait","Tunisia"));
        data.add(new ContryModel(5, R.drawable.e, "Emirates", "Jordan", "Somalia"));
        data.add(new ContryModel(6, R.drawable.f, "Morocco", "Kuwait", "Tunisia"));
        data.add(new ContryModel(7, R.drawable.g, "Libya", "Morocco", "Jordan"));
        data.add(new ContryModel(8, R.drawable.h, "Egypt", "Libya", "Tunisia"));
        data.add(new ContryModel(9, R.drawable.i, "Jordan", "Morocco", "Algeria"));
        data.add(new ContryModel(10, R.drawable.j,  "Kuwait", "Morocco","Somalia"));

        initQuestion();

        btn1.setOnClickListener(v -> {

            checkAnswer(btn1);

        });

        btn2.setOnClickListener(v -> {

            checkAnswer(btn1);
        });

        btn3.setOnClickListener(v -> {

            checkAnswer(btn1);
        });

        return root;
    }

    private void initQuestion() {

        flagImag.setImageResource(data.get(position).getImg());
        questionNum.setText(String.valueOf(data.get(position).getQuestionCount()));
        btn1.setText(String.valueOf(data.get(position).getCorrect()));
        btn2.setText(String.valueOf(data.get(position).getWrong1()));
        btn3.setText(String.valueOf(data.get(position).getWrong2()));

//        a.add(data.get(position).getCorrect());
//        a.add(data.get(position).getWrong1());
//        a.add(data.get(position).getWrong2());
//        Collections.shuffle(a);
//        btn1.setText(a.get(0));
//        btn1.setText(a.get(1));
//        btn1.setText(a.get(2));

        a.add("Saudi Arabia");
        a.add("Egypt");
        a.add("Algeria");
        a.add("Kuwait");
        a.add("Emirates");
        a.add("Morocco");
        a.add("Libya");
        a.add("Tunisia");
        a.add("Jordan");
        a.add("Somalia");

    }

    private void checkAnswer(Button btn) {

        String answer = btn.getText().toString();
        String correctAnswer = a.get(position);

        if (correctAnswer.equals(answer)) {
            countCorrect++;
            Toast.makeText(getActivity(), "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "Wrong Answer", Toast.LENGTH_SHORT).show();
        }

        position++;

        if (position >= data.size()) {

            Intent i = new Intent(getActivity(), ResultActivity.class);
            i.putExtra("num", countCorrect);
            startActivity(i);
            getActivity().finish();

        } else {
            initQuestion();
        }


    }
}