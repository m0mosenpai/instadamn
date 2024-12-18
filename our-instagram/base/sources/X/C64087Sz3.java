package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatServiceDelegate$remoteBinder$1;
import com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy;

/* renamed from: X.Sz3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64087Sz3 implements MqttSubscribeListener {
    public final /* synthetic */ XplatServiceDelegate$remoteBinder$1 A00;
    public final /* synthetic */ IMqttSubscribeListener$Stub$Proxy A01;

    @Override // com.facebook.mqtt.service.MqttSubscribeListener
    public final void onData(String str, byte[] bArr, long j) {
        AbstractC167007dF.A1K(str, bArr);
        this.A00.A00(new D8e(this.A01, bArr, str, 0, j));
    }

    @Override // com.facebook.mqtt.service.MqttSubscribeListener
    public final void onSubscriptionResponse(String str, boolean z, int i) {
        C14360o3.A0B(str, 0);
        this.A00.A00(new D8d(this.A01, str, i, 0, z));
    }

    public C64087Sz3(XplatServiceDelegate$remoteBinder$1 xplatServiceDelegate$remoteBinder$1, IMqttSubscribeListener$Stub$Proxy iMqttSubscribeListener$Stub$Proxy) {
        this.A00 = xplatServiceDelegate$remoteBinder$1;
        this.A01 = iMqttSubscribeListener$Stub$Proxy;
    }
}
