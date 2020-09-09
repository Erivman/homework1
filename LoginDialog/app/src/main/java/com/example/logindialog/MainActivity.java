package com.example.logindialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.DialogInterface.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        //创建一个view，并且将布局加入view中
    final View viewDialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.customdialog, null, false);
    builder.setTitle("自定义对话框")
            .setView(viewDialog)
            .setPositiveButton(text:"确定", (dialog,which) {
                @Override
        public void onClick(DialogInterface dialog, int which) {
                    //取得用户输入内容，注意findViewById前面的viewDialog，表示在该view里面进行查找
            EditText editTextUserId = viewDialog.findViewById(R.id.edittext_user_id);
            EditText editTextUserPassword = viewDialog.findViewById(R.id.edittext_user_password);
            Toast.makeText(MainActivity.this, "UserId：" + editTextUserId.getText().toString()
                    + "UserPassword：" + editTextUserPassword.getText().toString(), Toast.LENGTH_LONG).show();
                }
            })
            .setNegativeButton("取消", new OnClickListener() {
                @Override
        public void onClick(DialogInterface dialog, int which) {

        }
            });
    builder.create().show();

}