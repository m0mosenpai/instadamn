package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2Ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48102Ix {
    public final synchronized void A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C48092Iw c48092Iw = C48092Iw.A05;
        String str = null;
        if (c48092Iw != null) {
            str = c48092Iw.A00.userId;
        }
        if (!C14360o3.A0K(str, userSession.userId)) {
            C48092Iw c48092Iw2 = new C48092Iw(userSession);
            C48092Iw.A05 = c48092Iw2;
            C2J6 c2j6 = (C2J6) c48092Iw2.A01.getValue();
            C14360o3.A0B(c2j6, 0);
            try {
                C2J7.A01(c2j6);
            } catch (IllegalStateException unused) {
                C2J8 c2j8 = C2J8.A06;
                if (c2j8 == null) {
                    C14360o3.A0F("managerInstance");
                    throw C00O.createAndThrow();
                }
                c2j8.A00 = c2j6;
            }
        } else {
            C48092Iw c48092Iw3 = C48092Iw.A05;
            C14360o3.A0A(c48092Iw3);
            C2J7.A01((C2J6) c48092Iw3.A01.getValue());
        }
    }
}
