## 1、这是什么?

这是一个随机生成假数据的工具，灵感来自于[java-faker](https://github.com/DiUS/java-faker)项目

## 2、他能做什么?

他可以很简单的生成各种假数据，方便进行测试

## 3、怎么使用?

以生成假的姓名举例

```java

@SpringBootTest
class FakerDataApplicationTests {
    @Test
    public void testFaker() {
        Faker faker = new Faker();
        Name name = faker.name();
        System.out.println(name.getName());
    }
}
```

国际化用法

```java

@SpringBootTest
class FakerDataApplicationTests {
    @Test
    public void testFaker() {
        Faker faker = new Faker(new Local("zh-cn"));
        Name name = faker.name();
        System.out.println(name.getName());
    }
}
```

## 4、致谢

感谢项目灵感来源[java-faker](https://github.com/DiUS/java-faker)
，和根据正则生成随机字符串的项目[reverse-regexp](https://github.com/GitHub-Laziji/reverse-regexp)