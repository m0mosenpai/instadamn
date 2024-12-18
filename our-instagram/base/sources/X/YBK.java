package X;

import com.facebook.mqtt.service.MqttPublishExtListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class YBK implements MqttPublishExtListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttPublishExtListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public YBK(MqttPublishExtListener mqttPublishExtListener, XplatNativeClientWrapper xplatNativeClientWrapper, String str, byte[] bArr, int i) {
        this.A03 = str;
        this.A02 = xplatNativeClientWrapper;
        this.A01 = mqttPublishExtListener;
        this.A00 = i;
        this.A04 = bArr;
    }

    @Override // com.facebook.mqtt.service.MqttPublishExtListener
    public final void onPublishAttempt(int i, int i2, int i3, int i4, int i5) {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            C14360o3.A0F("callbackExecutor");
            throw C00O.createAndThrow();
        }
        executor.execute(new RunnableC73541YIm(this.A01, this.A00, i2, i3, i4, i5));
    }

    @Override // com.facebook.mqtt.service.MqttPublishExtListener
    public final void onPublishCompleted(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        String A0g;
        int i7;
        String A00 = AbstractC111324zv.A00(4936);
        String str = this.A03;
        if (z) {
            A0g = AnonymousClass001.A0g(A00, str, ":success");
            i7 = 1339573902;
        } else {
            A0g = AnonymousClass001.A0g(A00, str, ":fail");
            i7 = -361391219;
        }
        AbstractC09800fd.A01(A0g, i7);
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            C14360o3.A0F("callbackExecutor");
            throw C00O.createAndThrow();
        }
        executor.execute(new YIv(this.A01, xplatNativeClientWrapper, this.A04, this.A00, i2, i3, i4, i5, i6, z));
        AbstractC09800fd.A00(-1629706810);
    }
}
