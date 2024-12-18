package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.CcD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28214CcD {
    public final Activity A00;
    public final UserSession A01;
    public final C3o9 A02;
    public final List A03;
    public final boolean A04;
    public final InterfaceC31002Dk1 A05;

    public C28214CcD(Activity activity, UserSession userSession, C3o9 c3o9, List list, boolean z) {
        AbstractC167007dF.A1F(activity, 2, list);
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = c3o9;
        this.A03 = list;
        this.A04 = z;
        this.A05 = new C29512CzQ(this, 5);
    }

    public static /* synthetic */ void A00(C28214CcD c28214CcD, EnumC53326Ni5 enumC53326Ni5, CWH cwh, C28270CdF c28270CdF, Integer num, String str, int i) {
        boolean z;
        C28270CdF c28270CdF2 = c28270CdF;
        CWH cwh2 = cwh;
        Integer num2 = num;
        if ((i & 4) != 0) {
            num2 = C05F.A00;
        }
        if ((i & 8) != 0) {
            z = C18U.A06(C06090Tz.A05, c28214CcD.A01, 36327073908078878L);
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            cwh2 = null;
        }
        if ((i & 128) != 0) {
            c28270CdF2 = null;
        }
        c28214CcD.A01(enumC53326Ni5, cwh2, c28270CdF2, num2, str, z, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r28 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.EnumC53326Ni5 r37, X.CWH r38, X.C28270CdF r39, java.lang.Integer r40, java.lang.String r41, boolean r42, boolean r43, boolean r44) {
        /*
            r36 = this;
            r14 = r40
            r4 = r39
            boolean r26 = X.AbstractC167007dF.A1U(r14)
            r7 = r36
            com.instagram.common.session.UserSession r2 = r7.A01
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36327073908603173(0x810f48000d3925, double:3.036726044961681E-306)
            boolean r28 = X.C18U.A06(r5, r2, r0)
            r10 = r37
            int r3 = r10.ordinal()
            switch(r3) {
                case 3: goto Ldc;
                case 4: goto L20;
                case 5: goto Ldc;
                case 6: goto Ldc;
                case 7: goto Ldc;
                case 8: goto L20;
                case 9: goto Ldc;
                case 10: goto Ldc;
                case 11: goto L20;
                case 12: goto Ldc;
                case 13: goto L20;
                case 14: goto Ldc;
                default: goto L20;
            }
        L20:
            X.C7N r9 = X.C7N.A03
        L22:
            if (r28 == 0) goto Ld5
            X.C7N r0 = X.C7N.A04
            if (r9 != r0) goto Ld5
            r0 = 36608548885436154(0x820f48000f16fa, double:3.214731953719616E-306)
        L2d:
            int r19 = X.AbstractC25225BEi.A07(r5, r2, r0)
            android.app.Activity r0 = r7.A00
            X.CUd r6 = new X.CUd
            r6.<init>(r0, r2)
            if (r39 != 0) goto L4b
            r21 = 0
            r25 = 1
            X.CdF r4 = new X.CdF
            r20 = r4
            r22 = r21
            r23 = r26
            r24 = r26
            r20.<init>(r21, r22, r23, r24, r25)
        L4b:
            r15 = 0
            r25 = r28 ^ 1
            java.lang.String r8 = r4.A01
            boolean r1 = r4.A03
            boolean r0 = r4.A02
            java.lang.String r4 = r4.A00
            X.CdF r12 = new X.CdF
            r20 = r12
            r21 = r8
            r22 = r4
            r23 = r1
            r24 = r0
            r20.<init>(r21, r22, r23, r24, r25)
            r0 = 36327073907751193(0x810f4800003919, double:3.0367260444228856E-306)
            boolean r22 = X.C18U.A06(r5, r2, r0)
            r0 = 36327073907947804(0x810f480003391c, double:3.036726044547223E-306)
            boolean r24 = X.C18U.A06(r5, r2, r0)
            r0 = 36327073908013341(0x810f480004391d, double:3.036726044588669E-306)
            boolean r23 = X.C18U.A06(r5, r2, r0)
            r0 = 36327073908275489(0x810f4800083921, double:3.0367260447544525E-306)
            boolean r30 = X.C18U.A06(r5, r2, r0)
            r0 = 3
            if (r3 == r0) goto Ld2
            r0 = 5
            if (r3 == r0) goto Ld2
            r0 = 6
            if (r3 == r0) goto Ld2
            r0 = 14
            if (r3 == r0) goto Ld2
            r0 = 7
            if (r3 == r0) goto Ld2
            java.lang.Integer r13 = X.C05F.A01
        L9b:
            if (r43 != 0) goto La1
            r27 = 0
            if (r28 == 0) goto La3
        La1:
            r27 = 1
        La3:
            r0 = 36327073908668710(0x810f48000e3926, double:3.036726045003127E-306)
            boolean r35 = X.C18U.A06(r5, r2, r0)
            r20 = -162610046(0xfffffffff64ec482, float:-1.0484363E33)
            r21 = 6
            X.CWR r8 = new X.CWR
            r11 = r38
            r18 = r41
            r25 = r42
            r34 = r44
            r16 = r15
            r17 = r15
            r29 = r26
            r31 = r26
            r32 = r26
            r33 = r26
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.Dk1 r1 = r7.A05
            X.DN6 r0 = X.DN6.A00
            r6.A00(r8, r1, r0)
            return
        Ld2:
            java.lang.Integer r13 = X.C05F.A0C
            goto L9b
        Ld5:
            r0 = 36608548885239545(0x820f48000c16f9, double:3.21473195359528E-306)
            goto L2d
        Ldc:
            X.C7N r9 = X.C7N.A04
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28214CcD.A01(X.Ni5, X.CWH, X.CdF, java.lang.Integer, java.lang.String, boolean, boolean, boolean):void");
    }
}
