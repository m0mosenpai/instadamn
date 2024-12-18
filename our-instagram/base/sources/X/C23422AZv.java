package X;

import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.AZv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23422AZv implements InterfaceC25159BBe {
    public final /* synthetic */ InterfaceC25159BBe A00;
    public final /* synthetic */ C176097sS A01;
    public final /* synthetic */ Integer A02;

    public C23422AZv(InterfaceC25159BBe interfaceC25159BBe, C176097sS c176097sS, Integer num) {
        this.A01 = c176097sS;
        this.A02 = num;
        this.A00 = interfaceC25159BBe;
    }

    @Override // X.InterfaceC25159BBe
    public final void onFinished() {
        this.A01.A04(new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, AnonymousClass001.A0R("prepare must be called before start. Current state: ", C9LW.A00(this.A02))));
        this.A00.onFinished();
    }
}
