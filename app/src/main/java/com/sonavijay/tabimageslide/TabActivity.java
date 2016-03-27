package com.sonavijay.tabimageslide;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by vijayson on 1/21/2016.
 */
public class TabActivity extends AppCompatActivity implements AppBarLayout.OnOffsetChangedListener {

    @Bind(R.id.app_bar_layout)
    AppBarLayout appBarLayout;

    @Bind(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.toolbar_header_view)
    MyTabs toolbarHeaderView;

    @Bind(R.id.float_header_view)
    MyTabs floatHeaderView;

    private boolean isHideToolbarView = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_layout);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout.setTitle(" ");

        toolbarHeaderView.bindTo("MyTab1", "MyTab2");
        floatHeaderView.bindTo("MyTab1","MyTab2");

        appBarLayout.addOnOffsetChangedListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int offset) {

        int maxScroll = appBarLayout.getTotalScrollRange();
        float percentage = (float) Math.abs(offset) / (float) maxScroll;

        if (percentage == 1f && isHideToolbarView) {
            toolbarHeaderView.setVisibility(View.VISIBLE);
            isHideToolbarView = !isHideToolbarView;

        } else if (percentage < 1f && !isHideToolbarView) {
            toolbarHeaderView.setVisibility(View.GONE);
            isHideToolbarView = !isHideToolbarView;
        }
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