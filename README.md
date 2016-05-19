# simplifyFindWidget 0.1
>使用注解初始化控件和设置监听器

* 使用@FindView注解快速找到控件省去了findViewById的麻烦
* 使用@OnClick("methodName"),@OnLongClick("methodName")等方法为控件快速设置监听器

### 使用方法

```java
@OnClick("textClick")//点击事件，需要在下面实现这个方法，方法名为textClick
@OnLongClick("textLongClick")//长按事件，需要在下面实现这个方法，方法名为textLongClick
@FindView(R.id.text1)//如果FindView的Value为空默认id和属性名一致
TextView text1;

public void textClick(View v) {
        Toast.makeText(this, "text1点击", Toast.LENGTH_SHORT).show();
}

public boolean textLongClick(View v) {
        Toast.makeText(this, "text1长按", Toast.LENGTH_SHORT).show();
        return false;
}


```
> 在onCreat方法中使用下面两个方法注册

```java
SimpifyUtil.findAllViews(this);//要先使用这个方法
SimpifyUtil.registListenerforAll(this);
```


