package io.github.kafumi.imageviewscaleshowcase

import android.widget.ImageView
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.internal.ScreenshotImpl
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.instanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    var rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun takeScreenShots() {
        ScreenshotImpl.getInstance().tileSize = 2048

        MainViewModel.ImageSize.values().forEach { imageSize ->
            onView(withId(R.id.image_size_spinner)).perform(click())
            onData(
                allOf(
                    `is`(instanceOf(String::class.java)),
                    `is`(imageSize.name)
                )
            ).perform(click())

            ImageView.ScaleType.values().forEachIndexed { index, scaleType ->
                onView(withId(R.id.scale_type_spinner)).perform(click())
                onData(
                    allOf(
                        `is`(instanceOf(String::class.java)),
                        `is`(scaleType.name)
                    )
                ).perform(click())

                Screenshot.snap(rule.activity.findViewById(R.id.image_view))
                    .setName("screenshot_${imageSize}_${index}_$scaleType")
                    .record()
            }
        }
    }
}
