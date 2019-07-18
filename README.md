ThreadLocal
===========
1、线程容器，给线程绑定一个Object内容，只要线程不变可以随时取出，改变线程无法取出内容<br>
```java
public class ThreadLocalTest {
    public static void main(String[] args) {
        final ThreadLocal<String> threadLocal=new ThreadLocal<>();
        threadLocal.set("测试");
        new Thread(){
            @Override
            public void run() {
                System.out.println(threadLocal.get());
            }
        }.start();
    }
}
```
缓存
===
1、应用程序和数据库交互的过程是一个相对比较耗时的过程<br>
2、缓存的意义：让应用程序减少对数据库的访问，提升程勋运行效率<br>
3、Mybatis中默认sqlsession缓存开启<br>
>>3.1、同一个sqlsession对象调用同一个select时，只有第一次访问数据库，第一次之后把查询结果缓存到sqlsession缓存区中<br>
>>3.2、缓存的时statement对象；在mybatis时一个select对应一个statement对象;有效范围必须是同一个sqlsession对象<br>
>>3.3、如果不写<cache readOnly="true"></cache>，需要把实体类序列化implements Serializable;当sqlsession对象close或commit时会把sqlsession缓存的数据刷（flush）到sqlsessionFactory缓存区中<br>

