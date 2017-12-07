package com.open.annotation.json;

import com.open.annotation.bean.CommonBean;

import java.io.Serializable;
import java.util.List;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/79:19
 * @version:2.10
 * @modifyTime:2017/12/79:19
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/

public class CommonJson implements Serializable{
    private List<CommonBean> list;

    public List<CommonBean> getList() {
        return list;
    }

    public void setList(List<CommonBean> list) {
        this.list = list;
    }
}
