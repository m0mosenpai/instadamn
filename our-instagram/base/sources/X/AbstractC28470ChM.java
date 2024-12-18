package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallText;
import java.util.Arrays;

/* renamed from: X.ChM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28470ChM {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r2 >= 51) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C118125Vw A00(X.C5Tl r17, java.lang.CharSequence r18, boolean r19) {
        /*
            r8 = 0
            r2 = r18
            X.C14360o3.A0B(r2, r8)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L14
            r1 = -857343192(0xffffffffcce5fb28, float:-1.2057632E8)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.styleForText (Common.kt:69)"
            X.C0fH.A01(r1, r0)
        L14:
            int r2 = r2.length()
            r0 = 1
            if (r2 != r0) goto L56
            r1 = 36
        L1d:
            X.5Vw r4 = X.AbstractC25225BEi.A0X(r17)
            r11 = 0
            long r13 = X.AbstractC118155Vz.A01(r1)
            r3 = 0
            float r2 = (float) r1
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r2 = r2 * r0
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r15 = X.AbstractC118155Vz.A00(r2, r0)
            r10 = 15597565(0xedfffd, float:2.1856844E-38)
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r8
            X.5Vw r0 = X.C118125Vw.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15)
            r1 = r19 ^ 1
            if (r1 != 0) goto L49
            X.5Vw r0 = X.AbstractC25225BEi.A0X(r17)
        L49:
            boolean r1 = X.C0fH.A02()
            if (r1 == 0) goto L55
            r1 = -1180123269(0xffffffffb9a8bf7b, float:-3.218612E-4)
            X.C0fH.A00(r1)
        L55:
            return r0
        L56:
            r1 = 2
            r0 = 21
            if (r1 > r2) goto L66
            if (r2 >= r0) goto L60
            r1 = 28
            goto L1d
        L60:
            r0 = 51
            r1 = 22
            if (r2 < r0) goto L1d
        L66:
            r1 = 18
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28470ChM.A00(X.5Tl, java.lang.CharSequence, boolean):X.5Vw");
    }

    public static final String A02(C5Tl c5Tl, WallText wallText) {
        String A01;
        C14360o3.A0B(wallText, 0);
        if (C0fH.A02()) {
            C0fH.A01(1127523867, "com.instagram.wonderwall.ui.compose.components.value (Common.kt:117)");
        }
        if (wallText instanceof WallText.Raw) {
            A01 = ((WallText.Raw) wallText).A00;
        } else if (wallText instanceof WallText.Res) {
            WallText.Res res = (WallText.Res) wallText;
            int i = res.A00;
            String[] strArr = res.A01;
            A01 = AbstractC136736Hc.A01(c5Tl, Arrays.copyOf(strArr, strArr.length), i);
        } else {
            throw B4Z.A00();
        }
        if (C0fH.A02()) {
            C0fH.A00(-1551845982);
        }
        return A01;
    }

    public static final void A03(C5Tl c5Tl, Modifier modifier, C2DC c2dc, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        long A02;
        Modifier modifier2 = modifier;
        AbstractC167007dF.A1E(c2dc, 0, interfaceC16820sZ);
        c5Tl.Enr(1348330874);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c2dc) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-16239262, "com.instagram.wonderwall.ui.compose.components.IconButtonOnMedia (Common.kt:43)");
            }
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, 2019989951);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A0C = AbstractC118185Wd.A0C(C5XR.A04(c5xo, AbstractC118645Yd.A00(c5xo, modifier2, 0.3f, true), interfaceC16820sZ), 26.0f);
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(C5XL.A00(c5Tl).A0c), 0.6f);
            Modifier A01 = C6L3.A01(A0C, C5WF.A00, A02);
            InterfaceC1127857k A0a = AbstractC25226BEj.A0a(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A01);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5YS.A08(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, 12.0f), c2dc, str, (i3 & 14) | 384 | (i3 & 112), AbstractC25233BEq.A07(c5Tl, AbstractC25226BEj.A0D(c5Tl)));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(2027568236);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUR(c2dc, modifier2, interfaceC16820sZ, str, i, i2, 5);
        }
    }

    public static final void A04(C5Tl c5Tl, C27915CSa c27915CSa, int i) {
        int i2;
        String A00;
        C14360o3.A0B(c27915CSa, 0);
        c5Tl.Enr(980993503);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c27915CSa, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-329791675, "com.instagram.wonderwall.ui.compose.components.WallDialog (Common.kt:88)");
            }
            InterfaceC16820sZ interfaceC16820sZ = c27915CSa.A04;
            Integer num = c27915CSa.A03;
            c5Tl.Eno(1892521006);
            String str = null;
            if (num == null) {
                A00 = null;
            } else {
                A00 = AbstractC136736Hc.A00(c5Tl, num.intValue());
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Integer num2 = c27915CSa.A02;
            c5Tl.Eno(1892522862);
            if (num2 != null) {
                str = AbstractC136736Hc.A00(c5Tl, num2.intValue());
            }
            C117505Tk.A0L(A0K, false);
            AbstractC28433Cgh.A03(c5Tl, A01(c5Tl, c27915CSa.A00), A01(c5Tl, c27915CSa.A01), A00, str, interfaceC16820sZ, 0, 3936);
            if (C0fH.A02()) {
                C0fH.A00(-540319847);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c27915CSa, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011b, code lost:
    
        if (r8 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r22.AH3(r0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C5Tl r22, com.instagram.wonderwall.model.WallImage r23, java.lang.String r24, float r25, int r26, int r27, long r28) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28470ChM.A05(X.5Tl, com.instagram.wonderwall.model.WallImage, java.lang.String, float, int, int, long):void");
    }

    public static final C26079Bg8 A01(C5Tl c5Tl, C27901CRm c27901CRm) {
        C26079Bg8 c26079Bg8;
        if (C0fH.A02()) {
            C0fH.A01(-1743215102, "com.instagram.wonderwall.ui.compose.components.dialogAction (Common.kt:104)");
        }
        if (c27901CRm == null) {
            c26079Bg8 = null;
        } else {
            c26079Bg8 = new C26079Bg8(c27901CRm.A01, A02(c5Tl, c27901CRm.A00), c27901CRm.A02, true);
        }
        if (C0fH.A02()) {
            C0fH.A00(-1519497444);
        }
        return c26079Bg8;
    }
}
