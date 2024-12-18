package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2JJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2JJ {
    public static boolean A00;

    public final void A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 2342156145952622382L)) {
            C907442n c907442n = new C907442n(new C2JM(), C9Z1.class, "IGUserConsentQuery", false);
            C907542o c907542o = new C907542o(userSession);
            c907542o.A08(c907442n);
            c907542o.A08 = "ads_viewer_context_policy";
            C1ON A07 = c907542o.A07(C05F.A01);
            A07.A00 = new C60899RbE(userSession, this);
            C1GJ.A03(A07);
        }
    }
}
