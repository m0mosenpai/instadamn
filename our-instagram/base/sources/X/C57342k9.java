package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57342k9 {
    public final synchronized C57332k8 A00(Context context, UserSession userSession) {
        C57332k8 c57332k8;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        c57332k8 = (C57332k8) userSession.A00(C57332k8.class);
        if (c57332k8 == null) {
            Context applicationContext = context.getApplicationContext();
            C1H6.A01(applicationContext);
            C14360o3.A0A(applicationContext);
            C57352kA A05 = C57352kA.A05(userSession);
            C14360o3.A07(A05);
            c57332k8 = new C57332k8(applicationContext, userSession, A05);
            userSession.A04(C57332k8.class, c57332k8);
        }
        return c57332k8;
    }
}
