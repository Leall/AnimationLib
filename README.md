AnimationLib
============

* 点赞
 
Download
--------

```gradle
   repositories {
        ...
        maven { url "https://jitpack.io" }
   }
   dependencies {
        compile 'com.github.Leall:AnimationLib:1.0.0'
   }
```

How do use ?
------------

```java
//extend PeriscopeLayout and Constructor;
//Override initDrawable;
 @Override
    public ArrayList<Integer> initDrawable() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.pl_red);
        list.add(R.drawable.pl_yellow);
        list.add(R.drawable.pl_blue);
        return list;
    }
```

```xml
<com.example.administrator.animation.like.TestPeriscopeLayout
     android:id="@+id/periscope"
     android:layout_width="100dp"
     android:layout_height="300dp" 
     />
```

```java
//initView;
TestPeriscopeLayout periscopeLayout = (TestPeriscopeLayout) findViewById(R.id.periscope);
//then send like
periscopeLayout.addHeart();
```
