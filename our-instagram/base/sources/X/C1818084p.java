package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.84p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1818084p {
    public final C24Q A00;
    public final UserSession A01;

    public final long A00() {
        long A04;
        C24Q c24q = this.A00;
        synchronized (c24q) {
            A04 = c24q.A04(null, null, 17640443, 10000L);
        }
        return A04;
    }

    public /* synthetic */ C1818084p(UserSession userSession) {
        C24Q c24q = new C24Q(userSession);
        this.A01 = userSession;
        this.A00 = c24q;
    }

    public final void A01(long j) {
        C24Q c24q = this.A00;
        synchronized (c24q) {
            c24q.A02(17640443, j);
        }
    }

    public final void A02(long j, String str) {
        C24Q c24q = this.A00;
        synchronized (c24q) {
            c24q.A07(str, "", 17640443, j);
        }
    }

    public final void A03(long j, String str) {
        C24Q c24q = this.A00;
        synchronized (c24q) {
            c24q.A0D(str, j, null, null, null, null);
        }
    }
}
