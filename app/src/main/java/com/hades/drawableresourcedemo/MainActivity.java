package com.hades.drawableresourcedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hades on 2/5/2017.
 */

public class MainActivity extends AppCompatActivity {

	private final static Map<Integer,Class<?>> clsMap = new HashMap<>();

	static {
		clsMap.put(0, BitmapActivity.class);
		clsMap.put(1, NinePatchActivity.class);
		clsMap.put(2, LayerActivity.class);
		clsMap.put(3, StateActivity.class);
		clsMap.put(4, LevelActivity.class);
		clsMap.put(5, TransitionActivity.class);
		clsMap.put(6, InsetActivity.class);
		clsMap.put(7, ClipActivity.class);
		clsMap.put(8, ScaleActivity.class);
		clsMap.put(9, ShapeActivity.class);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
						.setAction("Action", null).show();
			}
		});

		ListView mListView = (ListView) findViewById(R.id.listView);
		mListView.setAdapter(new ArrayAdapter<String>(
				this, R.layout.item_name, R.id.name, getResources().getStringArray(R.array.mListName)));
		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				start2Act(clsMap.get(position));
			}
		});
	}

	private void start2Act(Class<?> cls) {
		Intent intent = new Intent(this, cls);
		startActivity(intent);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
