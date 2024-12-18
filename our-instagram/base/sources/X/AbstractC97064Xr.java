package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97064Xr {
    public static final boolean A00(Context context, UserSession userSession, boolean z) {
        boolean A0G;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if (z) {
            A0G = AbstractC15820qc.A0D();
        } else {
            A0G = AbstractC15820qc.A0G(context);
        }
        if (!A0G) {
            if (!C3FU.A00(userSession)) {
                if (C1QA.A00(userSession).A01()) {
                    C14360o3.A07(AbstractC12290kX.A00);
                    if (!AbstractC15820qc.A0G(r0)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
