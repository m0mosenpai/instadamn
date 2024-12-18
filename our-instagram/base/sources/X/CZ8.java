package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CZ8 {
    public static final void A01(C5Tl c5Tl, Modifier modifier, C27955CTv c27955CTv, String str, InterfaceC16620sF interfaceC16620sF, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        String str2 = str;
        Modifier modifier2 = modifier;
        int A08 = AbstractC25230BEn.A08(0, c27955CTv, interfaceC16620sF);
        c5Tl.Enr(-1219393280);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, c27955CTv) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= AbstractC25232BEp.A0A(c5Tl, i5);
        }
        if ((i3 & 16) != 0) {
            i4 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i4 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((i4 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                str2 = null;
            }
            if (i8 != 0) {
                i5 = 0;
            }
            if (C0fH.A02()) {
                C0fH.A01(728340745, "com.instagram.wonderwall.ui.compose.components.video.WallMediaPlayerContainer (WallMediaPlayerContainer.kt:33)");
            }
            c5Tl.Eno(1308576028);
            int i9 = i4 & 14;
            boolean A1P = AbstractC167007dF.A1P(i9, A08);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = C30179DRk.A00(c5Tl, c27955CTv, 13);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5UX.A03(c5Tl, c27955CTv, (InterfaceC16660sJ) EEc);
            boolean A1U = AbstractC25232BEp.A1U(c5Tl, 1308579243, i9, A08) | AbstractC167007dF.A1P(i4 & 896, 256) | AbstractC25233BEq.A1K(i4);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = new C25309BIe(c27955CTv, str2, i5, 5);
                c5Tl.FBy(EEc2);
            }
            Modifier A0B = AbstractC25233BEq.A0B(A0K, modifier2, EEc2);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(true);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A0B);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i4 >> 12);
            if (C0fH.A02()) {
                C0fH.A00(-1373918721);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVC(c27955CTv, modifier2, interfaceC16620sF, str2, i5, i2, i3, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if ((r6 & 6) == 4) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C27955CTv A00(X.C5Tl r4, java.lang.Object r5, int r6) {
        /*
            r0 = -934245618(0xffffffffc8508b0e, float:-213548.22)
            boolean r0 = X.AbstractC25227BEk.A1U(r4, r0)
            if (r0 == 0) goto L11
            r1 = -1262896334(0xffffffffb4b9bb32, float:-3.4595138E-7)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.video.rememberMediaPlayerContainerState (WallMediaPlayerContainer.kt:48)"
            X.C0fH.A01(r1, r0)
        L11:
            X.5UP r0 = X.AbstractC28136Caj.A00
            java.lang.Object r3 = r4.AJX(r0)
            X.CT6 r3 = (X.CT6) r3
            r0 = -1871395721(0xffffffff9074c477, float:-4.8271866E-29)
            r4.Eno(r0)
            r0 = r6 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L2c
            boolean r0 = r4.AH4(r5)
            if (r0 != 0) goto L31
        L2c:
            r1 = r6 & 6
            r0 = 0
            if (r1 != r2) goto L32
        L31:
            r0 = 1
        L32:
            boolean r0 = X.AbstractC25225BEi.A1X(r4, r3, r0)
            java.lang.Object r1 = r4.EEc()
            if (r0 != 0) goto L40
            java.lang.Object r0 = X.C5UI.A00
            if (r1 != r0) goto L48
        L40:
            X.CTv r1 = new X.CTv
            r1.<init>(r3)
            r4.FBy(r1)
        L48:
            X.CTv r1 = (X.C27955CTv) r1
            X.5Tk r4 = (X.C117505Tk) r4
            boolean r0 = X.AbstractC25227BEk.A1a(r4)
            if (r0 == 0) goto L58
            r0 = 1774149604(0x69bf5fe4, float:2.8919708E25)
            X.C0fH.A00(r0)
        L58:
            X.C117505Tk.A0I(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZ8.A00(X.5Tl, java.lang.Object, int):X.CTv");
    }
}
