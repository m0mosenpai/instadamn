package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class MVW {
    public final C92694De A00 = AbstractC166177bl.A00(C92674Dc.A00);

    public static final boolean A00(UserSession userSession, C62832tM c62832tM, C37546Gg2 c37546Gg2, AbstractC39459Hbl abstractC39459Hbl, C37556GgC c37556GgC, String str) {
        boolean A1b = AbstractC25233BEq.A1b(c37546Gg2, abstractC39459Hbl, c37556GgC);
        C14360o3.A0B(userSession, 5);
        HashMap A00 = MVa.A00(userSession).A00();
        if (!(!A00.isEmpty())) {
            return false;
        }
        Iterator A0k = AbstractC167007dF.A0k(A00);
        while (A0k.hasNext()) {
            Object next = A0k.next();
            C14360o3.A07(next);
            C38663Gz4 c38663Gz4 = (C38663Gz4) next;
            Integer A002 = C50594MVf.A00(c38663Gz4, userSession, abstractC39459Hbl, c37556GgC);
            if (A002 != null) {
                C50594MVf.A03(c38663Gz4, c62832tM, c37546Gg2, abstractC39459Hbl, str, A002.intValue());
            }
        }
        return A1b;
    }
}
