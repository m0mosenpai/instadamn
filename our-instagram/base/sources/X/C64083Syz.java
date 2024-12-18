package X;

import com.facebook.mqtt.service.MqttPublishListener;

/* renamed from: X.Syz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64083Syz implements MqttPublishListener {
    public final /* synthetic */ InterfaceC65545TmK A00;

    public C64083Syz(InterfaceC65545TmK interfaceC65545TmK) {
        this.A00 = interfaceC65545TmK;
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onFailure(int i, int i2) {
        InterfaceC65545TmK interfaceC65545TmK = this.A00;
        if (interfaceC65545TmK != null) {
            interfaceC65545TmK.DFv(i, String.valueOf(i2));
        }
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onSuccess(int i) {
        InterfaceC65545TmK interfaceC65545TmK = this.A00;
        if (interfaceC65545TmK != null) {
            interfaceC65545TmK.onSuccess(i);
        }
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public final void onTimeout(int i, boolean z) {
        InterfaceC65545TmK interfaceC65545TmK = this.A00;
        if (interfaceC65545TmK != null) {
            interfaceC65545TmK.DcP(i);
        }
    }
}
