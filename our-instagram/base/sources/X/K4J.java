package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;

/* loaded from: classes8.dex */
public final class K4J extends AbstractRunnableC94874Os {
    public final /* synthetic */ MqttNetworkSessionPlugin A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K4J(com.facebook.msys.mcd.MqttNetworkSessionPlugin r2) {
        /*
            r1 = this;
            r0 = 1155(0x483, float:1.618E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.A00 = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K4J.<init>(com.facebook.msys.mcd.MqttNetworkSessionPlugin):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onMqttDisconnected();
    }
}
