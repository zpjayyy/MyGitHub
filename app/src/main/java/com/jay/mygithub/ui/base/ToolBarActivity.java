package com.jay.mygithub.ui.base;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.jay.mygithub.R;

/**
 * Created by jay on 16/3/7.
 */
public abstract class ToolBarActivity extends BaseActivity {

  abstract protected int provideContentViewId();

  protected Toolbar mToolbar;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(provideContentViewId());

    mToolbar = (Toolbar) findViewById(R.id.toolbar);

    if(mToolbar == null) {
      throw new IllegalStateException("no toolbar");
    }

    setSupportActionBar(mToolbar);

    if(canBack()) {
      ActionBar actionBar = getSupportActionBar();
      actionBar.setDisplayHomeAsUpEnabled(true);
    }

  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    if(item.getItemId() == android.R.id.home) {
      onBackPressed();
      return true;
    } else {
      return super.onOptionsItemSelected(item);
    }
  }

  public boolean canBack() {
    return false;
  }
}
