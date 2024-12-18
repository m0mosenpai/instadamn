package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.YIj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73538YIj implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MqttSubscribeListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public RunnableC73538YIj(MqttSubscribeListener mqttSubscribeListener, XplatNativeClientWrapper xplatNativeClientWrapper, String str, byte[] bArr, long j) {
        this.A02 = xplatNativeClientWrapper;
        this.A01 = mqttSubscribeListener;
        this.A03 = str;
        this.A04 = bArr;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onData");
        }
        this.A01.onData(this.A03, this.A04, this.A00);
    }
}
