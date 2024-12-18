package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4qJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106044qJ {
    public C23591Acl A00;
    public final C18240vB A01;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2pI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.2pF] */
    public final void A00(InterfaceC57948Pmu interfaceC57948Pmu) {
        UserSession userSession;
        int A00;
        C23591Acl c23591Acl = this.A00;
        if (c23591Acl != null) {
            c23591Acl.A04();
        }
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        if ((A05 instanceof UserSession) && (userSession = (UserSession) A05) != null && AbstractC195758lG.A00(userSession) != C05F.A00) {
            C23591Acl c23591Acl2 = new C23591Acl(userSession, new Object(), new Object());
            this.A00 = c23591Acl2;
            long currentTimeMillis = System.currentTimeMillis();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36327559240759995L)) {
                A00 = (int) C18U.A01(c06090Tz, userSession, 36609034216150841L);
            } else if (new C43898Jb8(userSession).A00() == null) {
                A00 = 60;
            } else {
                A00 = C60322pF.A00(userSession);
            }
            c23591Acl2.A03 = (int) ((currentTimeMillis - (A00 * 86400000)) / 1000);
            this.A01.ATO(new C52382NGd(userSession, c23591Acl2, interfaceC57948Pmu));
        }
    }

    public C106044qJ() {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "MediaScannerJobService";
        this.A01 = new C18240vB(A00);
    }
}
