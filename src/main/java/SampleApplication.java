import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

import java.lang.management.ManagementFactory;

public class SampleApplication extends Application<AppConfiguration> {
    public void run(AppConfiguration appConfiguration, Environment environment) throws Exception
    {
        System.out.println(String.format("PID: %s", getProcessId()));
        environment.lifecycle().manage(new SampleManaged());
    }

    public static void main(String[] args) throws Exception {
        new SampleApplication().run(args);
    }

    private static String getProcessId() {
        final String jvmName = ManagementFactory.getRuntimeMXBean().getName();
        final int index = jvmName.indexOf('@');

        return Long.toString(Long.parseLong(jvmName.substring(0, index)));
    }

}
