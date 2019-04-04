###特殊的Comparator(Ordering)
#### 概要
&#8195;&#8195;```Ordering```是guava的一个流式比较器(Comparator),其可以使用链式方式构建比较复杂的比较器，然后供集合使用，列如```Collections.max```和```Collections.sort```。  
#### 如何创建
>通过以下的静态方法构建了基本的排序方式

|方法|描述|
|------ |------ |
|```natural()```|对可比较类型使用自然排序|
|```usingToString()```|使用toString()返回的字符串进行字典顺序|

>Ordering与Comparator相互转发

```Ordering.from(Comparator)```

>直接创建Ordering
```
 /**
     *基本用法--按字符串长度排序
     * */
    @Test
    public void testBaseUse(){
        Ordering<String> byLengthOrdering = new Ordering<String>() {
            @Override
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };
        List<String> var1 = Arrays.asList("mary","jack.ma","cocoer","kangkang","idea","pyCharm");
        Collections.sort(var1,byLengthOrdering);
        System.out.println(var1);
    }
    //输出:[mary, idea, cocoer, jack.ma, pyCharm, kangkang]
```
>可以用下列方法对Ordering进行链式包装

|方法|描述|
|------ |------ |
|```reverse()```|倒序|
|```nullsFirst()```|把null元素放到最前面|
|```compound(Comparator)```|使用一个具体的Comparator来排序|
|```onResultOf(Function)```|以return的值来进行排序|

>使用列子

```
    /**
     * 进阶用法-链式调用
     * */
    @Test
    public void testOrdering(){
       List<String> var1 = Arrays.asList("mary","jack.ma","cocoer",null,"kangkang","idea","pyCharm");
        Ordering<String> ordering = Ordering.natural().reverse().nullsFirst().onResultOf(new Function<String, Comparable>() {
            @Override
            public Comparable apply(@Nullable String input) {
                //用来比较的字段
                return Objects.isNull(input)?input:input.charAt(input.length()-1);
            }
        });
        Collections.sort(var1,ordering);
        System.out.println(var1);
    }
    //输出:[null, mary, cocoer, pyCharm, kangkang, jack.ma, idea]
```

>不使用Collections工具类方法，直接使用Ordering操作数据
```
greatestOf(Iterable iterable, int k);获取排序后前K的元素
isOrdered(Iterable);检测在给定的条件下是否有序
sortedCopy(Iterable);排序并返回这个列表的排序
min(E, E);返回两个元素中小的一个
min(E, E, E, E...);返回比较元素中最小的一个
min(Iterable);返回迭代器中最小的元素
.....
```


