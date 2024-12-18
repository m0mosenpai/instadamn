package com.instagram.wellbeing.limitsplus.data;

import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC43592JPx;
import X.AbstractC50523MSb;
import X.AbstractC50524MSc;
import X.C05A;
import X.C14360o3;
import X.C25621Ms;
import X.C4A7;
import X.C4A8;
import X.InterfaceC23621Ds;
import X.MSW;
import X.MVN;
import X.N2V;
import X.ONV;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class LimitsPlusRepository extends C4A7 {
    public String A00;
    public final C05A A01;
    public final UserSession A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitsPlusRepository(UserSession userSession) {
        super("LimitsPlus", C4A8.A00(533022723));
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC25225BEi.A1H(new MVN());
        this.A00 = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r17) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A02(X.1Ds):java.lang.Object");
    }

    private final Object A01(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Long l, InterfaceC23621Ds interfaceC23621Ds) {
        C25621Ms A0c = AbstractC167017dG.A0c(this.A02);
        A0c.A0B("users/set_limited_interactions_settings/");
        A0c.A0R(N2V.class, ONV.class);
        A0c.A0F("is_enabled", bool);
        A0c.A0F("non_followers", bool2);
        A0c.A0F("new_followers", bool3);
        A0c.A0F("non_close_friends", bool4);
        A0c.A0F("some_interactions", bool5);
        A0c.A0F("most_interactions", bool6);
        A0c.A9s("version", AbstractC50523MSb.A0C(this.A01).A06.toString());
        if (l != null) {
            A0c.A0D("reminder_date", (int) l.longValue());
        }
        return A0c.A0N().A00(503283951, interfaceC23621Ds);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if ((r0 instanceof X.C3NX) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r25, long r26) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A03(X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r20, long r21, long r23, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            r19 = this;
            r0 = r23
            r7 = r31
            r6 = r20
            boolean r2 = r6 instanceof X.PWT
            r5 = r19
            if (r2 == 0) goto La5
            r9 = r6
            X.PWT r9 = (X.PWT) r9
            int r4 = r9.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto La5
            int r4 = r4 - r3
            r9.A00 = r4
        L1a:
            java.lang.Object r2 = r9.A07
            X.1JX r8 = X.C1JX.A02
            int r3 = r9.A00
            r4 = 1
            if (r3 == 0) goto L66
            if (r3 != r4) goto Lac
            boolean r7 = r9.A06
            long r0 = r9.A01
            r25 = 0
            java.lang.Object r3 = r9.A05
            X.05A r3 = (X.C05A) r3
            java.lang.Object r12 = r9.A04
            X.Mus r12 = (X.C51788Mus) r12
            java.lang.Object r11 = r9.A03
            X.5kG r11 = (X.C124545kG) r11
            java.lang.Object r5 = r9.A02
            X.MVN r5 = (X.MVN) r5
            X.AbstractC09560e7.A00(r2)
        L3e:
            long r21 = X.AbstractC166987dD.A0N(r2)
        L42:
            if (r7 == 0) goto L63
            com.instagram.api.schemas.LimitedInteractionsVersions r13 = com.instagram.api.schemas.LimitedInteractionsVersions.A06
        L46:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r25)
            java.lang.Long r15 = X.MSW.A0z(r21)
            java.lang.Long r16 = X.MSW.A0z(r0)
            boolean r0 = r5.A08
            X.MVN r10 = new X.MVN
            r17 = r4
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r3.Egh(r10)
            X.0eB r0 = X.C0eB.A00
            return r0
        L63:
            com.instagram.api.schemas.LimitedInteractionsVersions r13 = com.instagram.api.schemas.LimitedInteractionsVersions.A07
            goto L46
        L66:
            X.AbstractC09560e7.A00(r2)
            X.05A r3 = r5.A01
            X.MVN r5 = X.AbstractC50523MSb.A0C(r3)
            X.5kG r11 = new X.5kG
            r10 = r26
            r6 = r27
            r2 = r28
            r11.<init>(r6, r2, r10)
            X.Mus r12 = new X.Mus
            r6 = r29
            r2 = r30
            r12.<init>(r2, r6)
            if (r25 != 0) goto L42
            java.lang.Long r6 = X.MSW.A0z(r21)
            java.lang.Long r2 = X.MSW.A0z(r0)
            r9.A02 = r5
            r9.A03 = r11
            r9.A04 = r12
            r9.A05 = r3
            r9.A01 = r0
            r9.A06 = r7
            r9.A00 = r4
            java.lang.Long r2 = A00(r6, r2)
            if (r2 != r8) goto La2
            return r8
        La2:
            r25 = 0
            goto L3e
        La5:
            X.PWT r9 = new X.PWT
            r9.<init>(r5, r6)
            goto L1a
        Lac:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A04(X.1Ds, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.InterfaceC23621Ds r19, X.InterfaceC16660sJ r20) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A05(X.1Ds, X.0sJ):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if ((r0 instanceof X.C3NX) == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.InterfaceC23621Ds r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A06(X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if ((r0 instanceof X.C3NX) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(X.InterfaceC23621Ds r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A07(X.1Ds, boolean, boolean, boolean):java.lang.Object");
    }

    public static final Long A00(Long l, Long l2) {
        long j;
        long A03 = AbstractC50524MSc.A03();
        if (l != null) {
            long longValue = l.longValue();
            if (!AbstractC43592JPx.A0r((int) longValue).equals(AbstractC43592JPx.A0r(0)) && l2 != null) {
                j = longValue - l2.longValue();
                return MSW.A0z(A03 + j);
            }
        }
        j = 604800;
        return MSW.A0z(A03 + j);
    }
}
