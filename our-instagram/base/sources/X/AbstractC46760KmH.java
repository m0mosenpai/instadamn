package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.KmH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46760KmH {
    public static final void A00(Context context, UserSession userSession) {
        AbstractC167007dF.A1K(context, userSession);
        C59692oC A00 = AbstractC59652o8.A00(userSession);
        if (A00.A05 && A00.A08) {
            HashMap A1G = AbstractC166987dD.A1G();
            AbstractC59652o8.A03(A1G, A00.A01);
            C50992Vv c50992Vv = new C50992Vv(0, 0, 0, false, 0, 2);
            if (C18U.A06(C06090Tz.A05, userSession, 36328942219181963L)) {
                C14120nc.A00().ATO(new KME(context, c50992Vv, A1G));
            } else {
                C50802Vb.A05(context, c50992Vv, A1G);
            }
        }
    }
}
