package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43091yc implements InterfaceC12870lZ, InterfaceC13000lm {
    public UserSession A00;

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(1803080447, C0f9.A03(523660433));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-93225517, C0f9.A03(-2133455164));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
