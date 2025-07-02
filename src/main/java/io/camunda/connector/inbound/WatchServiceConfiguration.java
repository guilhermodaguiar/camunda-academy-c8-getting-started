package io.camunda.connector.inbound;

import jakarta.validation.constraints.NotEmpty;

public class WatchServiceConfiguration {
    @NotEmpty
    private String eventToMonitor;

    @NotEmpty
    private String directory;

    @NotEmpty
    private String pollingInterval;

    // Getters and Setters
    public String getEventToMonitor() {
        return eventToMonitor;
    }

    public void setEventToMonitor(String eventToMonitor) {
        this.eventToMonitor = eventToMonitor;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getPollingInterval() {
        return pollingInterval;
    }

    public void setPollingInterval(String pollingInterval) {
        this.pollingInterval = pollingInterval;
    }
}