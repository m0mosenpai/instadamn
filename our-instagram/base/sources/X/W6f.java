package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class W6f {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (X.C18U.A06(r2, r14, 36317998641977102L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(androidx.fragment.app.FragmentActivity r12, X.XCJ r13, com.instagram.common.session.UserSession r14, java.lang.String r15) {
        /*
            r11 = r14
            r9 = r12
            X.AbstractC167017dG.A1N(r12, r14)
            r0 = 3
            X.C14360o3.A0B(r13, r0)
            boolean r0 = r12 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L58
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317998641846029(0x8107070000170d, double:3.030986809721297E-306)
            boolean r0 = X.C18U.A06(r2, r14, r0)
            if (r0 != 0) goto L26
            r0 = 36317998641977102(0x8107070002170e, double:3.0309868098041883E-306)
            boolean r1 = X.C18U.A06(r2, r14, r0)
            r0 = 0
            if (r1 == 0) goto L27
        L26:
            r0 = 1
        L27:
            java.lang.Integer r1 = X.C05F.A00
            if (r0 == 0) goto L59
            r3 = 1
            r5 = 0
            X.MSe r2 = new X.MSe
            r4 = r3
            r6 = r5
            r7 = r3
            r2.<init>(r3, r4, r5, r6, r7)
        L35:
            X.MWo r0 = new X.MWo
            r0.<init>(r2, r1)
            java.util.List r1 = X.AbstractC166987dD.A1J(r0)
            r0 = 24
            X.Mtf r8 = new X.Mtf
            r8.<init>(r1, r0)
            com.instagram.base.activity.BaseFragmentActivity r9 = (com.instagram.base.activity.BaseFragmentActivity) r9
            X.WeF r10 = new X.WeF
            r10.<init>(r13)
            X.W97 r7 = new X.W97
            r12 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 0
            r7.A00 = r0
            X.W97.A00(r7)
        L58:
            return
        L59:
            r4 = 1
            r8 = 0
            r3 = 8
            X.MSe r2 = new X.MSe
            r5 = r4
            r6 = r4
            r7 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W6f.A01(androidx.fragment.app.FragmentActivity, X.XCJ, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public static final void A02(FragmentActivity fragmentActivity, XA6 xa6, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (!z) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36317998641846029L) && !C18U.A06(c06090Tz, userSession, 36317998641977102L)) {
                xa6.onComplete();
                return;
            }
        }
        C08790ch A00 = AbstractC018607g.A00(fragmentActivity);
        C70660Weg c70660Weg = new C70660Weg(xa6, 0);
        C14360o3.A0B(A00, 1);
        C70187WFq.A03(fragmentActivity, A00, new C70662Wei(fragmentActivity, A00, c70660Weg, userSession, true), userSession);
    }

    public static final void A00(FragmentActivity fragmentActivity, XCJ xcj, UserSession userSession) {
        C70187WFq.A01(fragmentActivity, AbstractC018607g.A00(fragmentActivity), new C70660Weg(xcj, AbstractC167017dG.A1a(fragmentActivity, userSession) ? 1 : 0), userSession);
    }
}
