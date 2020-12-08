public class ThreadForJson implements Runnable{
    private Community community;

    public ThreadForJson(Community community) {
        this.community = community;
        new Thread(this,"JsonThread").start();
    }

    public void run() {
        JacksonTest jacksonTest = new JacksonTest();
        jacksonTest.convertToJson(community);
        System.out.println(Thread.currentThread()+" done his work.");
    }
}
