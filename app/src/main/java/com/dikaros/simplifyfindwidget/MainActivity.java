package com.dikaros.simplifyfindwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.dikaros.simplifyfindwidget.annotation.*;

/**
 * @see FindView  使用注解快速findView
 * @see OnClick 使用注解为view设置OnClick事件
 * @see OnItemClick 使用注解为listView设置onItemClick事件
 * @see OnLongClick 使用注解为view设置OnLongClick事件
 * @see OnItemLongClick 使用注解为listView设置onItemLongClick事件
 */
public class MainActivity extends AppCompatActivity {


    @FindView
    TextView text1;


    //如果后面不写id默认 id和属性名相同
    @FindView
    ListView listView;


    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findViewById这句要放在前面
        SimpifyUtil.findAll(this);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        for (int i = 0; i < 20; i++) {
            adapter.add("item " + i);
        }
        listView.setAdapter(adapter);
        text1.setText("哈哈");
    }


    @OnClick(R.id.text1)
    public void textClick(View v) {

        Toast.makeText(this, v.toString()+"text1点击", Toast.LENGTH_SHORT).show();
    }


    @OnLongClick(R.id.text1)
    public boolean textLongClick(View v) {
        Toast.makeText(this, "text1长按", Toast.LENGTH_SHORT).show();

        return false;
    }

    @OnItemClick(R.id.listView)
    public boolean lvItemClick(AdapterView<?> parent, View view, int position) {
        Toast.makeText(this, "item" + position + "点击", Toast.LENGTH_SHORT).show();

        return true;
    }

    @OnItemLongClick(R.id.listView)
    public boolean lvItemLongClick(AdapterView<?> parent, View view, int position) {
        Toast.makeText(this, "item" + position + "长按", Toast.LENGTH_SHORT).show();

        return true;
    }
}
