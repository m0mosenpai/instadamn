package X;

import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.YIh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73536YIh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MqttPublishListener A02;
    public final /* synthetic */ XplatNativeClientWrapper A03;
    public final /* synthetic */ byte[] A04;

    public RunnableC73536YIh(MqttPublishListener mqttPublishListener, XplatNativeClientWrapper xplatNativeClientWrapper, byte[] bArr, int i, int i2) {
        this.A03 = xplatNativeClientWrapper;
        this.A02 = mqttPublishListener;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A03;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onPublish");
        }
        this.A02.onFailure(this.A01, this.A00);
    }
}
