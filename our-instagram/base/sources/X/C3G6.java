package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3G6, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3G6 {
    public static final C3G7 A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C3G7) userSession.A01(C3G7.class, new C9E7(userSession, 17));
    }

    public static final boolean A01(String str, String str2, String str3) {
        try {
            C222816h.A06.E3L(str);
            return true;
        } catch (Exception e) {
            C0K8.A0F("ReelMediaPreloader", "invalid uri", e);
            C0w9.A06("ReelMediaPreloader#invalidUri", AnonymousClass001.A13("uri: ", str, " mediaId: ", str2, " reelId: ", str3), e);
            return false;
        }
    }
}
