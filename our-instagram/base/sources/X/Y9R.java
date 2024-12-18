package X;

import com.facebook.proxygen.ProxygenRadioMeter;

/* loaded from: classes12.dex */
public final class Y9R implements C0C7 {
    public final ProxygenRadioMeter A00;

    @Override // X.C0C7
    public final boolean By4(C0SO c0so) {
        ProxygenRadioMeter.Metrics snapshot = this.A00.getSnapshot();
        c0so.A04 = (int) (snapshot.mqttActiveRadioTimeMs / 1000);
        c0so.A05 = (int) (snapshot.mqttTailRadioTimeMs / 1000);
        c0so.A0D = snapshot.mqttUpBytes;
        c0so.A0C = snapshot.mqttDownBytes;
        c0so.A06 = snapshot.mqttRequestCount;
        c0so.A07 = snapshot.mqttWakeupCount;
        c0so.A00 = (int) (snapshot.httpActiveRadioTimeMs / 1000);
        c0so.A01 = (int) (snapshot.httpTailRadioTimeMs / 1000);
        c0so.A0B = snapshot.httpUpBytes;
        c0so.A0A = snapshot.httpDownBytes;
        c0so.A02 = snapshot.httpRequestCount;
        c0so.A03 = snapshot.httpWakeupCount;
        c0so.A08 = (int) (snapshot.totalActiveRadioTimeMs / 1000);
        c0so.A09 = (int) (snapshot.totalTailRadioTimeMs / 1000);
        return true;
    }

    public Y9R(ProxygenRadioMeter proxygenRadioMeter) {
        this.A00 = proxygenRadioMeter;
    }
}
