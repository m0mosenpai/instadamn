package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8lY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC195888lY {
    public static final boolean A01(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C37101o8.A06 != null && AbstractC195898lZ.A00(context, userSession)) {
            return true;
        }
        return false;
    }

    public static final C37101o8 A00() {
        C37101o8 c37101o8 = C37101o8.A06;
        if (c37101o8 == null) {
            C14360o3.A0F("plugin");
            throw C00O.createAndThrow();
        }
        return c37101o8;
    }
}
