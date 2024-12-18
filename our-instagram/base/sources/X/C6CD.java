package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6CD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CD {
    public final String A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C45319K3w A00 = A00(userSession);
        if (A00 != null && A00.mResultSet.getCount() > 0) {
            return String.valueOf(A00.mResultSet.getNullableLong(0, 0));
        }
        if (C18U.A06(C06090Tz.A05, userSession, 2342161871149931194L)) {
            return "0";
        }
        return null;
    }

    public static final C6CC A01(UserSession userSession) {
        synchronized (XkG.class) {
            if (!XkG.A00) {
                C09170dP.A0C("instagramencryptedbackup_jni");
                XkG.A00 = true;
            }
        }
        return (C6CC) userSession.A01(C6CC.class, new C9EW(userSession, 11));
    }

    public static final C45319K3w A00(UserSession userSession) {
        C45319K3w c45319K3w;
        if (!C6CE.A00(userSession).A00()) {
            return null;
        }
        C6CC A01 = A01(userSession);
        synchronized (A01) {
            C6CD c6cd = C6CC.A03;
            c45319K3w = A01.A00;
        }
        return c45319K3w;
    }

    public final void A03(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        if (C6CE.A00(userSession).A00()) {
            C6CC A01 = A01(userSession);
            C6CD c6cd = C6CC.A03;
            C6CC.A04(new C207189Ex(10, A01, interfaceC16820sZ), A01.A02);
        }
    }
}
