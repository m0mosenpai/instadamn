package X;

import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.YIi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73537YIi implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttPublishListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ byte[] A04;

    public RunnableC73537YIi(MqttPublishListener mqttPublishListener, XplatNativeClientWrapper xplatNativeClientWrapper, byte[] bArr, int i, boolean z) {
        this.A02 = xplatNativeClientWrapper;
        this.A01 = mqttPublishListener;
        this.A00 = i;
        this.A03 = z;
        this.A04 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onPublish");
        }
        this.A01.onTimeout(this.A00, this.A03);
    }
}
