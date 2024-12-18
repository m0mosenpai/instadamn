package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.7YM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YM implements C7YN {
    public C7T3 A00;
    public RtcStartCoWatchPlaybackArguments A01;
    public Boolean A02;
    public boolean A03 = true;
    public final InterfaceC16600sD A04;

    public C7YM(InterfaceC16600sD interfaceC16600sD) {
        this.A04 = interfaceC16600sD;
    }

    @Override // X.C7YN
    public final void En8(String str) {
        if (this.A03) {
            C0K8.A0Q(C51B.__redex_internal_original_name, "DirectStartCallDelegate.startCall called while in cleared state. Entry point: %s", this.A00);
            return;
        }
        InterfaceC16600sD interfaceC16600sD = this.A04;
        C7T3 c7t3 = this.A00;
        if (c7t3 != null) {
            Boolean bool = this.A02;
            if (bool != null) {
                interfaceC16600sD.invoke(c7t3, bool, this.A01, null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
