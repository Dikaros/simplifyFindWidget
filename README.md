# simplifyFindWidget 0.2
>使用注解初始化控件和设置监听器

* 使用@FindView注解快速找到控件省去了findViewById的麻烦
* 使用@OnClick(ir),@OnLongClick(id)等方法为控件快速设置监听器

### 使用方法

```java


@FindView(R.id.text1)//如果FindView的Value为空默认id和属性名一致
TextView text1;

@OnClick(R.id.text1)//点击事件
public void textClick(View v) {
        Toast.makeText(this, "text1点击", Toast.LENGTH_SHORT).show();
}

@OnLongClick(R.id.text1)//长按事件
public boolean textLongClick(View v) {
        Toast.makeText(this, "text1长按", Toast.LENGTH_SHORT).show();
        return false;
}


```
> 如果是在Activity中，需要在onCreat方法中使用下面的方法注册

```java
SimpifyUtil.findAll(this);//要先使用这个方法

```
> 如果在Fragment或ViewHolder等非Activity中使用需要使用下面的注册方法

```java
SimpifyUtil.findAll(this,view);
```

> 现在还提供了ListView的OnItemClick和OnItemLongClick的注解使用,使用方法和上面所述的方法类似
> 在Activity中可以根据id找到Drawable,String,Color使用的注解为@FindDrawable,@FindString,@FindColor



