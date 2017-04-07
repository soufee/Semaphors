import java.util.Random;

/**
 * Created by Shoma on 07.04.2017.
 * Написать программу для вычисления многочлена с использованием собственного семафора.
 1) Вид многочлена- а^3 + b^2 + c
 2) Использовать для вычисления куба, квадрата и c- отдельные классы
 3) Результат выводить в режиме реального времени в класс потребитель (Consumer). Использовать его функцию с 3мя аргументами met(int kube, int kvadro, int simple)
 3.1) Если функцию Consumer-а вызывает Кубатор- то он передает в нее такие аргументы (число, 0, 0)
 3.2) Если функцию Consumer-а вызывает Квадратор- то он передает в нее такие аргументы (0, число, 0)
 3.3) Если функцию Consumer-а вызывает Простатор- то он передает в нее такие аргументы (0, 0, число)
 4) Условие семафора- допускается одновременный вызов метода Consumer-а РАЗНЫМИ классами
 4.1) Пример: Кубатор, Квадратор параллельно- можно
 4.2) Пример: Кубатор, Кубатор- нельзя
 5) На вход в каждый вычислитель- идет массив числе
 5.1) ЧИсла можно забить самим
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
       Consumer consumer = new Consumer();
       SimpleSemaphore semaphore = new SimpleSemaphore();

        Random random = new Random();
        int[]list = new int[30];
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(3);
            //System.out.println(list[i]);
        }
        for (int d:list) {
            if (d==0) new Simpler(semaphore,consumer).run();
            if (d==1) new Quadrator(semaphore,consumer).run();
            if (d==2) new Cubator(semaphore,consumer).run();
        }
    }


}