package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226959zr {
    public static final void A00(Context context, UserSession userSession, C128175qm c128175qm, C47Z c47z, C49602Pt c49602Pt) {
        C47v c47v;
        C8r2 c8r2;
        boolean A1U = AbstractC167007dF.A1U(c49602Pt);
        C115595Kt c115595Kt = c47z.A1P;
        if (c115595Kt == null) {
            List list = c128175qm.A0v;
            C203248yh c203248yh = c128175qm.A0C;
            if (c203248yh != null && (c8r2 = c203248yh.A01) != null) {
                c47v = c8r2.A07;
            } else {
                c47v = null;
            }
            c115595Kt = A1S.A00(c47v, list, c128175qm.A0j, null);
            c47z.A1P = c115595Kt;
        }
        if (c47z.A0r == null) {
            c47z.A0r = AbstractC23119AKd.A01(context, userSession, c115595Kt, c49602Pt, A1U);
        }
    }
}
