package com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util;

import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25228BEl;
import X.C14360o3;
import X.C1ON;
import X.C214379eb;
import X.C23042ADy;
import X.C25621Ms;
import X.C40781ul;
import X.C55702hA;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class MutedWordsApiUtil {
    public static final C1ON A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A06();
        A0q.A0B("accounts/get_post_filter_keywords/");
        return AbstractC25227BEk.A0e(A0q, C214379eb.class, C23042ADy.class);
    }

    public static final C1ON A01(UserSession userSession, List list) {
        C14360o3.A0B(userSession, 0);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/set_post_filter_keywords/");
        A0c.A9s("keywords", AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, null));
        A0c.A0P(null, C40781ul.class, C55702hA.class, false);
        return A0c.A0N();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 16
            boolean r0 = X.D3k.A02(r7, r3)
            if (r0 == 0) goto L5f
            r5 = r7
            X.D3k r5 = (X.D3k) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L6a
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L37
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L65
            X.A0r r0 = new X.A0r
            r0.<init>()
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
        L37:
            return r4
        L38:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC25228BEl.A0q(r6)
            r2.A06()
            r0 = 1882(0x75a, float:2.637E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A0B(r0)
            java.lang.Class<X.9eb> r1 = X.C214379eb.class
            java.lang.Class<X.ADy> r0 = X.C23042ADy.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 458382369(0x1b525c21, float:1.7400561E-22)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L5f:
            X.D3k r5 = new X.D3k
            r5.<init>(r3, r7)
            goto L16
        L65:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil.A02(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }
}
