package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Km0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46743Km0 {
    public static final void A00(UserSession userSession, Context context, String str) {
        AbstractC167017dG.A1O(userSession, str);
        C44100JeP c44100JeP = new C44100JeP(userSession);
        if (C44100JeP.A04(c44100JeP) && c44100JeP.A00.getBoolean("EB_SHOW_DEBUG_TOASTS", false) && context != null) {
            C11T.A02(new RunnableC49944M3l(context, str));
        }
    }
}
