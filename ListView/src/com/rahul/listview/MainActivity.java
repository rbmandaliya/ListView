package com.rahul.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {

	public static final String[] titles = new String[] { "Strawberry",
			"Banana", "Orange", "Mixed" };

	public static final String[] descriptions = new String[] {
			"It is an aggregate accessory fruit",
			"It is the largest herbaceous flowering plant", "Citrus Fruit",
			"Mixed Fruits" };

	public static final int[] image = { R.drawable.apple, R.drawable.banana,
			R.drawable.orange, R.drawable.rasberies };

	public ListView listView;
	List<RowItem> rowItems;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		rowItems = new ArrayList<RowItem>();
		for (int i = 0; i < titles.length; i++) {
			RowItem item = new RowItem(image[i], titles[i], descriptions[i]);
			rowItems.add(item);
		}

		listView = (ListView) findViewById(R.id.rahul_listView);
		customeBaseAdapter adapter = new customeBaseAdapter(this, rowItems);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
	}
}