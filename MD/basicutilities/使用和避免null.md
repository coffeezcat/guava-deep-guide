###使用和避免null(Using and avoiding null)
&#8195;&#8195;在java开发中遇见最多的问题之一便是NPE问题(NullPointerException),NPE问题会导致程序出现不可预料的结果。所以， 相比默默地接受null，使用快速失败操作拒绝null值对开发者更有帮助。  
&#8195;&#8195;另外使用null还会产生歧义，比如说map,当get的值是null的时候究竟是没有设置值还是获取的值为null呢,这会让程序产生疑惑。
### guava解决方案
>guava 使用 Optional 来解决上述问题。  

####基本用法
```
Optional<Integer> possible = Optional.of(10);
possible.isPresent(); // 是否存在 returns true
possible.get(); // returns 10
```
#### 类结构
>Optional 主类 <br/> 
> Present 当引用不为空时候的子类<br/> 
> Absent 当引用为null时候的子类

####  主要方法
创建Optional实例（以下都是静态方法）:
```
Optional.of(T)   创建一个不可NULL实例，为NULL则快速失败,返回Present类
Optional.absent()    创建引用缺失的Optional实例 ，返回Absent类
Optional.fromNullable(T) 创建指定引用的Optional实例，若引用为null则表示缺失
```
用Optional实例查询引用（以下都是非静态方法）：
```
boolean isPresent()  如果Optional包含非null的引用（引用存在），返回true
T get() 返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException
T or(T)  返回Optional所包含的引用，若引用缺失，返回指定的值
T orNull() 返回Optional所包含的引用，若引用缺失，返回null
Set<T> asSet() 返回Optional所包含引用的单例不可变集，如果引用存在，返回一个只有单一元素的集合，如果引用缺失，返回一个空集合。
```



