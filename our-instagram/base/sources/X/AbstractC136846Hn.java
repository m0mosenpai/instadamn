package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136846Hn {
    public static final C136856Ho A00(InterfaceC132185xw interfaceC132185xw, UserSession userSession, Integer num, boolean z, boolean z2) {
        int A00;
        float f;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC132185xw, 1);
        if (num != null) {
            A00 = num.intValue();
        } else {
            A00 = (int) C18U.A00(C06090Tz.A05, userSession, 37163553150468389L);
        }
        float width = interfaceC132185xw.getWidth();
        float height = interfaceC132185xw.getHeight();
        if (width > 0.0f && height > 0.0f) {
            f = width / height;
        } else {
            f = 1.0f;
        }
        int i = 16;
        float f2 = 12.0f;
        if (z2) {
            f2 = 16.0f;
        }
        if (z) {
            i = 0;
        }
        return new C136856Ho(new C1333560c(12.0f, 0.0f, f2, i), f, A00);
    }

    public static final C136856Ho A01(UserSession userSession, Integer num, float f, boolean z) {
        int A00;
        C14360o3.A0B(userSession, 0);
        if (num != null) {
            A00 = num.intValue();
        } else {
            A00 = (int) C18U.A00(C06090Tz.A05, userSession, 37163553150599462L);
        }
        float f2 = 12.0f;
        if (z) {
            f2 = 16.0f;
        }
        return new C136856Ho(new C1333560c(12.0f, 0.0f, f2, 4.0f), f, A00);
    }
}
