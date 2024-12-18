package X;

import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.Fgx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35263Fgx {
    public static final C35263Fgx A00 = new Object();

    public static final void A05(UserSession userSession, C35199Ffr c35199Ffr, String str, boolean z) {
        String str2;
        AbstractC25233BEq.A0v(0, userSession, str, c35199Ffr);
        String str3 = c35199Ffr.A09;
        C14360o3.A07(str3);
        if (z) {
            str2 = "block_cancel";
        } else {
            str2 = "unblock_cancel";
        }
        A04(userSession, c35199Ffr, str3, str2, str);
        C34660FOt c34660FOt = FE2.A00;
        C19270xB A002 = C35199Ffr.A00(c35199Ffr);
        int i = c35199Ffr.A00;
        String str4 = c35199Ffr.A0A;
        C14360o3.A07(str4);
        String str5 = c35199Ffr.A07;
        C14360o3.A07(str5);
        c34660FOt.A00(c35199Ffr.A01, c35199Ffr.A02, A002, userSession, null, "cancelled", str, str4, str5, c35199Ffr.A0B, i, z);
        if (C35199Ffr.A01(c35199Ffr)) {
            C19270xB A003 = C35199Ffr.A00(c35199Ffr);
            int i2 = c35199Ffr.A00;
            FVC.A00(EnumC33492ErR.valueOf(c35199Ffr.A05), EnumC33486ErL.valueOf(c35199Ffr.A06), A003, userSession, str, c35199Ffr.A0A, A00(c35199Ffr), 4, i2, z);
        }
    }

    public static final void A06(UserSession userSession, C35199Ffr c35199Ffr, String str, boolean z) {
        String str2;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1E(str, 2, c35199Ffr);
        String str3 = c35199Ffr.A09;
        C14360o3.A07(str3);
        if (z) {
            str2 = "block_tap";
        } else {
            str2 = "unblock_tap";
        }
        A04(userSession, c35199Ffr, str3, str2, str);
        C34660FOt c34660FOt = FE2.A00;
        C19270xB A002 = C35199Ffr.A00(c35199Ffr);
        int i = c35199Ffr.A00;
        String str4 = c35199Ffr.A0A;
        C14360o3.A07(str4);
        String str5 = c35199Ffr.A07;
        C14360o3.A07(str5);
        c34660FOt.A00(c35199Ffr.A01, c35199Ffr.A02, A002, userSession, null, "tapped", str, str4, str5, c35199Ffr.A0B, i, z);
        if (C35199Ffr.A01(c35199Ffr)) {
            C19270xB A003 = C35199Ffr.A00(c35199Ffr);
            int i2 = c35199Ffr.A00;
            FVC.A00(EnumC33492ErR.valueOf(c35199Ffr.A05), EnumC33486ErL.valueOf(c35199Ffr.A06), A003, userSession, str, c35199Ffr.A0A, A00(c35199Ffr), 2, i2, z);
        }
    }

    public static final ImmutableMap A00(C35199Ffr c35199Ffr) {
        String str;
        String str2;
        String str3 = c35199Ffr.A0B;
        Boolean bool = c35199Ffr.A04;
        Boolean bool2 = c35199Ffr.A03;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        if (str3 != null) {
            builder.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "pending";
            } else {
                str2 = "inbox";
            }
            builder.put("folder", str2);
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                str = "group_thread";
            } else {
                str = "one_on_one_thread";
            }
            builder.put("thread_type", str);
        }
        ImmutableMap buildOrThrow = builder.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        return buildOrThrow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r24 == 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r21, X.C35199Ffr r22, java.lang.String r23, int r24) {
        /*
            r0 = r22
            java.lang.String r2 = r0.A09
            X.C14360o3.A07(r2)
            r3 = r24
            if (r24 == 0) goto L70
            r1 = 2
            if (r3 == r1) goto L6d
            java.lang.String r1 = "unblock_confirm"
        L10:
            r6 = r21
            r9 = r23
            A04(r6, r0, r2, r1, r9)
            X.FOt r2 = X.FE2.A00
            if (r24 == 0) goto L1f
            r1 = 2
            r14 = 0
            if (r3 != r1) goto L20
        L1f:
            r14 = 1
        L20:
            X.0xB r5 = X.C35199Ffr.A00(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r13 = r0.A00
            java.lang.String r10 = r0.A0A
            X.C14360o3.A07(r10)
            java.lang.String r11 = r0.A07
            X.C14360o3.A07(r11)
            java.lang.String r12 = r0.A0B
            X.76z r3 = r0.A01
            X.Eqz r4 = r0.A02
            java.lang.String r8 = "confirmed"
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = X.C35199Ffr.A01(r0)
            if (r1 == 0) goto L6c
            X.0xB r17 = X.C35199Ffr.A00(r0)
            r22 = 3
            int r3 = r0.A00
            java.lang.String r2 = r0.A0A
            java.lang.String r1 = r0.A05
            X.ErR r15 = X.EnumC33492ErR.valueOf(r1)
            java.lang.String r1 = r0.A06
            X.ErL r16 = X.EnumC33486ErL.valueOf(r1)
            com.google.common.collect.ImmutableMap r21 = A00(r0)
            r18 = r6
            r19 = r9
            r20 = r2
            r23 = r3
            r24 = r14
            X.FVC.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L6c:
            return
        L6d:
            java.lang.String r1 = "multi_block_confirmed"
            goto L10
        L70:
            java.lang.String r1 = "block_confirm"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35263Fgx.A01(com.instagram.common.session.UserSession, X.Ffr, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r24 == 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.instagram.common.session.UserSession r21, X.C35199Ffr r22, java.lang.String r23, int r24) {
        /*
            r0 = r22
            java.lang.String r2 = r0.A09
            X.C14360o3.A07(r2)
            r3 = r24
            if (r24 == 0) goto L70
            r1 = 2
            if (r3 == r1) goto L6d
            java.lang.String r1 = "unblock_fail"
        L10:
            r6 = r21
            r9 = r23
            A04(r6, r0, r2, r1, r9)
            X.FOt r2 = X.FE2.A00
            if (r24 == 0) goto L1f
            r1 = 2
            r14 = 0
            if (r3 != r1) goto L20
        L1f:
            r14 = 1
        L20:
            X.0xB r5 = X.C35199Ffr.A00(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r13 = r0.A00
            java.lang.String r10 = r0.A0A
            X.C14360o3.A07(r10)
            java.lang.String r11 = r0.A07
            X.C14360o3.A07(r11)
            java.lang.String r12 = r0.A0B
            X.76z r3 = r0.A01
            X.Eqz r4 = r0.A02
            java.lang.String r8 = "failed"
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = X.C35199Ffr.A01(r0)
            if (r1 == 0) goto L6c
            X.0xB r17 = X.C35199Ffr.A00(r0)
            r22 = 6
            int r3 = r0.A00
            java.lang.String r2 = r0.A0A
            java.lang.String r1 = r0.A05
            X.ErR r15 = X.EnumC33492ErR.valueOf(r1)
            java.lang.String r1 = r0.A06
            X.ErL r16 = X.EnumC33486ErL.valueOf(r1)
            com.google.common.collect.ImmutableMap r21 = A00(r0)
            r18 = r6
            r19 = r9
            r20 = r2
            r23 = r3
            r24 = r14
            X.FVC.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L6c:
            return
        L6d:
            java.lang.String r1 = "multi_block_failed"
            goto L10
        L70:
            java.lang.String r1 = "block_fail"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35263Fgx.A02(com.instagram.common.session.UserSession, X.Ffr, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r24 == 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(com.instagram.common.session.UserSession r21, X.C35199Ffr r22, java.lang.String r23, int r24) {
        /*
            r0 = r22
            java.lang.String r2 = r0.A09
            X.C14360o3.A07(r2)
            r3 = r24
            if (r24 == 0) goto L70
            r1 = 2
            if (r3 == r1) goto L6d
            java.lang.String r1 = "unblock"
        L10:
            r6 = r21
            r9 = r23
            A04(r6, r0, r2, r1, r9)
            X.FOt r2 = X.FE2.A00
            if (r24 == 0) goto L1f
            r1 = 2
            r14 = 0
            if (r3 != r1) goto L20
        L1f:
            r14 = 1
        L20:
            X.0xB r5 = X.C35199Ffr.A00(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            int r13 = r0.A00
            java.lang.String r10 = r0.A0A
            X.C14360o3.A07(r10)
            java.lang.String r11 = r0.A07
            X.C14360o3.A07(r11)
            java.lang.String r12 = r0.A0B
            X.76z r3 = r0.A01
            X.Eqz r4 = r0.A02
            java.lang.String r8 = "succeeded"
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = X.C35199Ffr.A01(r0)
            if (r1 == 0) goto L6c
            X.0xB r17 = X.C35199Ffr.A00(r0)
            r22 = 5
            int r3 = r0.A00
            java.lang.String r2 = r0.A0A
            java.lang.String r1 = r0.A05
            X.ErR r15 = X.EnumC33492ErR.valueOf(r1)
            java.lang.String r1 = r0.A06
            X.ErL r16 = X.EnumC33486ErL.valueOf(r1)
            com.google.common.collect.ImmutableMap r21 = A00(r0)
            r18 = r6
            r19 = r9
            r20 = r2
            r23 = r3
            r24 = r14
            X.FVC.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L6c:
            return
        L6d:
            java.lang.String r1 = "multi_block_succeeded"
            goto L10
        L70:
            java.lang.String r1 = "block"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35263Fgx.A03(com.instagram.common.session.UserSession, X.Ffr, java.lang.String, int):void");
    }

    public static void A04(UserSession userSession, C35199Ffr c35199Ffr, String str, String str2, String str3) {
        FollowStatus valueOf = FollowStatus.valueOf(c35199Ffr.A08);
        C14360o3.A07(valueOf);
        EnumC1571773w A01 = C1571673v.A01(valueOf);
        String str4 = c35199Ffr.A07;
        String str5 = c35199Ffr.A0B;
        int i = c35199Ffr.A00;
        C1571673v.A03(c35199Ffr.A01, c35199Ffr.A02, userSession, A01, str, str2, str3, str4, str5, c35199Ffr.A0A, i);
    }
}
