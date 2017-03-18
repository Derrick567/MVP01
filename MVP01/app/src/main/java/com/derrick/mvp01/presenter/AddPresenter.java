package com.derrick.mvp01.presenter;

import com.derrick.mvp01.model.NumModel;
import com.derrick.mvp01.view.IView;

/**
 * Created by Derrick on 2017/3/18.
 */

public class AddPresenter implements IPresenter{

    IView view;
    NumModel numModel;

    public AddPresenter(IView v) {
        this.view = v;
        initNumModel();
    }

    private void initNumModel() {
        numModel =new NumModel();
    }

    @Override
    public void addNum(){
        numModel.addNum();
        loadNum();
    }

    public void loadNum(){
        int n=numModel.getNum();
        view.setNum(n);
    }
}
