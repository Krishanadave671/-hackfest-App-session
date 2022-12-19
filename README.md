
# Hackfest Intro App 

👋 Hello guys This repository is made for learning the contents in structured way what you all performed in hackfest Android development session . 


Table of contents :



## Introduction 

Let's get started with Android development 🔥🔥🔥


 Before starting with android development Just have a little overview on what android is ?

Android is a mobile operating system based on a modified version of the Linux kernel and other open-source software, designed primarily for touchscreen mobile devices such as smartphones and tablets. Android is developed by a consortium of developers known as the Open Handset Alliance and commercially sponsored by Google. 

so now we will start developing our first app and understand how to develop a app?

Android Studio is the official integrated development environment (IDE) for Google's Android operating system, built on JetBrains' IntelliJ IDEA software and designed specifically for Android development. It is available for download on Windows, macOS and Linux based operating systems.

[Install Android studio](https://developer.android.com/studio)

*Note : Install Android studio if system has at least 8GB RAM*

*But even if you have a system having 4GB+ of ram, you can still install it and work on it. We also initially started Android development on a 4GB system.*

For those of you having less than 8GB ram follow this [link](https://youtu.be/-_7CQT5dRLk) to set up USB debugging, DONT INSTALL VIRTUAL EMULATORS

![Android meme](https://qph.cf2.quoracdn.net/main-qimg-5d26e70b8c68f9a65553a677a70697da-lq)

Now we have Installed Android studio our setup is ready Let's Goo 🔥🔥

Let us create our first android project 

## Create a new Project 

![Android dolphin photo](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjkfXAbx50iCCkoBHvROMLVOjBWr1M1xUlteMdrt8tHkw74KKcC8l4YQgAuB1su0CARQpfor9ugIUODb4dW-x9MRjYk8d6YwqMkgJE5FkRc7_2U8YLWkttAqQTDcnRpgz76F-ZPG8PFx6Qi3Xf9FOE9ebue9KvUPpIjLuj0i2cer8u07riUN6W9fkL-/s1600/image7.png)

Click on create new project

![Create new project](https://yourtution.com/wp-content/uploads/2022/10/image-39-1024x563.png)

Choose an Empty Activity 

![choose Activity](https://miro.medium.com/max/720/1*bzXtNw6KgWxcqgVJEy4MCw.webp)

So here , you can see that there are various activities which we can use according to our need 

There are lots of activities available like Map activity , login activity etc ... All this Activity have predefined components code available.

As a beginner we will choose Empty activity we will built our app from scratch to better understand components of android.

## What is Activity ?

An Android activity is one screen of the Android app’s user interface. In that way an Android activity is very similar to windows in a desktop application. An Android app may contain one or more activities, meaning one or more screens

Then we comes to our next screen 

![image](https://user-images.githubusercontent.com/84977709/208352466-8b6fc78b-50b4-4cc2-a74e-9a952942a620.png)

First give Name to your project (package name is automatically choosen by Android studio)


`Note: choose packagename unique There is no issue for our local projects . when we upload app on playstore unique package name is required so better to keep package name unique`

Choose language : There are two options `java`  and `kotlin`

we will choose java language for our project .

## what is SDK? 

Android SDK stands for Android Software Development Kit which is developed by Google for Android Platform. With the help of Android SDK, we can create android Apps easily.

Android SDK is a collection of libraries and Software Development tools that are essential for Developing Android Applications. Whenever Google releases a new version or update of Android Software, a corresponding SDK also releases with it. In the updated or new version of SDK, some more features are included which are not present in the previous version

In simple words , just you can understand your android mobile versions like jelly bean , lollipop etc we will choose minimum sdk that should be compatible to many devices .

we will choose Min sdk for our project  : `API 21 : Android 5.0(Lollipop)`


![image](https://user-images.githubusercontent.com/84977709/208351271-6006d044-e6a5-43d8-a375-62359ade529a.png)


Now our Android studio  

![image](https://user-images.githubusercontent.com/84977709/208352644-5198f08f-25ef-4d12-8878-5736f68694b4.png)

on Bottom left side `Gradle sync finished`

As we start our new project Gradle download some packages and sync the project so it takes time to load the project 

if you want to know more about android build.gradle  [click here](https://www.geeksforgeeks.org/android-build-gradle/) 

let's understand first project structure of Android App
  

  
## Main Activity.java  code 

## code to create  Instance of class
```java
TextInputLayout name , year , branch ;
    Button button ;
```

## Code to hide action bar
```java
getSupportActionBar().hide();
```

## Code to connect variables to text fields

```java
name = findViewById(R.id.textField);
year = findViewById(R.id.textField2);
branch = findViewById(R.id.textField3);
```
## Code to connect variables to button

```java
button = findViewById(R.id.button);
```

## Code to get data from text fields

```java
String studentName = name.getEditText().getText().toString();
String studentyear= year.getEditText().getText().toString();
String studentbranch = branch.getEditText().getText().toString();

```


## Code to create your message

```java
String text = "Hello guys ! my name is " + studentName + "\n I am from " + studentyear + " studying in " + studentbranch + " I made my first app today It was amazing 🥳🥳🥳💖";


```

## Code to send a pop up message

```java
Toast.makeText(MainActivity.this, "Hello my name is" + studentName + " " + studentyear + " " + studentbranch , Toast.LENGTH_SHORT).show();

```

## Code to change activity

```java


```


## Code to add click listener to button

```java
button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String studentName = name.getEditText().getText().toString();
                String studentyear= year.getEditText().getText().toString();
                String studentbranch = branch.getEditText().getText().toString();
                String text = "Hello guys ! my name is " + studentName + "\n I am from " + studentyear + " studying in " + studentbranch +
                        " I made my first app today It was amazing 🥳🥳🥳💖";
                Toast.makeText(MainActivity.this, "Hello my name is" + studentName + " " + studentyear + " " + studentbranch , Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this , MainActivity2.class);
                i.putExtra("text" , text );
                startActivity(i);

            }
        });



```


## MainActivity2 .java code 

## Code to create Instance of classes
```java 
Button button2 ;
TextView textView2 ;
```

## Code to connect variables to text fields
```java 
button2 = findViewById(R.id.button2);
textView2 = findViewById(R.id.textView2);
```

## Code to get data from previous activity
```java
Intent intent = getIntent();
String text = intent.getStringExtra("text");
```

## Code to set text of the text fields
```java
textView2.setText(text);
```

## Code to send message to WhatsApp
``` java 
Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
whatsappIntent.setType("text/plain");
whatsappIntent.setPackage("com.whatsapp");
whatsappIntent.putExtra(Intent.EXTRA_TEXT, text);
startActivity(whatsappIntent);

Code to add click listener to button
button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.setType("text/plain");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(whatsappIntent);
            }
        });
```
For support, email krishnadave671@gmail.com
