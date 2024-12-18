package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GiL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37684GiL {
    public static final C31E A00(UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, JHU jhu, AbstractC39459Hbl abstractC39459Hbl, C37604Ggz c37604Ggz, String str, String str2) {
        C31E A00;
        AbstractC167027dH.A12(userSession, str, str2);
        C14360o3.A0B(interfaceC60442pS, 3);
        AbstractC167017dG.A1T(abstractC39459Hbl, c37604Ggz);
        C37480Gey c37480Gey = new C37480Gey(userSession, 1);
        boolean A05 = C1P8.A05(userSession);
        C31B A002 = AbstractC37685GiM.A00(str2);
        String str3 = c37604Ggz.A01;
        if (A05) {
            A00 = I9J.A00(userSession, c37480Gey, A002, new C37687GiO(abstractC39459Hbl, userSession, anonymousClass318, interfaceC60442pS, new C42963IzF(c37604Ggz), c37480Gey, jhu, abstractC39459Hbl, str3), str, str, str);
        } else {
            A00 = C31J.A00(userSession, c37480Gey, A002, new C37687GiO(abstractC39459Hbl, userSession, anonymousClass318, interfaceC60442pS, new C37686GiN(c37604Ggz), c37480Gey, jhu, abstractC39459Hbl, str3), str);
            C14360o3.A0A(A00);
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36318479680149690L)) {
            C37694GiV c37694GiV = new C37694GiV();
            C14360o3.A0B(A00, 0);
            List list = c37694GiV.A00;
            list.add(A00);
            C37695GiW A01 = AbstractC37654Ghn.A01(userSession);
            if (A01 != null) {
                list.add(A01);
            }
            return c37694GiV;
        }
        return A00;
    }
}
