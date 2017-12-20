package io.github.ubuntudroid.facebookscreenshot;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;

import com.facebook.testing.screenshot.ScreenshotRunner;

import org.junit.Ignore;

@Ignore
public class Junit4Runner extends AndroidJUnitRunner {
  @Override
  public void onCreate(Bundle args) {
    ScreenshotRunner.onCreate(this, args);
    super.onCreate(args);
  }

  @Override
  public void finish(int resultCode, Bundle results) {
    ScreenshotRunner.onDestroy();
    super.finish(resultCode, results);
  }
}
