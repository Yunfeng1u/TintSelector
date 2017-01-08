# TintSelector


一个Tint着色器的简单使用，利用v4包中的DrawableCompat实现了低版本兼容。

<br>

## 效果
![](https://github.com/Yunfeng1u/TintSelector/blob/master/art/pic1.png)
![](https://github.com/Yunfeng1u/TintSelector/blob/master/art/pic2.png)

<br>
## 使用
```
   Drawable drawable = Util.getCheckTintSelector(this, R.drawable.sort_distance_default, R.color.normal_color_selector);
   // 通过反射
   // Drawable drawable = Util.getCheckTintSelector(this, "sort_distance_default", R.color.normal_color_selector);
     
   drawable.setBounds(0, 0, 50, 50);

   CheckBox cb_test = (CheckBox) findViewById(R.id.cb_test);
        
   cb_test.setCompoundDrawables(drawable, null, null, null);
```

文件只有一个，还是现拷现用。
