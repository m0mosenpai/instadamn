package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190308bo {
    public final C190298bn A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C190328bq c190328bq = (C190328bq) userSession.A01(C190328bq.class, C190318bp.A00);
        C190298bn c190298bn = c190328bq.A00;
        if (c190298bn == null) {
            C190298bn c190298bn2 = new C190298bn(context, userSession);
            c190328bq.A00 = c190298bn2;
            return c190298bn2;
        }
        return c190298bn;
    }

    public final C190298bn A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return ((C190328bq) userSession.A01(C190328bq.class, C190318bp.A00)).A00;
    }

    public final void A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 2342165766679570917L)) {
            ((C190328bq) userSession.A01(C190328bq.class, C190318bp.A00)).A00 = null;
        }
    }
}
