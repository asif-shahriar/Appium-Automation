# Appium-Automation
## Prerequisites
* Install Android Studio latest version
* Install Appium 1.17.1
* Install jdk 8 or any LTS version
* Configure **ANDROID_HOME**, **JAVA_HOME** and **GRADLE_HOME**
* Stable internet connection

## How to run this project
### Appium
* Turn on **Developer Options** on your android phone
* Connect your android phone with USB cable
* Open cmd and give ```adb devices``` command to get uuid 
* Open Appium and start server. Then open inspector tool
* In the **JSON Representation** section, paste the following desired capabilities after adding your uuid and version

```
{
  "deviceName": "My Android",
  "platformName": "Android",
  "uuid": Enter your uuid here,
  "platformVersion": Enter your android version,
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator"
}
```
* Click **Start Server**
### Java Client
* Clone the repo
* Enter your uuid in the [AppLaunch](https://github.com/asif-shahriar/Appium-Automation/blob/main/src/test/java/AppLaunch.java "AppLaunch.java") class
* Open cmd in the root folder
* Give following command
```
gradle clean test
```

## Screenshot

![Screenshot_1](https://user-images.githubusercontent.com/71173675/153359911-2458e459-35ca-4496-85af-33f7682d0912.png)
