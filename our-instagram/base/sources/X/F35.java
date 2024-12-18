package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F35 {
    public static final boolean A00(UserSession userSession, E70 e70) {
        int i;
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A08;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 431) && (i = e70.A09) != 29 && i != 26 && i != 24) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            long A0H = AbstractC166987dD.A0H(AbstractC31171DnF.A0Y(A002, A002.A07, c0yrArr, 430));
            C06090Tz c06090Tz = C06090Tz.A05;
            if (A0H < C18U.A01(c06090Tz, userSession, 36608085028640435L) && C18U.A06(c06090Tz, userSession, 36326610051872760L) && C18U.A06(c06090Tz, userSession, 36326610051282928L)) {
                return true;
            }
        }
        return false;
    }
}
