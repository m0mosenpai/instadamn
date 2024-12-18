package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.instagram.realtimeclient.RealtimeClientManager;
import kotlin.Deprecated;

@Deprecated(message = "For supporting multi-instances, we disabled the mqtt in msys.")
/* renamed from: X.L1c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47617L1c {
    public int A00 = -1;
    public final MqttNetworkSessionPlugin A01;
    public final RealtimeClientManager A02;

    public C47617L1c(MqttNetworkSessionPlugin mqttNetworkSessionPlugin, RealtimeClientManager realtimeClientManager) {
        this.A02 = realtimeClientManager;
        this.A01 = mqttNetworkSessionPlugin;
    }
}
