package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;

/* loaded from: classes8.dex */
public final class K4T extends AbstractRunnableC94874Os {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttNetworkSessionPlugin A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4T(MqttNetworkSessionPlugin mqttNetworkSessionPlugin, int i) {
        super("onMqttPubAckTimeout");
        this.A01 = mqttNetworkSessionPlugin;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.onMqttPubAckTimeout(this.A00);
    }
}
