package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fc3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35030Fc3 {
    public static final C35030Fc3 A00 = new Object();

    public final void A00(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A09 = AbstractC31179DnN.A09(userSession);
        if (A09.isSampled()) {
            AbstractC31181DnP.A0i(A09, "attempt_unlock", str, str2);
        }
    }

    public final void A01(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A09 = AbstractC31179DnN.A09(userSession);
        if (A09.isSampled()) {
            AbstractC31181DnP.A0i(A09, "failure_unlock", str, str2);
        }
    }

    public final void A02(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A09 = AbstractC31179DnN.A09(userSession);
        if (A09.isSampled()) {
            AbstractC31181DnP.A0i(A09, "success_unlock", str, str2);
        }
    }
}
