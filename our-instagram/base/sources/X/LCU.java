package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LCU {
    public static final void A00(ListenableFuture listenableFuture, C7X3 c7x3, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, c7x3, listenableFuture);
        if (str != null) {
            c7x3.A03(str, false);
            c7x3.A05(str, A1R);
            AbstractRunnableC133325zz.A02(new C44289Jhf(new C50269MHy(str, c7x3, 40), 11), listenableFuture, C1M8.A01);
        }
    }

    public static final boolean A01(UserSession userSession, boolean z) {
        long j;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z) {
            j = 36602084959195703L;
        } else {
            j = 36602084958999093L;
        }
        long A01 = C18U.A01(c06090Tz, userSession, j);
        C14360o3.A0A(Long.valueOf(A01));
        if (A01 <= 0 || AbstractC50712Us.A01.A08(A01) != 0) {
            return false;
        }
        return true;
    }
}
