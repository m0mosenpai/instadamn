package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Km1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46744Km1 {
    public static final void A00(UserSession userSession, Context context, boolean z) {
        boolean A0E;
        int i;
        AbstractC167017dG.A1N(context, userSession);
        if (z) {
            i = 2131960763;
        } else {
            if (C18U.A06(C06090Tz.A05, userSession, 36331252910998753L)) {
                A0E = AbstractC15820qc.A0F(context);
            } else {
                A0E = AbstractC15820qc.A0E(AbstractC166987dD.A0O(context));
            }
            if (A0E) {
                C47964LHk.A00("DirectWeakConnectionError");
                i = 2131960869;
            } else {
                i = 2131959975;
            }
        }
        C9GR.A07(context, i);
    }
}
