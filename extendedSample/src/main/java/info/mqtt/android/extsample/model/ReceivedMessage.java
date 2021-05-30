package info.mqtt.android.extsample.model;

import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Date;

import androidx.annotation.NonNull;


public class ReceivedMessage {
    private final String topic;
    private final MqttMessage message;
    private final Date timestamp;

    public ReceivedMessage(String topic, MqttMessage message) {
        this.topic = topic;
        this.message = message;
        this.timestamp = new Date();
    }

    public String getTopic() {
        return topic;
    }

    public MqttMessage getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @NonNull
    @Override
    public String toString() {
        return "ReceivedMessage{" +
                "topic='" + topic + '\'' +
                ", message=" + message +
                ", timestamp=" + timestamp +
                '}';
    }
}