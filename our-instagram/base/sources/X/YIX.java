package X;

import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YIX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttPublishListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ byte[] A03;

    public YIX(MqttPublishListener mqttPublishListener, XplatNativeClientWrapper xplatNativeClientWrapper, byte[] bArr, int i) {
        this.A02 = xplatNativeClientWrapper;
        this.A01 = mqttPublishListener;
        this.A00 = i;
        this.A03 = bArr;
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
        this.A01.onSuccess(this.A00);
    }
}
