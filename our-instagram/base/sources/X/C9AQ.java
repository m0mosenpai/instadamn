package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9AQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9AQ {
    public static final C9AQ A00 = new Object();

    public final String A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("getInitializeMailboxDelayMs: ");
        long A01 = C18U.A01(C06090Tz.A06, userSession, 36607367770084951L);
        C14360o3.A0A(Long.valueOf(A01));
        sb.append(A01);
        sb.append("enableEarlyDBInjectionOnAccountSessionInitialization: ");
        sb.append(C6E9.A00(userSession, AbstractC20100yh.A00(36325892793644530L), false));
        sb.append("\nenableMEMLoginWait: ");
        sb.append(C6E9.A00(userSession, AbstractC20100yh.A00(36325892792464870L), false));
        sb.append("\nshouldNotWaitForMailboxBootstrapForEB: ");
        sb.append(C6E9.A00(userSession, AbstractC20100yh.A00(36325892793251311L), false));
        sb.append("\nisMailboxBootstrapNotExpected: ");
        sb.append(false);
        sb.append("\nshouldThrowOnUnsatisfiedMailboxDependence: ");
        sb.append(C6E9.A00(userSession, AbstractC20100yh.A00(36325892792923627L), false));
        sb.append('\n');
        return sb.toString();
    }
}
