package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NyT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54248NyT {
    public static final float A00(UserSession userSession, Float f, float f2) {
        float f3 = 0.8f;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 1), userSession, 36325154057827115L)) {
            f3 = 0.75f;
        }
        if (f != null) {
            f3 = Math.max(f.floatValue(), f3);
        }
        return Math.min(1.91f, Math.max(f2, f3));
    }
}
