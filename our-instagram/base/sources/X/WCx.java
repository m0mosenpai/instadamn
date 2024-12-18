package X;

import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WCx {
    public static final WCx A00 = new Object();

    public static final int A00(PromoteData promoteData) {
        int i = promoteData.A0J;
        if (i == 0) {
            UserSession userSession = promoteData.A0y;
            C14360o3.A06(userSession);
            int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36610988426008822L);
            if (A01 != 1) {
                if (A01 != 2) {
                    return promoteData.A0J;
                }
                return promoteData.A0L;
            }
            return promoteData.A0K;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x005f, code lost:
    
        if (X.AbstractC31178DnM.A1X(X.C06090Tz.A05, r7.A0y, 36322104630716414L) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.business.promote.model.PromoteData r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WCx.A01(com.instagram.business.promote.model.PromoteData):void");
    }
}
