# Listener
Web监听器

在Servlet规范中定义了多种类型的监听器，它们用于监听的事件源分别为SerlvetConext,HttpSession和ServletRequest这三个域对象。

Servlet规范针对这三个对象上的操作，又把这多种类型的监听器划分为三种类型：

1>监听三个域对象创建和销毁的事件监听器

2>监听域对象中属性的增加和删除的事件监听器

3>监听绑定到HttpSession域中的某个对象的状态的事件监听器。

a、如三个域对象的创建与销毁方法签名：

ServletRequestListener有以下两个方法

void requestDestroyed(ServletRequestEvent sre)

void requestInitialized(ServletRequestEvent sre)

HttpSessionListener有以下两个方法

void sessionCreated(HttpSessionEvent se)

void sessionDestroyed(HttpSessionEvent se)

ServletContextListener

void contextDestroyed(ServletContextEvent sce)

void contextInitialized(ServletContextEvent sce)

b、三个类型对象域中增、删、改的监听器（3个）

ServletContextAttributeListener，

HttpSessionAttributeListener，

ServletRequestAttributeListener

c、感知型监听器（2个）：监听自己何时被帮到session上，何时解绑了；何时被钝化了，何时被活化了(序列化到某个存储设置中)。

注意：这种监听器不需要注册。某个javabean实现这些接口后就可以监听何时被绑定、解绑或被激活或钝化。

HttpSessionBindingListener：实现该接口的类，能检测自己何时被Httpsession绑定，和解绑

HttpSessionActivationListener：实现该接口的类(要求些javabean必须是实现了Serializable接口的)，能监测自己何时随着HttpSession一起激活和钝化。






session的钝化机制以及Tomcat中两种Session钝化管理器 ：

1，绑定到Session中的 对象有多种状态，分别是   绑定<----->解除绑定     钝化<------>活化。

绑定是保存，通过session.setattribute把对象保存到session的对象当中，解除绑定，remove。
钝化就是将session持久化存储设备上。活化就是将session对象从一个存储设备上进行恢复。

2，session的钝化机制：

session正常是放到服务器内存当中的，当在线用户很多时，session内存的开销是巨大的，会直接影响web服务器的性能，session的钝化机制就会解决这个问题

session钝化的本质就是把服务器不经常使用的session对象暂时序列化到系统文件，整个的过程是由服务器自动完成的

3，Tomcat中两种Session钝化管理器

   首先session钝化机制是由sessionManager管理

1）第1种管理器是StandarManager

        org.apache.catalina.session.StandarManager

         当Tomcat服务器关闭或者重启时tomcat服务器会将当前内存中的session对象钝化到服务器文件系统中；

          另一种情况是web应用程序被重新加载时，内存中的session对象也会被钝化到服务器的文件系统中

2)Persistentmanager

   org.apache.catalina.session.Persistentmanager

      首先在钝化的基础上进行扩张，第一种情况如上面1，第2种如2，第3种情况，可以配置主流内存的session对象数目，将不长使用的session对象保存到系统文件或数据库，当用时再重新加载

      默认情况下，Tomcat提供2个钝化驱动类

4，servlet规范：

         实现接口：HttpServletBindingListener

                  HttpSessionActivationListener


5,实例部分：

当对象实现Persistentmanager的接口之后，这个对象被session绑定了，这时会触发事件，执行方法



