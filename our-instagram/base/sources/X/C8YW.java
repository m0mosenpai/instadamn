package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8YW, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8YW {
    public static final List A00 = AbstractC16960so.A1Q(C22P.A5b, C22P.A43, C22P.A44, C22P.A5c, C22P.A3O, C22P.A0a, C22P.A0V, C22P.A45, C22P.A26, C22P.A0d, C22P.A3W, C22P.A3U, C22P.A40, C22P.A3z, C22P.A5P, C22P.A5Q, C22P.A4r, C22P.A4W, C22P.A4X, C22P.A4Y, C22P.A4b);

    public static final boolean A00(C22P c22p, AbstractC59962oe abstractC59962oe, UserSession userSession, C55U c55u, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(abstractC59962oe, 0);
        C14360o3.A0B(c22p, 1);
        C14360o3.A0B(c55u, 2);
        C14360o3.A0B(userSession, 3);
        Bundle bundle = abstractC59962oe.mArguments;
        if ((bundle == null || !bundle.getBoolean("ARGS_GALLERY_FIRST_ENABLED", false)) && !z3) {
            if (!z2 && !z) {
                if (!A01(c22p, userSession, c55u) && c22p != C22P.A0X && c22p != C22P.A0t && c22p != C22P.A1E && c22p != C22P.A1M && c22p != C22P.A3V && c22p != C22P.A3U && c22p != C22P.A0g && c22p != C22P.A0s && c22p != C22P.A5L && c22p != C22P.A5K && c22p != C22P.A5M) {
                    if (AbstractC1822486j.A00(c22p, userSession) == C05F.A00 && (c55u instanceof C81V)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A02(C22P c22p, UserSession userSession, C55U c55u, boolean z) {
        C14360o3.A0B(c22p, 0);
        C14360o3.A0B(c55u, 1);
        C14360o3.A0B(userSession, 2);
        if (!A01(c22p, userSession, c55u) && ((!AbstractC1822486j.A01(c22p, userSession) || z) && c22p != C22P.A1l && c22p != C22P.A0t)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C22P c22p, UserSession userSession, C55U c55u) {
        if (!C8YX.A00(c22p, userSession)) {
            if (!c55u.equals(C208509Kk.A00)) {
                return false;
            }
            if (c22p == C22P.A0a) {
                return C18U.A06(C06090Tz.A05, userSession, 36326296518801211L);
            }
            if (!A00.contains(c22p) && (c22p != C22P.A0W || !C18U.A06(C06090Tz.A05, userSession, 36326622936184833L))) {
                return false;
            }
        }
        return true;
    }
}
