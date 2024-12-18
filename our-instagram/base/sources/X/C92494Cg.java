package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4Cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92494Cg {
    public final C006802i A00;
    public final UserSession A01;
    public final boolean A02;

    public static final void A00(C92494Cg c92494Cg, C38321qM c38321qM) {
        C006802i c006802i;
        String A07 = AbstractC41071vF.A07(c92494Cg.A01, c38321qM);
        if (A07 != null && !AbstractC001900j.A0T(A07) && (c006802i = c92494Cg.A00) != null) {
            c006802i.markerAnnotate(1056313521, "ad_id", A07);
        }
    }

    public final void A01(InterfaceC16820sZ interfaceC16820sZ) {
        if (this.A02) {
            C0K8.A0D("cta_bar_misclick", (String) interfaceC16820sZ.invoke());
        }
    }

    public C92494Cg(UserSession userSession) {
        C006802i c006802i;
        this.A01 = userSession;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323328697576615L);
        this.A02 = A06;
        if (A06) {
            c006802i = C006802i.A0p;
        } else {
            c006802i = null;
        }
        this.A00 = c006802i;
    }
}
