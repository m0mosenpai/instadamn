package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class BGM {
    public static final C25243BFc A01 = new C25243BFc(0.2f, 0.0f, 0.8f, 1.0f);
    public static final C25243BFc A02 = new C25243BFc(0.4f, 0.0f, 1.0f, 1.0f);
    public static final C25243BFc A03 = new C25243BFc(0.0f, 0.0f, 0.65f, 1.0f);
    public static final C25243BFc A04 = new C25243BFc(0.1f, 0.0f, 0.45f, 1.0f);
    public static final C25243BFc A00 = new C25243BFc(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r20, androidx.compose.ui.Modifier r21, float r22, float r23, float r24, int r25, int r26, long r27, long r29, boolean r31) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BGM.A00(X.5Tl, androidx.compose.ui.Modifier, float, float, float, int, int, long, long, boolean):void");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, float f, int i, int i2, long j) {
        int i3;
        float f2 = f;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1482707784);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0E(c5Tl, j);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A05(c5Tl, f2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                f2 = 4.0f;
            }
            if (C0fH.A02()) {
                C0fH.A01(452399366, "com.meta.compose.component.progressindicator.BasicCircularProgressIndicator (ProgressIndicator.kt:265)");
            }
            C62V c62v = new C62V(null, AbstractC25228BEl.A0h(c5Tl).EqT(f2), 4.0f, 2, 0);
            BH5 A022 = BH4.A02(c5Tl);
            InterfaceC118485Xk interfaceC118485Xk = AbstractC118445Xg.A05;
            InterfaceC30898DiB interfaceC30898DiB = AbstractC25328BIx.A02;
            C25245BFe A012 = C25245BFe.A01(interfaceC30898DiB, 6660, 0);
            Integer num = C05F.A00;
            JTG A002 = BH4.A00(new BH6(A012, num), A022, interfaceC118485Xk, c5Tl, 0, 5, 229816);
            JTG A013 = BH4.A01(new BH6(C25245BFe.A01(interfaceC30898DiB, 1332, 0), num), A022, c5Tl, 0.0f, 286.0f, 29112);
            JTG A014 = BH4.A01(new BH6(BHA.A00(BHC.A00), num), A022, c5Tl, 0.0f, 290.0f, 29112);
            JTG A015 = BH4.A01(new BH6(BHA.A00(BHH.A00), num), A022, c5Tl, 0.0f, 290.0f, 29112);
            Modifier A0C = AbstractC118185Wd.A0C(AnonymousClass598.A00(modifier2, BHL.A00, true), 40.0f);
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c62v, AbstractC25225BEi.A1X(c5Tl, A013, AbstractC25234BEr.A1b(c5Tl, A002, A014, A015, -1506048954)) | AbstractC25233BEq.A1J(i3), AbstractC25233BEq.A1I(i3));
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new BH9(A002, A014, A015, A013, c62v, f2, j);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC119665bP.A00(c5Tl, A0C, (InterfaceC16660sJ) EEc, 0);
            if (C0fH.A02()) {
                C0fH.A00(1699650025);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTS(modifier2, f2, i, i2, 3, j);
        }
    }

    public static final void A02(InterfaceC1128857w interfaceC1128857w, C62V c62v, float f, float f2, long j) {
        float f3 = c62v.A01 / 2.0f;
        float A022 = C5YC.A02(interfaceC1128857w.Bxc()) - (2.0f * f3);
        interfaceC1128857w.AQa(null, c62v, f, f2, 1.0f, 3, j, AbstractC119395aw.A00(f3, f3), C5YB.A00(A022, A022), false);
    }
}
