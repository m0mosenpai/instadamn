package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class IB3 {
    public static final C31E A00(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, String str, String str2, int i) {
        C37480Gey c37480Gey = new C37480Gey(userSession, 2);
        boolean A05 = C1P8.A05(userSession);
        C31B A00 = AbstractC37685GiM.A00(str2);
        C37474Ges c37474Ges = new C37474Ges(userSession, anonymousClass318, interfaceC60442pS, c37480Gey, str, i);
        if (A05) {
            return I9J.A00(userSession, c37480Gey, A00, c37474Ges, str, str, str);
        }
        C31E A002 = C31J.A00(userSession, c37480Gey, A00, c37474Ges, str);
        C14360o3.A0A(A002);
        return A002;
    }
}
