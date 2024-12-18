package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.229, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass229 {
    public static final C22C A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C22C c22c = (C22C) userSession.A00(C22C.class);
        if (c22c == null) {
            return A00(null, userSession, null, null, null, null);
        }
        return c22c;
    }

    public static final void A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C22C c22c = (C22C) userSession.A00(C22C.class);
        if (c22c != null) {
            userSession.A03(C22C.class);
            C22C.A0B(c22c, "onDestroy()");
        }
    }

    public static final C22C A00(Context context, UserSession userSession, String str, String str2, String str3, String str4) {
        String str5;
        C22C c22c = (C22C) userSession.A00(C22C.class);
        if (c22c != null) {
            AbstractC12120kG.A08("IgCameraLoggerFactory", "IgCameraLoggerFactory object already exist", new IllegalArgumentException("IgCameraLoggerFactory object already exist"));
            C22C.A0B(c22c, "onDestroy()");
        }
        if (context != null) {
            str5 = context.getPackageName();
        } else {
            str5 = null;
        }
        C22C c22c2 = new C22C(userSession, str, str2, str3, str4, str5);
        userSession.A04(C22C.class, c22c2);
        return c22c2;
    }
}
