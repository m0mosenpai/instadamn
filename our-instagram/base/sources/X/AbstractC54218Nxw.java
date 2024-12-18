package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nxw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54218Nxw {
    public static final void A00(UserSession userSession, C201848wH c201848wH) {
        C18V c18v;
        C1AC A02;
        String A00 = AbstractC58317Pt9.A00(308);
        String A0C = c201848wH.A0C(A00);
        if (A0C != null && A0C.length() != 0 && C18U.A06(C06090Tz.A05, userSession, 2342161450239269006L) && (c18v = C18V.A01) != null && (A02 = c18v.A02(userSession)) != null) {
            A02.A01.A00.A0A().logExposure(c201848wH.A0C(A00), 0L, "");
        }
    }
}
