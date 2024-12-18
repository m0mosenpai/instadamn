package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.12C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12C extends AbstractC211911v {
    public final C211211o A00;
    public final String A01;
    public final boolean A02;

    @Override // X.AbstractC211911v
    public final String A06() {
        return this.A01;
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        UserSession userSession;
        Integer num;
        if (!this.A02) {
            AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
            if (A08 instanceof UserSession) {
                userSession = (UserSession) A08;
            } else {
                userSession = null;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A08, 36325175532598096L)) {
                C1BD c1bd = C1BD.A00;
                if (userSession != null) {
                    c1bd.A00(userSession);
                    return;
                }
                return;
            }
            if (C18U.A06(c06090Tz, A08, 36325175532532559L)) {
                num = C05F.A00;
            } else if (!C18U.A06(c06090Tz, A08, 36325175532729170L)) {
                return;
            } else {
                num = C05F.A01;
            }
            NGA nga = new NGA(userSession);
            if (num == C05F.A00) {
                C14120nc.A00().ATO(nga);
            } else {
                C1C8.A00.A00(nga);
            }
        }
    }

    public C12C(C211211o c211211o, boolean z) {
        String str;
        this.A00 = c211211o;
        this.A02 = z;
        if (z) {
            str = "-shell";
        } else {
            str = "";
        }
        this.A01 = AnonymousClass001.A0R("TNTSInitializer", str);
    }
}
