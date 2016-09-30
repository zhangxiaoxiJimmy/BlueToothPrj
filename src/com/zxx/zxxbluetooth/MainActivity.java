package com.zxx.zxxbluetooth;

import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;

public class MainActivity extends ListActivity {
	BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		if (mBluetoothAdapter == null)

		{
			// Device does not support Bluetooth
		}
	}

}
