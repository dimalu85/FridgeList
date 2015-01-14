package com.nzsoft.fridgelist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.nzsoft.fridgelist.adapter.ItemFridgeAdapter;
import com.nzsoft.fridgelist.data.dto.ItemFridge;
import com.nzsoft.fridgelist.data.service.ItemFridgeService;
import com.nzsoft.fridgelist.data.service.impl.ItemFridgeServiceImpl;

import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView itemFridgeListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemFridgeListView = (ListView) findViewById(R.id.itemFridgeListView);

        ItemFridgeService itemFridgeService = new ItemFridgeServiceImpl();

        List<ItemFridge> itemFridgeList = itemFridgeService.getAllItemsFridge();

        ItemFridgeAdapter itemFridgeAdapter = new ItemFridgeAdapter(this, itemFridgeList);

        itemFridgeListView.setAdapter(itemFridgeAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
