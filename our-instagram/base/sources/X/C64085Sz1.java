package X;

import com.facebook.mqtt.service.MqttPublishListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Sz1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64085Sz1 implements MqttPublishListener {
    public final int A01;
    public final C4QA A02;
    public final String A03;
    public final byte[] A05;
    public final MqttPublishListener A06;
    public final /* synthetic */ C4MW A07;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public AtomicBoolean A00 = new AtomicBoolean(false);

    public C64085Sz1(MqttPublishListener mqttPublishListener, C4MW c4mw, C4QA c4qa, String str, byte[] bArr, int i) {
        this.A07 = c4mw;
        this.A03 = str;
        this.A05 = bArr;
        this.A02 = c4qa;
        this.A06 = mqttPublishListener;
        this.A01 = i;
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onFailure(int i, int i2) {
        MqttPublishListener mqttPublishListener;
        if (this.A04.compareAndSet(false, true) && (mqttPublishListener = this.A06) != null) {
            mqttPublishListener.onFailure(this.A01, i2);
        }
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onSuccess(int i) {
        MqttPublishListener mqttPublishListener;
        if (this.A04.compareAndSet(false, true) && (mqttPublishListener = this.A06) != null) {
            mqttPublishListener.onSuccess(this.A01);
        }
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onTimeout(int i, boolean z) {
        MqttPublishListener mqttPublishListener;
        if (this.A04.compareAndSet(false, true) && (mqttPublishListener = this.A06) != null) {
            mqttPublishListener.onTimeout(this.A01, z);
        }
    }
}
