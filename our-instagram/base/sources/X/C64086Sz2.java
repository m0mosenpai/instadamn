package X;

import com.facebook.mqtt.service.MqttPublishListener;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Sz2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64086Sz2 implements MqttPublishListener {
    public int A00;
    public final int A01;
    public final Object A02;

    public C64086Sz2(InterfaceC65545TmK interfaceC65545TmK, int i) {
        this.A01 = 1;
        this.A02 = interfaceC65545TmK;
        this.A00 = i;
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onFailure(int i, int i2) {
        if (this.A01 != 0) {
            InterfaceC65545TmK interfaceC65545TmK = (InterfaceC65545TmK) this.A02;
            if (interfaceC65545TmK != null) {
                interfaceC65545TmK.DFv(this.A00, String.valueOf(i2));
                return;
            }
            return;
        }
        ((CountDownLatch) this.A02).countDown();
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onSuccess(int i) {
        if (this.A01 != 0) {
            InterfaceC65545TmK interfaceC65545TmK = (InterfaceC65545TmK) this.A02;
            if (interfaceC65545TmK != null) {
                interfaceC65545TmK.onSuccess(this.A00);
                return;
            }
            return;
        }
        this.A00 = i;
        ((CountDownLatch) this.A02).countDown();
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onTimeout(int i, boolean z) {
        if (this.A01 != 0) {
            InterfaceC65545TmK interfaceC65545TmK = (InterfaceC65545TmK) this.A02;
            if (interfaceC65545TmK != null) {
                interfaceC65545TmK.DcP(this.A00);
                return;
            }
            return;
        }
        ((CountDownLatch) this.A02).countDown();
    }

    public C64086Sz2(CountDownLatch countDownLatch) {
        this.A01 = 0;
        this.A02 = countDownLatch;
        this.A00 = -1;
    }
}
