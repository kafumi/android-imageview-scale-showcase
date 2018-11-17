# ImageView ScaleType Showcase

A sample application to check the effects of ImageView's ScaleTypes

<img width="300" src="./doc/app_screenshot.png" />

# Capture screenshots

- Capturing screenshots is implemented as instrumentation test with [facebook/screenshot-tests-for-android](https://github.com/facebook/screenshot-tests-for-android)
- Screenshots can be captured with connected Android device or Android emulator by `gradlew runDebugAndroidTestScreenshotTest` command
  - Screenshots are automatically copied to [`app/screenshots`](./app/screenshots) directory

# Summary of ScaleTypes

| `ScaleType` | Larger image | Medium image | Smaller image | Aspect ratio | Scaling |
| --- | :-: | :-: | :-: | :-: | :-: |
| (ImageView & drawable sizes) | <img width="160" src="./doc/size_comparison_large.png" /> | <img width="160" src="./doc/size_comparison_medium.png" /> | <img width="160" src="./doc/size_comparison_small.png" /> | | |
| [`CENTER`](https://developer.android.com/reference/android/widget/ImageView.ScaleType#CENTER) | <img width="160" src="./app/screenshots/screenshot_LARGE_5_CENTER.png" /> | <img width="160" src="./app/screenshots/screenshot_MEDIUM_5_CENTER.png" /> | <img width="160" src="./app/screenshots/screenshot_SMALL_5_CENTER.png" /> | Maintained | N |
| [`FIT_CENTER`](https://developer.android.com/reference/android/widget/ImageView.ScaleType#FIT_CENTER) | <img width="160" src="./app/screenshots/screenshot_LARGE_3_FIT_CENTER.png" /> | <img width="160" src="./app/screenshots/screenshot_MEDIUM_3_FIT_CENTER.png" /> | <img width="160" src="./app/screenshots/screenshot_SMALL_3_FIT_CENTER.png" /> | Maintained | Y |
| [`CENTER_CROP`](https://developer.android.com/reference/android/widget/ImageView.ScaleType#CENTER_CROP) | <img width="160" src="./app/screenshots/screenshot_LARGE_6_CENTER_CROP.png" /> | <img width="160" src="./app/screenshots/screenshot_MEDIUM_6_CENTER_CROP.png" /> | <img width="160" src="./app/screenshots/screenshot_SMALL_6_CENTER_CROP.png" /> | Maintained | Y |
| [`CENTER_INSIDE`](https://developer.android.com/reference/android/widget/ImageView.ScaleType#CENTER_INSIDE) | <img width="160" src="./app/screenshots/screenshot_LARGE_7_CENTER_INSIDE.png" /> | <img width="160" src="./app/screenshots/screenshot_MEDIUM_7_CENTER_INSIDE.png" /> | <img width="160" src="./app/screenshots/screenshot_SMALL_7_CENTER_INSIDE.png" /> | Maintained | Y (shrinking only) |
| [`FIT_XY`](https://developer.android.com/reference/android/widget/ImageView.ScaleType#FIT_XY) | <img width="160" src="./app/screenshots/screenshot_LARGE_1_FIT_XY.png" /> | <img width="160" src="./app/screenshots/screenshot_MEDIUM_1_FIT_XY.png" /> | <img width="160" src="./app/screenshots/screenshot_SMALL_1_FIT_XY.png" /> | May changed | Y |
| [`FIT_START`](https://developer.android.com/reference/android/widget/ImageView.ScaleType#FIT_START) | <img width="160" src="./app/screenshots/screenshot_LARGE_2_FIT_START.png" /> | <img width="160" src="./app/screenshots/screenshot_MEDIUM_2_FIT_START.png" /> | <img width="160" src="./app/screenshots/screenshot_SMALL_2_FIT_START.png" /> | Maintained | Y |
| [`FIT_END`](https://developer.android.com/reference/android/widget/ImageView.ScaleType#FIT_END) | <img width="160" src="./app/screenshots/screenshot_LARGE_4_FIT_END.png" /> | <img width="160" src="./app/screenshots/screenshot_MEDIUM_4_FIT_END.png" /> | <img width="160" src="./app/screenshots/screenshot_SMALL_4_FIT_END.png" /> | Maintained | Y |