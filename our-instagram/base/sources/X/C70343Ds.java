package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70343Ds {
    public static final /* synthetic */ C70343Ds A00 = new Object();

    public static final InterfaceC70363Du A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        return (InterfaceC70363Du) userSession.A01(C70353Dt.class, new C9F9(45, context, userSession));
    }

    public static final String A01(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        String str = c47z.A3O;
        if (str == null) {
            String str2 = c47z.A3b;
            if (str2 == null) {
                return c47z.A3t;
            }
            return str2;
        }
        return str;
    }
}
