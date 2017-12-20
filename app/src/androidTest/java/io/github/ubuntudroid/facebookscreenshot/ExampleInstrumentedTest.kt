package io.github.ubuntudroid.facebookscreenshot

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.view.LayoutInflater
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers

import org.junit.Test

import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    private lateinit var inflater: LayoutInflater

    @Before
    fun setup() {
        inflater = LayoutInflater.from(InstrumentationRegistry.getTargetContext())
    }

    @Test
    fun doScreenshot() {
        val view = inflater.inflate(R.layout.layout_test, null, false)
        ViewHelpers.setupView(view)
                .layout()

        Screenshot.snap(view).record()
    }
}
