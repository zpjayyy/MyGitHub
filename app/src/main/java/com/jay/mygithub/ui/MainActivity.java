package com.jay.mygithub.ui;

import android.os.Bundle;
import com.jay.mygithub.R;
import com.jay.mygithub.ui.base.ToolBarActivity;

/**
 * Created by jay on 16/3/7.
 */
public class MainActivity extends ToolBarActivity {

  @Override protected int provideContentViewId() {
    return R.layout.activity_main;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }
}
