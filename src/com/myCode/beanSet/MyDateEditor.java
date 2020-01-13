//IntelliJ IDEA
//Sprin01
//MyDateEditor
//2020/1/13
// Author:御承扬
//E-mail:2923616405@qq.com

package com.myCode.beanSet;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateEditor extends PropertyEditorSupport {
    private String formate;
    public void setAsText(String text) throws IllegalArgumentException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            Date date;
            date = sdf.parse(text);
            setValue(date);
        }catch (ParseException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void setFormat(String formate) {
        this.formate = formate;
    }
}
