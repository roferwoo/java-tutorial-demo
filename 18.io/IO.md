# IO（Input/Output）流

- IO流用来处理设备之间的数据传输
- Java对数据的操作是通过流的方式
- Java用于操作流的对象都是io包中
- 流按操作数据分为两种：字节流与字符流
- 流按流向分为：输入流与输出流

# IO流常用基类

- 字节流的抽象基类：InputStream与OutputStream
- 字符流的抽象基类：Reader与Writer

> 注：由这四个类派生出来的子类名称都是以其父类名作为子类名的后缀。如：
InputStream的子类FileInputStream，Reader的子类FileReader。

