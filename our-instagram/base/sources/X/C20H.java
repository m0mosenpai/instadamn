package X;

import android.content.Context;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import java.util.List;

/* renamed from: X.20H, reason: invalid class name */
/* loaded from: classes.dex */
public interface C20H {
    boolean cancelPublish(int i);

    void kickOffConnection();

    void onNetworkAvailable();

    void onNetworkInterfaceChanged(int i);

    void onNetworkUnavailable();

    int publish(String str, byte[] bArr, C4QA c4qa, MqttPublishListener mqttPublishListener);

    void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener);

    boolean start(Context context, ConnectionConfig connectionConfig, C4P5 c4p5, MqttSubscribeListener mqttSubscribeListener);

    void stop();

    boolean subscribe(String str, C4QA c4qa, MqttSubscribeListener mqttSubscribeListener);

    boolean unsubscribe(List list);

    boolean verifyAuthToken(String str);
}
