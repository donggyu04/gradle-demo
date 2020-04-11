import javax.inject.Inject
import org.gradle.api.DefaultTask

public class CustomTask extends DefaultTask {
    final String message;
    final int number;

    @Inject
    CustomTask(String message, int number) {
        this.message = message;
        this.number = number;
    }
}
