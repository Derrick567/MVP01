package com.derrick.mvp01.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.derrick.mvp01.R;
import com.derrick.mvp01.presenter.AddPresenter;
import com.derrick.mvp01.presenter.IPresenter;

public class MainActivity extends AppCompatActivity implements IView{

    IPresenter addPresenter;
    TextView tvNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNum = (TextView) findViewById(R.id.tv_num);
        addPresenter = new AddPresenter(this);
        addPresenter.loadNum();
    }


    public void onClickEvent(View v){
        addPresenter.addNum();

    }

    @Override
    public void setNum(int n) {
        tvNum.setText(""+n);
    }


}
