package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FVD {
    public static final void A00(Context context, UserSession userSession) {
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A06();
        AbstractC25226BEj.A1N(context, A0K, 2131963521);
        AbstractC31171DnF.A11(context, A0K, 2131963520);
        AbstractC25233BEq.A1F(A0K);
        FVE.A01(userSession, C05F.A0N, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8, 36311912675083066L) == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(androidx.fragment.app.Fragment r7, com.instagram.common.session.UserSession r8, java.lang.Integer r9) {
        /*
            boolean r6 = X.AbstractC167017dG.A1a(r7, r8)
            X.02i r1 = X.C006802i.A0p
            r0 = 190461770(0xb5a374a, float:4.2026868E-32)
            r1.markerStart(r0)
            java.lang.Integer r0 = X.C05F.A0N
            if (r9 != r0) goto L1e
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36311912675083066(0x81017e001d033a, double:3.027138019834178E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            r4 = 1
            if (r0 != 0) goto L1f
        L1e:
            r4 = 0
        L1f:
            android.content.Context r3 = r7.requireContext()
            X.5wJ r1 = new X.5wJ
            r1.<init>(r8)
            boolean r0 = r1.A04()
            if (r0 == 0) goto L37
            X.G72 r0 = new X.G72
            r0.<init>(r3, r8)
            r1.A00(r0, r4)
            return
        L37:
            r5 = 0
            X.1Ms r2 = X.AbstractC167017dG.A0c(r8)
            java.lang.String r0 = "accounts/set_hide_message_requests_global/"
            r2.A0B(r0)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0P(r5, r1, r0, r6)
            java.lang.String r0 = "config_value"
            r2.A0D(r0, r6)
            java.lang.String r0 = "spam_scam_consent"
            r2.A0D(r0, r4)
            int r0 = r9.intValue()
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L74;
                case 2: goto L77;
                default: goto L59;
            }
        L59:
            java.lang.String r1 = "direct-hidden-words-spam-scam-nux"
        L5b:
            java.lang.String r0 = "entry_point"
            r2.A9s(r0, r1)
            X.1ON r2 = X.AbstractC31172DnG.A0U(r2, r6)
            r1 = 4
            X.EUv r0 = new X.EUv
            r0.<init>(r1, r3, r8, r4)
            r2.A00 = r0
            X.0ch r0 = X.AbstractC018607g.A00(r7)
            X.C1GJ.A00(r3, r0, r2)
            return
        L74:
            java.lang.String r1 = "direct-hidden-words-adoption-nux-from-pending-folder"
            goto L5b
        L77:
            java.lang.String r1 = "direct-hidden-words-adoption-bottomsheet"
            goto L5b
        L7a:
            java.lang.String r1 = "direct-hidden-words-adoption-qp"
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FVD.A01(androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, java.lang.Integer):void");
    }
}
