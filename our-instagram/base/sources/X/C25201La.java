package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1La, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25201La implements InterfaceC12870lZ, InterfaceC13000lm {
    public C25331Ln A00 = new C25331Ln();
    public boolean A01 = false;
    public final C25301Lk A02;
    public final UserSession A03;
    public final InterfaceC14020nS A04;

    public C25201La(C25301Lk c25301Lk, UserSession userSession, InterfaceC14020nS interfaceC14020nS) {
        this.A03 = userSession;
        this.A02 = c25301Lk;
        this.A04 = interfaceC14020nS;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1678308291);
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36316203346366579L)) {
            C25331Ln c25331Ln = this.A00;
            if (!c25331Ln.A00.isEmpty()) {
                C1GJ.A03(c25331Ln.A01(userSession));
            }
        } else {
            this.A04.ATO(new C31582DuA(this));
        }
        this.A01 = false;
        C0f9.A0A(407820513, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1867879719);
        if (!C18U.A06(C06090Tz.A05, this.A03, 36316203346366579L)) {
            this.A04.ATO(new C31653DvJ(this));
        }
        C0f9.A0A(828219110, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A07(this);
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36316203346366579L)) {
            C25331Ln c25331Ln = this.A00;
            if (!c25331Ln.A00.isEmpty()) {
                C1GJ.A03(c25331Ln.A01(userSession));
                return;
            }
            return;
        }
        this.A04.ATO(new C31582DuA(this));
    }
}
