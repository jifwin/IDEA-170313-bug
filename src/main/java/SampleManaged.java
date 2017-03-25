import io.dropwizard.lifecycle.Managed;

public class SampleManaged implements Managed {
    public void start() throws Exception {
        System.out.println("managed started");
    }

    public void stop() throws Exception {
        System.out.println("managed stopped");
    }
}
