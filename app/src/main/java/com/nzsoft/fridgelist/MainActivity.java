package com.nzsoft.fridgelist;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.nzsoft.fridgelist.adapter.ItemFridgeAdapter;
import com.nzsoft.fridgelist.adapter.ItemNoteAdapter;
import com.nzsoft.fridgelist.data.dto.ItemFridge;
import com.nzsoft.fridgelist.data.dto.ItemNote;
import com.nzsoft.fridgelist.data.service.ItemFridgeService;
import com.nzsoft.fridgelist.data.service.ItemNoteService;
import com.nzsoft.fridgelist.data.service.impl.ItemFridgeServiceImpl;
import com.nzsoft.fridgelist.data.service.impl.ItemNoteServiceImpl;
import com.nzsoft.fridgelist.fragment.FridgeListFragment;
import com.nzsoft.fridgelist.fragment.NoteListFragment;

import java.util.List;


public class MainActivity extends FragmentActivity {

    private FridgeListFragment fridgeListFragment;
    private NoteListFragment noteListFragment;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private View previousBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousBtn = (View) findViewById(R.id.buttonNote);
        previousBtn.setBackgroundResource(R.drawable.changelistbutton);

        fridgeListFragment = new FridgeListFragment();
        noteListFragment = new NoteListFragment();

        fragmentManager = getFragmentManager();

        fragmentTransaction = fragmentManager.beginTransaction();

        if(fragmentManager.findFragmentByTag(NoteListFragment.TAG) == null){
            fragmentTransaction.add(R.id.container, noteListFragment,NoteListFragment.TAG);
        }

        fragmentTransaction.commit();

    }

    public void onChangeListButtonClick(View view) {
        fragmentTransaction = fragmentManager.beginTransaction();

        switch (view.getId()) {
            case R.id.buttonFridge:
                if(fragmentManager.findFragmentByTag(NoteListFragment.TAG) != null){
                    fragmentTransaction.replace(R.id.container, fridgeListFragment,FridgeListFragment.TAG);
                }
                view.setBackgroundResource(R.drawable.changelistbutton);
                previousBtn = (View) view.getRootView().findViewById(R.id.buttonNote);
                previousBtn.setBackgroundResource(R.drawable.btn_default);
                break;
            case R.id.buttonNote:
                if(fragmentManager.findFragmentByTag(FridgeListFragment.TAG) != null){
                    fragmentTransaction.replace(R.id.container, noteListFragment,NoteListFragment.TAG);
                }
                view.setBackgroundResource(R.drawable.changelistbutton);
                previousBtn = (View) view.getRootView().findViewById(R.id.buttonFridge);
                previousBtn.setBackgroundResource(R.drawable.btn_default);
                break;
        }

        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
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
