package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.Pts, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58352Pts implements InterfaceC12870lZ {
    public final /* synthetic */ C47322Fa A00;

    public C58352Pts(C47322Fa c47322Fa) {
        this.A00 = c47322Fa;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1554033369);
        C47322Fa c47322Fa = this.A00;
        c47322Fa.A05.set(false);
        c47322Fa.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
        C0f9.A0A(751243773, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-994410647);
        C47322Fa c47322Fa = this.A00;
        c47322Fa.A05.set(true);
        c47322Fa.A01 = AwakeTimeSinceBootClock.INSTANCE.now();
        C0f9.A0A(686082652, A03);
    }
}
