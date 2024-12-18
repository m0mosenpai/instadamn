package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145926hp {
    public final C145916ho A00;
    public final int A01;
    public final C1P3 A02;
    public final UserSession A03;
    public final boolean A04;
    public final boolean A05;

    public C145926hp(UserSession userSession, C145916ho c145916ho) {
        C14360o3.A0B(userSession, 1);
        this.A00 = c145916ho;
        this.A02 = C1P2.A00(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = (int) C18U.A01(c06090Tz, userSession, 36595462119098518L);
        this.A04 = C18U.A06(c06090Tz, userSession, 36313987142453612L);
        this.A05 = C18U.A06(c06090Tz, userSession, 36313987142519149L);
        this.A03 = userSession;
    }

    public final void A00(boolean z) {
        C145916ho c145916ho;
        if (this.A04) {
            UserSession userSession = this.A03;
            long j = C23051Ak.A02;
            boolean A00 = C23061Al.A00(userSession).A00(EnumC23071Am.A0g);
            if (!this.A05 || A00) {
                return;
            }
        }
        if (z) {
            if (C18U.A06(C06090Tz.A05, this.A03, 36313987142584686L)) {
                c145916ho = this.A00;
                c145916ho.A00();
            }
        }
        c145916ho = this.A00;
        if (c145916ho.A00.A0C.A03.size() < this.A01) {
            return;
        }
        c145916ho.A00();
    }
}
