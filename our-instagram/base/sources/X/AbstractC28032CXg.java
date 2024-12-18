package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CXg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28032CXg {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if ((r7 & 6) == 4) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C136936Hw A00(X.C5Tl r5, java.lang.Object r6, int r7) {
        /*
            r3 = 0
            X.C14360o3.A0B(r6, r3)
            r0 = 1375298372(0x51f96344, float:1.3388903E11)
            boolean r0 = X.AbstractC25227BEk.A1U(r5, r0)
            if (r0 == 0) goto L15
            r1 = 62360720(0x3b78c90, float:1.0788045E-36)
            java.lang.String r0 = "com.instagram.barcelona.feed.video.rememberMediaPlayerContainerState (MediaPlayerContainer.kt:59)"
            X.C0fH.A01(r1, r0)
        L15:
            X.5UP r0 = X.C6G1.A00
            java.lang.Object r4 = r5.AJX(r0)
            X.6G3 r4 = (X.C6G3) r4
            r0 = 1986144203(0x766227cb, float:1.1467443E33)
            r5.Eno(r0)
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L30
            boolean r0 = r5.AH4(r6)
            if (r0 != 0) goto L35
        L30:
            r1 = r7 & 6
            r0 = 0
            if (r1 != r2) goto L36
        L35:
            r0 = 1
        L36:
            boolean r0 = X.AbstractC25225BEi.A1X(r5, r4, r0)
            java.lang.Object r1 = r5.EEc()
            if (r0 != 0) goto L44
            java.lang.Object r0 = X.C5UI.A00
            if (r1 != r0) goto L4c
        L44:
            X.6Hw r1 = new X.6Hw
            r1.<init>(r4)
            r5.FBy(r1)
        L4c:
            X.6Hw r1 = (X.C136936Hw) r1
            X.5Tk r5 = (X.C117505Tk) r5
            boolean r0 = X.AbstractC25227BEk.A1b(r5, r3)
            if (r0 == 0) goto L5c
            r0 = 1068876127(0x3fb5c15f, float:1.4199637)
            X.C0fH.A00(r0)
        L5c:
            X.C117505Tk.A0L(r5, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28032CXg.A00(X.5Tl, java.lang.Object, int):X.6Hw");
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, C136936Hw c136936Hw, String str, InterfaceC16620sF interfaceC16620sF, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        String str2 = str;
        Modifier modifier2 = modifier;
        int A08 = AbstractC25230BEn.A08(0, c136936Hw, interfaceC16620sF);
        c5Tl.Enr(1487270732);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = AbstractC25232BEp.A0R(c5Tl, c136936Hw) | i2;
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
                C0fH.A01(-895775324, "com.instagram.barcelona.feed.video.MediaPlayerContainer (MediaPlayerContainer.kt:38)");
            }
            c5Tl.Eno(-1348002892);
            int i9 = i4 & 14;
            boolean A1P = AbstractC167007dF.A1P(i9, A08);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A0v(c5Tl, c136936Hw, 10);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5UX.A03(c5Tl, c136936Hw, (InterfaceC16660sJ) EEc);
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, A19, AbstractC25232BEp.A1U(c5Tl, -1347998383, i9, A08) | AbstractC167007dF.A1P(i4 & 896, 256), AbstractC25233BEq.A1K(i4));
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = new C43815JZc(A19, c136936Hw, str2, i5, 3);
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
                C0fH.A00(-862029432);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVC(c136936Hw, modifier2, interfaceC16620sF, str2, i5, i2, i3, 0);
        }
    }
}
