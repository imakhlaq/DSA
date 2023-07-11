class Producer implements Runnable {

    final StringBuffer sb;

    Producer() {
        sb = new StringBuffer();
    }

    public void run() {

        synchronized (sb) {

            System.out.println("Producing the product");

            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(500);

                    sb.append(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("Producing the product done");
            sb.notify();
        }
    }
}

class Consumer implements Runnable {

    final Producer producer;

    Consumer(Producer p) {
        this.producer = p;
    }

    public void run() {

        synchronized (producer.sb) {

            try {

                System.out.println("Consumer want to consume");
                producer.sb.wait();
                System.out.println("Consumer is wait over");


                System.out.println(producer.sb);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}


class Main {
    public static void main(String[] args) {

        Producer p = new Producer();
        Consumer c = new Consumer(p);

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(p);

        t1.start();
        t2.start();


    }
}
