package level9Annotation.nine0;
/*
Эту задачу я обычно даю, когда речь заходит про аннотации и reflection. Заодно, можно рассказать про Executors, ThreadPoolExecutor и другие.

Задача:

Создайте свою аннотацию Repeat с целочисленным параметром.
Расширьте класс ​ ThreadPoolExecutor​​ и переопределите метод ​execute следующим образом:
если экземпляр Runnable имеет аннотацию Repeat,
то его метод run выполняется несколько раз (количество задается параметром в Repeat).

То есть, написав такой класс:

@Repeat(3)
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello!");
    }
}

и использовав его:

public static void main(String[] strings) {
        CustomThreadPoolExecutor customThreadPoolExecutor =
                        new CustomThreadPoolExecutor(10);
        customThreadPoolExecutor.execute(new MyRunnable());
}

Мы должны увидеть:

Hello!
Hello!
Hello!
 */
public class Main {
}
