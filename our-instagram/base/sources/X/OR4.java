package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class OR4 {
    public static final long A00 = AbstractC43593JPy.A09(TimeUnit.DAYS);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        if (r5 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1ON A00(X.C43658JSq r6, com.instagram.common.session.UserSession r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313222638798670(0x8102af0009074e, double:3.027966446162727E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L26
            X.11X r0 = X.C11X.A00()
            X.1Tj r0 = r0.A01()
            android.content.res.Resources r0 = r0.A00
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L26
            java.lang.String r4 = "DARK"
            goto L28
        L26:
            java.lang.String r4 = "LIGHT"
        L28:
            java.util.Locale r0 = X.C1Q2.A02()     // Catch: java.lang.NullPointerException -> L2d
            goto L46
        L2d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "LanguageUtil has not been initialized yet | URL: GraphQLQuery (showreel_native_interactive_animation), Exception: "
            java.lang.String r1 = X.AbstractC167017dG.A0n(r2, r0, r1)
            java.lang.String r0 = "Locale"
            X.C0w9.A03(r0, r1)
        L3d:
            java.util.Locale r0 = X.C1Q2.A03()
            java.lang.String r5 = X.AbstractC166987dD.A19(r0)
            goto L4c
        L46:
            java.lang.String r5 = r0.toString()
            if (r5 == 0) goto L3d
        L4c:
            java.io.StringWriter r3 = X.AbstractC37300Gc1.A0O()
            X.17z r2 = X.AbstractC167007dF.A0S(r3)
            java.lang.String r0 = "2"
            r2.A0S(r0, r8)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "0"
            r2.A0S(r0, r1)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "1"
            r2.A0S(r0, r1)
            if (r9 == 0) goto L6e
            java.lang.String r0 = "3"
            r2.A0S(r0, r9)
        L6e:
            java.lang.String r0 = "4"
            r2.A0r(r0)
            r2.A0d()
            java.lang.String r0 = "locale"
            r2.A0S(r0, r5)
            java.lang.String r0 = "color_theme"
            r2.A0S(r0, r4)
            r2.A0a()
            java.lang.String r4 = X.AbstractC167017dG.A0l(r2, r3)
            java.lang.Class<X.U3g> r3 = X.C66191U3g.class
            java.lang.String r2 = "ShowreelNativeInteractiveAnimationQuery"
            r1 = 1
            X.NM7 r0 = new X.NM7
            r0.<init>(r3, r2, r4, r1)
            X.42o r2 = new X.42o
            r2.<init>(r7)
            r2.A09(r0)
            java.lang.String r0 = "showreel_native_policy"
            r2.A08 = r0
            java.lang.String r1 = "sn_res_v2"
            int r0 = r6.hashCode()
            java.lang.String r0 = X.AnonymousClass001.A0O(r1, r0)
            r2.A05 = r0
            if (r11 == 0) goto Lbe
            java.lang.Integer r0 = X.C05F.A0C
        Lad:
            r2.A03 = r0
            long r0 = X.OR4.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = X.C05F.A00
            X.1ON r0 = r2.A07(r0)
            return r0
        Lbe:
            if (r10 == 0) goto Lc3
            java.lang.Integer r0 = X.C05F.A01
            goto Lad
        Lc3:
            java.lang.Integer r0 = X.C05F.A0Y
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OR4.A00(X.JSq, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, boolean, boolean):X.1ON");
    }
}
