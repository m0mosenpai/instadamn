package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LDx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47903LDx {
    public final UserSession A00;

    public static final String A00(U08 u08, int i) {
        C152526tf c152526tf;
        C14360o3.A0B(u08, 1);
        if (i >= u08.A00().size() || (c152526tf = (C152526tf) u08.A00().get(i)) == null) {
            return null;
        }
        return c152526tf.A00;
    }

    public C47903LDx(UserSession userSession) {
        this.A00 = userSession;
    }
}
