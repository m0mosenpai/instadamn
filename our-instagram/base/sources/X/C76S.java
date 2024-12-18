package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.76S, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C76S {
    public static final C76T A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        Context applicationContext = context.getApplicationContext();
        C14360o3.A0A(applicationContext);
        return new C76T(applicationContext, C26661Qv.A00(userSession), userSession);
    }
}
