package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2gm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55462gm {
    public static final C49G A00(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        return new C49G(new SharedPreferencesC19650xs(C1AT.A01(userSession).A03(C1AV.A2d)), userSession.userId, str);
    }
}
