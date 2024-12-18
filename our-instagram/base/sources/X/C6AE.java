package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;

/* renamed from: X.6AE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6AE {
    public static final C6AG A00(C42221xC c42221xC, UserSession userSession, C135816Cj c135816Cj, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c135816Cj, 2);
        C14360o3.A0B(str2, 4);
        return (C6AG) AbstractC41851wZ.A00(userSession).A01(C6AG.class, new C6AF(c42221xC, userSession, c135816Cj, str, str2));
    }

    public static final C6AG A02(UserSession userSession, EnumC132075xi enumC132075xi, boolean z) {
        C14360o3.A0B(userSession, 0);
        return (C6AG) AbstractC41851wZ.A00(userSession).A01(C6AG.class, new D8O(9, enumC132075xi, userSession, z));
    }

    public static final C6AG A01(C42221xC c42221xC, UserSession userSession, C135816Cj c135816Cj, String str, String str2) {
        long j;
        User A01 = C17060sy.A01.A01(userSession);
        C6AI A00 = C6AH.A00(userSession);
        A00.A01 = 0;
        A00.A00 = 0;
        A00.A0D.accept(0);
        C2FQ A002 = C2FO.A00(userSession);
        IGFOAMessagingReadyLogger A003 = C47272Eu.A00(userSession);
        C41761wQ c41761wQ = new C41761wQ(null);
        C133215zn A004 = C6AJ.A00(userSession);
        String str3 = userSession.userId;
        Long BTC = A01.BTC();
        if (BTC != null) {
            j = BTC.longValue();
        } else {
            j = -1;
        }
        return new C6AG(new C133225zo(c42221xC, c41761wQ, userSession, c135816Cj, A004, A00, A002, A003, str, str3, A01.B8y(), str2, j), A00);
    }
}
