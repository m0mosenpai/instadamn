package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28071Xl {
    public final C28091Xn A00;

    public static C28091Xn A00(Context context, UserSession userSession) {
        C28071Xl c28071Xl = (C28071Xl) userSession.A00(C28071Xl.class);
        if (c28071Xl == null) {
            c28071Xl = new C28071Xl(new C28091Xn(context, userSession, "impression_store", AbstractC28081Xm.A00(userSession)));
            userSession.A04(C28071Xl.class, c28071Xl);
        }
        return c28071Xl.A00;
    }

    public C28071Xl(C28091Xn c28091Xn) {
        this.A00 = c28091Xn;
    }
}
