package X;

import android.os.Looper;
import com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate;

/* loaded from: classes12.dex */
public final class XXc extends AbstractHandlerC72132XPe {
    public final /* synthetic */ MqttBackgroundServiceDelegate A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XXc(Looper looper, MqttBackgroundServiceDelegate mqttBackgroundServiceDelegate) {
        super(looper, mqttBackgroundServiceDelegate);
        this.A00 = mqttBackgroundServiceDelegate;
    }
}
