package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.I5o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40786I5o {
    public static final boolean A00(C99074cU c99074cU, UserSession userSession, L23 l23, C47715L4w c47715L4w) {
        boolean A1U = AbstractC167007dF.A1U(c47715L4w);
        if (c99074cU == null) {
            return A1U;
        }
        boolean A1O = AbstractC167007dF.A1O(((System.currentTimeMillis() - c99074cU.A00) > l23.A00 ? 1 : ((System.currentTimeMillis() - c99074cU.A00) == l23.A00 ? 0 : -1)));
        boolean z = true;
        C1IH c1ih = (C1IH) C1IC.A00(userSession).A00.get("discover/topical_explore/");
        if (c1ih != null) {
            boolean z2 = c1ih.A03;
            if (Boolean.valueOf(z2) != null) {
                z = !z2;
            }
        }
        if (A1O || !z) {
            return false;
        }
        return true;
    }
}
