package com.example.sophie.beacondetector101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.beaconinside.androidsdk.BeaconService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BeaconService.init(this, "bXbTzKhgNFwbxgCMrfw6");

    }
}
