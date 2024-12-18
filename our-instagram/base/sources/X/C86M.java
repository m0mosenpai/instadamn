package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.86M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86M implements C86N {
    public long A00;
    public C55U A01;
    public boolean A02;
    public final C24Q A03;
    public final UserSession A04;

    @Override // X.C86N
    public final void D1k(String str) {
        if (this.A02) {
            this.A00 = this.A03.A06(CancelReason.USER_CANCELLED, str, 17629206, this.A00);
            this.A02 = false;
        }
    }

    @Override // X.C86N
    public final void DFm(C55U c55u, int i) {
        C14360o3.A0B(c55u, 1);
        if (this.A02) {
            C24Q c24q = this.A03;
            long j = this.A00;
            String valueOf = String.valueOf(i);
            c24q.A0B(j, "failure_code", valueOf, false);
            c24q.A07(valueOf, "", 17629206, this.A00);
            this.A02 = false;
        }
    }

    public /* synthetic */ C86M(UserSession userSession) {
        C24Q c24q = new C24Q(userSession);
        this.A04 = userSession;
        this.A03 = c24q;
        this.A00 = 17629206L;
    }
}
