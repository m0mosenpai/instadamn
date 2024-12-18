package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Q4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Q4 implements InterfaceC13000lm {
    public C0TY A00 = C0TY.GREEN;
    public boolean A01;
    public long A02;
    public C0TW A03;
    public boolean A04;
    public final UserSession A05;
    public final boolean A06;

    public final boolean A00() {
        if (C18U.A06(C06090Tz.A05, this.A05, 36317143943353155L) || this.A06 || this.A01) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A02 > 500) {
            this.A04 = !C3FU.A00(r7);
            this.A02 = currentTimeMillis;
        }
        return this.A04;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C1TU A01;
        C0TW c0tw = this.A03;
        if (c0tw != null && (A01 = C1TU.A01()) != null) {
            C14360o3.A0C(c0tw, "null cannot be cast to non-null type com.instagram.video.common.VideoAutoplayChecker.MemoryRedDisableAutoplay");
            A01.EFY(c0tw);
        }
    }

    public C3Q4(UserSession userSession) {
        boolean z;
        int A04;
        this.A05 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36329066772578302L) && ((A04 = C15900qk.A01().A04()) == 1 || A04 == 2)) {
            z = true;
        } else {
            z = false;
        }
        this.A06 = z;
        C1TU A01 = C1TU.A01();
        if (A01 != null && C18U.A06(c06090Tz, userSession, 36311642090242750L)) {
            InterfaceC18490vb interfaceC18490vb = new InterfaceC18490vb() { // from class: X.4p2
                @Override // X.InterfaceC18490vb
                public final void DO4(C0TY c0ty) {
                    C14360o3.A0B(c0ty, 0);
                    C3Q4 c3q4 = C3Q4.this;
                    c3q4.A01 = c0ty == C0TY.RED;
                    c3q4.A00 = c0ty;
                }
            };
            this.A03 = interfaceC18490vb;
            A01.A93(interfaceC18490vb);
            return;
        }
        this.A01 = false;
    }
}
