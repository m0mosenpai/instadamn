package X;

import com.facebook.mqtt.service.MqttPublishExtListener;

/* renamed from: X.YIm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73541YIm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ MqttPublishExtListener A05;

    public RunnableC73541YIm(MqttPublishExtListener mqttPublishExtListener, int i, int i2, int i3, int i4, int i5) {
        this.A05 = mqttPublishExtListener;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A00 = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A05.onPublishAttempt(this.A03, this.A02, this.A01, this.A04, this.A00);
    }
}
