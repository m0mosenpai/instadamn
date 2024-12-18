package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class YBL implements MqttSubscribeListener {
    public final /* synthetic */ MqttSubscribeListener A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;

    @Override // com.facebook.mqtt.service.MqttSubscribeListener
    public final void onData(String str, byte[] bArr, long j) {
        AbstractC167017dG.A1N(str, bArr);
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            C14360o3.A0F("callbackExecutor");
            throw C00O.createAndThrow();
        }
        executor.execute(new RunnableC73538YIj(this.A00, xplatNativeClientWrapper, str, bArr, j));
    }

    @Override // com.facebook.mqtt.service.MqttSubscribeListener
    public final void onSubscriptionResponse(String str, boolean z, int i) {
        C14360o3.A0B(str, 0);
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            C14360o3.A0F("callbackExecutor");
            throw C00O.createAndThrow();
        }
        executor.execute(new RunnableC73539YIk(this.A00, xplatNativeClientWrapper, str, i, z));
    }

    public YBL(MqttSubscribeListener mqttSubscribeListener, XplatNativeClientWrapper xplatNativeClientWrapper) {
        this.A01 = xplatNativeClientWrapper;
        this.A00 = mqttSubscribeListener;
    }
}
