package com.jeyong.hoho;

import android.content.Context;
import android.hardware.usb.UsbManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.hoho.android.usbserial.driver.*;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static Context m_context;
    private static UsbManager _usbManager = null;
    private static List<UsbSerialDriver>  _drivers = null;
    
    public static void qgcLogWarning(String errMsg) {
    }

    public static void qgcLogDebug(String s) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
