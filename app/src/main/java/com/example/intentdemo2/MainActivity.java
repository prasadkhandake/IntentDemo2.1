package com.example.intentdemo2;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText phoneNumber;
    String contactNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNumber=findViewById(R.id.phone_number);

    }
    protected void dial(View v1)
    {
        contactNumber=phoneNumber.getText().toString();
        if(contactNumber.isEmpty())
        {
            phoneNumber.setError("Enter Phone Number");
        }
        else
        {
            Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+contactNumber));
            startActivity(i);
        }


    }
    protected void contact(View v2)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
        startActivity(i);
    }
    protected void browser(View v3)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(i);
    }
    protected void callLog(View v4)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("content://call_log/calls/"));
        startActivity(i);
    }
    protected void gallery(View v1)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/external/images/media/"));
        startActivity(i);
    }
    protected void camera(View v1)
    {
        Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }
    protected void call(View v)
    {
        contactNumber=phoneNumber.getText().toString();
        if(contactNumber.isEmpty())
        {
            phoneNumber.setError("Enter Phone Number");
        }
        else
        {
            Intent i=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+contactNumber));
            startActivity(i);
        }
    }
}
