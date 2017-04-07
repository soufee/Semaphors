import java.io.ObjectOutput;

/**
 * Created by Shoma on 07.04.2017.
 */
public class Consumer {
    int a;
    int b;
    int c;

    public Consumer(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Consumer() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public void  met(int kube, int kvadro, int simple, Object obj )
  {

      a+=kube;
      b+=kvadro;
      c+=simple;
      System.out.println(obj.getClass().getName());
      System.out.println(a +" :: "+b+" :: "+c);
  }

}
