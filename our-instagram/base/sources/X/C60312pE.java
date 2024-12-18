package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2pE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60312pE {
    public final synchronized C60302pD A00(Context context, UserSession userSession) {
        C60302pD c60302pD;
        A01(userSession);
        c60302pD = new C60302pD(context, userSession);
        C218914p c218914p = C218914p.A08;
        C218914p.A03(EnumC220415e.A03, c60302pD);
        userSession.A04(C60302pD.class, c60302pD);
        return c60302pD;
    }

    public final synchronized void A01(UserSession userSession) {
        C60302pD c60302pD = (C60302pD) userSession.A00(C60302pD.class);
        if (c60302pD != null) {
            C218914p.A06(c60302pD);
        }
        userSession.A03(C60302pD.class);
    }
}
