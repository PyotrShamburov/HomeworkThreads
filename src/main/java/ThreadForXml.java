public class ThreadForXml implements Runnable{
    private Community community;

    public ThreadForXml(Community community) {
        this.community = community;
        new Thread(this,"XmlThread").start();
    }

    public void run() {
        JaxbTest jaxbTest = new JaxbTest();
        jaxbTest.writeToXml(community);
        System.out.println(Thread.currentThread()+" done his work.");
    }
}
