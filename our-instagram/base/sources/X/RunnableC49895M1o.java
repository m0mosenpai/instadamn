package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.M1o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49895M1o implements Runnable {
    public final /* synthetic */ KCO A00;

    public RunnableC49895M1o(KCO kco) {
        this.A00 = kco;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        final LLk A06 = this.A00.A06();
        if (A06.A01 != 0) {
            UserSession userSession = A06.A0h;
            C06090Tz c06090Tz = C06090Tz.A05;
            long A01 = C18U.A01(c06090Tz, userSession, 36609536727783329L);
            if (A01 != 0 && System.currentTimeMillis() - A06.A01 < A01) {
                if (C18U.A06(c06090Tz, userSession, 36328061751344267L)) {
                    A06.A0Z.postDelayed(new Runnable() { // from class: X.M1n
                        @Override // java.lang.Runnable
                        public final void run() {
                            LLk.this.A0r.A00();
                        }
                    }, 500L);
                    return;
                } else {
                    A06.A0r.A00();
                    return;
                }
            }
        }
        if (A06.A0R || (!A06.A0O && A06.A02 == EnumC46220Kcw.A06 && C2E8.A00(A06.A0h))) {
            z = true;
        } else {
            z = false;
        }
        A06.A0R = z;
        C44180Jfj c44180Jfj = A06.A0n;
        c44180Jfj.A06(A06.A0W(), C05F.A0N);
        c44180Jfj.A04("ptr_attempt", null);
        C45527KDs c45527KDs = A06.A06;
        if (c45527KDs != null) {
            A06.A03.A03(A06.A0i.Bsj(), "MANUAL_REFRESH", (java.util.Set) c45527KDs.A04.getValue());
        }
        A06.A0m(true, false);
    }
}
