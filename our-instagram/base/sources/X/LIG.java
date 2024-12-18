package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class LIG {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r3.A0M() != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
    
        if (r1.A0M() != true) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(com.instagram.common.session.UserSession r25, X.C1OW r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LIG.A02(com.instagram.common.session.UserSession, X.1OW, java.lang.String):void");
    }

    public static final void A00(UserSession userSession, int i, boolean z, boolean z2) {
        long j;
        C46105Kb5 A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z) {
            j = 36602084959261240L;
        } else {
            j = 36602084959588925L;
        }
        long A012 = C18U.A01(c06090Tz, userSession, j);
        C14360o3.A0A(Long.valueOf(A012));
        if (A012 > 0 && AbstractC50712Us.A01.A08(A012) == 0) {
            AbstractC47197KtW.A00 = userSession;
            if (C163307Sp.A00(userSession, i) == null && (A01 = C163307Sp.A01(userSession, C05F.A00, i, z, z2)) != null) {
                A01.onStartFlow();
            }
        }
    }

    public static final boolean A01(UserSession userSession, C1OW c1ow) {
        DirectThreadKey A01 = c1ow.A01();
        if (A01 != null) {
            return AbstractC159387Cy.A00(userSession, c1ow, A01).A01();
        }
        return false;
    }
}
