package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.Execution;

/* renamed from: X.MKd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50325MKd extends C0YY implements InterfaceC16660sJ {
    public static final C50325MKd A00 = new C50325MKd();

    public C50325MKd() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractRunnableC94874Os k4i;
        C95094Pu c95094Pu = (C95094Pu) obj;
        C14360o3.A0B(c95094Pu, 0);
        int intValue = c95094Pu.A00.intValue();
        if (intValue != 1) {
            MqttNetworkSessionPlugin mqttNetworkSessionPlugin = MqttNetworkSessionPlugin.get();
            if (intValue != 0) {
                k4i = new K4J(mqttNetworkSessionPlugin);
            } else {
                k4i = new K4H(mqttNetworkSessionPlugin);
            }
        } else {
            k4i = new K4I(MqttNetworkSessionPlugin.get());
        }
        Execution.executeAsync(k4i, null, 3);
        return C0eB.A00;
    }
}
