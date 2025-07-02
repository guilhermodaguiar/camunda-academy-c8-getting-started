import io.camunda.connector.inbound.MyConnectorProperties;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import io.camunda.connector.test.inbound.InboundConnectorContextBuilder;

public class FileWatchConnectorTest {
    private final String eventToMonitor = "ENTRY_CREATE";
    //Replace with your directory test
    private final String directory = "C:\\Users\\guilhermodaguiar\\Camunda\\downloads";
    private final String pollingInterval = "30";

    @Test
    void shouldFailWhenValidate_NoEventToMonitor() {
        // given
        var input = new MyConnectorProperties(eventToMonitor, directory, pollingInterval);
        var context = InboundConnectorContextBuilder.create().properties(input).build();

        // when
        var connectorInput = context.bindProperties(MyConnectorProperties.class);

        // then
        assertThat(connectorInput)
                .isInstanceOf(MyConnectorProperties.class)
                .extracting("eventToMonitor")
                .isEqualTo("ENTRY_CREATE");
    }

    @Test
    void shouldFailWhenValidate_NoDirectory() {
        // given
        var input = new MyConnectorProperties(eventToMonitor, directory, pollingInterval);
        var context = InboundConnectorContextBuilder.create().properties(input).build();

        // when
        var connectorInput = context.bindProperties(MyConnectorProperties.class);

        // then
        assertThat(connectorInput)
                .isInstanceOf(MyConnectorProperties.class)
                .extracting("directory")
                .isEqualTo("C:\\Users\\guilhermodaguiar\\Camunda\\downloads");
    }

    @Test
    void shouldFailWhenValidate_NoPollingInterval() {
        // given
        var input = new MyConnectorProperties(eventToMonitor, directory, pollingInterval);
        var context = InboundConnectorContextBuilder.create().properties(input).build();

        // when
        var connectorInput = context.bindProperties(MyConnectorProperties.class);

        // then
        assertThat(connectorInput)
                .isInstanceOf(MyConnectorProperties.class)
                .extracting("pollingInterval")
                .isEqualTo("30");
    }
}