package X;

import com.facebook.mqtt.service.MqttSubscribeListener;

/* loaded from: classes9.dex */
public final class PPS implements Runnable {
    public final /* synthetic */ C51757Mtg A00;
    public final /* synthetic */ C4MX A01;

    public PPS(C51757Mtg c51757Mtg, C4MX c4mx) {
        this.A01 = c4mx;
        this.A00 = c51757Mtg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20H c20h = this.A01.A00;
        if (c20h != null) {
            C51757Mtg c51757Mtg = this.A00;
            c20h.subscribe(c51757Mtg.A02, (C4QA) c51757Mtg.A01, (MqttSubscribeListener) c51757Mtg.A00);
        }
    }
}
