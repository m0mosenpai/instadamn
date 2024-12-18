package com.instagram.avatars.suggestions;

import X.AbstractC002300n;
import X.AbstractC124995l5;
import X.AbstractC25225BEi;
import X.AnonymousClass001;
import X.C008302x;
import X.C06090Tz;
import X.C129695tZ;
import X.C14360o3;
import X.C18U;
import X.C92E;
import X.EnumC129705ta;
import X.InterfaceC19390xP;
import X.InterfaceC50510MRn;
import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.facebook.mantle.ig.IGMantle;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LexiconRecommendationProvider implements InterfaceC50510MRn {
    public IGMantle A00;
    public boolean A01;
    public final int A02;
    public final MantleDataValue A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final InterfaceC19390xP A08;
    public final boolean A09;

    public LexiconRecommendationProvider(UserSession userSession, Integer num, String str) {
        String str2;
        String str3;
        int A07;
        C06090Tz A0j = AbstractC25225BEi.A0j(str, 3);
        String A04 = C18U.A04(A0j, userSession, 36884878490600023L);
        if (C18U.A06(A0j, userSession, 36321928537515928L)) {
            str2 = C18U.A04(A0j, userSession, 36884878490665560L);
        } else {
            str2 = "{\"nodes\":{\"0\":{\"nodeType\":109,\"parents\":[],\"staticParams\":{}},\"1\":{\"nodeType\":111,\"parents\":[0,2,3],\"staticParams\":{\"35\":{\"int_val\":3}}},\"2\":{\"nodeType\":102,\"parents\":[0],\"staticParams\":{\"1\":{\"str_val\":\"blocklist\"},\"2\":{\"str_val\":\"##model_name##\"},\"3\":{\"int_val\":##lexicon_version##},\"26\":{\"int_val\":1},\"34\":{\"int_val\":1}}},\"3\":{\"nodeType\":102,\"parents\":[0],\"staticParams\":{\"1\":{\"str_val\":\"lexicon\"},\"2\":{\"str_val\":\"##model_name##\"},\"3\":{\"int_val\":##lexicon_version##},\"26\":{\"int_val\":1},\"34\":{\"int_val\":6}}}}}";
        }
        C14360o3.A0A(str2);
        if (C18U.A06(A0j, userSession, 36321928537515928L)) {
            str3 = C18U.A04(A0j, userSession, 36884878490731097L);
        } else {
            str3 = "{\"nodes\":{\"0\":{\"nodeType\":109,\"parents\":[],\"staticParams\":{}},\"1\":{\"nodeType\":111,\"parents\":[0],\"staticParams\":{\"35\":{\"int_val\":3}}}}}";
        }
        C14360o3.A0A(str3);
        C008302x A00 = AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G());
        boolean z = !C18U.A06(A0j, userSession, 36321928537450391L);
        if (num != null) {
            A07 = num.intValue();
        } else {
            A07 = AbstractC25225BEi.A07(A0j, userSession, 36603403514352559L);
        }
        this.A04 = A04;
        this.A08 = A00;
        this.A09 = z;
        this.A02 = A07;
        this.A06 = str;
        C129695tZ c129695tZ = MantleDataValue.Companion;
        this.A03 = new MantleDataValue(EnumC129705ta.A0B, AnonymousClass001.A0O("suggestions_cache_key_", A07));
        String A0d = AbstractC002300n.A0d(AbstractC002300n.A0d(str2, "##model_name##", this.A06, false), "##lexicon_version##", String.valueOf(this.A02), false);
        this.A05 = A0d;
        this.A07 = z ? AbstractC002300n.A0d(AbstractC002300n.A0d(str3, "##model_name##", this.A06, false), "##lexicon_version##", String.valueOf(this.A02), false) : A0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.mantle.ig.IGMantle r8, com.instagram.avatars.suggestions.LexiconRecommendationProvider r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.LexiconRecommendationProvider.A00(com.facebook.mantle.ig.IGMantle, com.instagram.avatars.suggestions.LexiconRecommendationProvider, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.InterfaceC50510MRn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object COA(java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r10 = this;
            r3 = 29
            boolean r0 = X.MAO.A02(r12, r3)
            if (r0 == 0) goto L74
            r8 = r12
            X.MAO r8 = (X.MAO) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r8.A00 = r2
        L16:
            java.lang.Object r5 = r8.A03
            X.1JX r7 = X.C1JX.A02
            int r0 = r8.A00
            r9 = 2
            r6 = 1
            if (r0 == 0) goto L36
            if (r0 == r6) goto L46
            if (r0 != r9) goto L7a
            java.lang.Object r0 = r8.A02
            com.facebook.mantle.ig.IGMantle r0 = (com.facebook.mantle.ig.IGMantle) r0
            java.lang.Object r4 = r8.A01
            com.instagram.avatars.suggestions.LexiconRecommendationProvider r4 = (com.instagram.avatars.suggestions.LexiconRecommendationProvider) r4
            X.AbstractC09560e7.A00(r5)
        L2f:
            r4.A00 = r0
            r4.A01 = r6
            X.0sl r7 = X.C16930sl.A00
        L35:
            return r7
        L36:
            X.AbstractC09560e7.A00(r5)
            X.0xP r0 = r10.A08
            X.MAO.A00(r10, r11, r8, r6)
            java.lang.Object r5 = X.AbstractC209010m.A04(r8, r0)
            if (r5 == r7) goto L35
            r4 = r10
            goto L51
        L46:
            java.lang.Object r11 = r8.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r4 = r8.A01
            com.instagram.avatars.suggestions.LexiconRecommendationProvider r4 = (com.instagram.avatars.suggestions.LexiconRecommendationProvider) r4
            X.AbstractC09560e7.A00(r5)
        L51:
            com.facebook.mantle.ig.IGMantle r5 = (com.facebook.mantle.ig.IGMantle) r5
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "_init"
            java.lang.String r3 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r2 = r4.A05
            boolean r1 = r4.A09
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r0 = r4.A03
            com.google.common.collect.ImmutableMap r0 = X.LHM.A00(r0, r11, r1, r6)
            com.google.common.util.concurrent.ListenableFuture r0 = r5.runMantleWithConfigStr(r3, r2, r0)
            X.MAO.A00(r4, r5, r8, r9)
            java.lang.Object r0 = X.AbstractC47129KsO.A00(r0, r8)
            if (r0 == r7) goto L35
            r0 = r5
            goto L2f
        L74:
            X.MAO r8 = new X.MAO
            r8.<init>(r10, r12, r3)
            goto L16
        L7a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.LexiconRecommendationProvider.COA(java.lang.String, X.1Ds):java.lang.Object");
    }
}
