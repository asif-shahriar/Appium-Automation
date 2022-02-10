# Appium-Automation
## Prerequisites
* Install Android Studio latest version
* Install Appium 1.17.1
* Install jdk 8 or any LTS version
* Configure **ANDROID_HOME** and **JAVA_HOME**
* Stable internet connection

## How to run this project
### Appium
* Turn on **Developers Mode** on your android phone
* Connect your android phone with USB cable
* Open cmd and give ```adb devices``` command to get uuid 
* Open Appium and start server. Then open inspector tool
* In the jsondata section, paste the following desired capabilities
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
* Open cmd in the root folder
* Give following command
```
gradle clean test
```

## Screenshot
